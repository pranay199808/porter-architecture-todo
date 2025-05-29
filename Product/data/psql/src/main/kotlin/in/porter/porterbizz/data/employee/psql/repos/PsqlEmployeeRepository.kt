package `in`.porter.porterbizz.data.employee.psql.repository

import `in`.porter.porterbizz.data.employee.psql.mapper.EmployeeMapper
import `in`.porter.porterbizz.data.employee.psql.queries.EmployeeQueries
import `in`.porter.porterbizz.domain.employee.entities.Employee
import `in`.porter.porterbizz.domain.employee.entities.PaginatedResponse
import `in`.porter.porterbizz.domain.employee.entities.PaginationRequest
import `in`.porter.porterbizz.domain.employee.repos.EmployeeDetailsRepo
import `in`.porter.porterbizz.domain.employee.exceptions.EmployeeNotFoundException
import javax.inject.Inject

class PsqlEmployeeRepository
@Inject
constructor(
    private val mapper: EmployeeMapper,
    private val queries: EmployeeQueries
) : EmployeeDetailsRepo {

    override suspend fun getAllEmployees(pagination: PaginationRequest): PaginatedResponse<Employee> {
        val employees = queries.getAll(pagination.page, pagination.pageSize)
            .map { mapper.fromRecord(it) }

        val totalCount = queries.count()
        val totalPages = ((totalCount + pagination.pageSize - 1) / pagination.pageSize).toInt()


        return PaginatedResponse(
            items = employees,
            total = totalCount,
            page = pagination.page,
            pageSize = pagination.pageSize,
            totalPages = totalPages
        )
    }

    override suspend fun getEmployeeById(id: Int): Employee {
        return queries.getById(id)
            ?.let { mapper.fromRecord(it) }
            ?: throw EmployeeNotFoundException(id)
    }

    override suspend fun createEmployee(employee: Employee): Employee {
        return mapper.toRecord(employee)
            .let { queries.create(it) }
            .let { mapper.fromRecord(it) }
    }

    override suspend fun updateEmployee(id: Int, employee: Employee): Employee {
        return mapper.toRecord(employee.copy(id = id))
            .let { queries.update(it) }
            ?.let { mapper.fromRecord(it) }
            ?: throw EmployeeNotFoundException(id)
    }

    override suspend fun deleteEmployee(id: Int) {
        if (!queries.delete(id)) {
            throw EmployeeNotFoundException(id)
        }
    }

    // Helper methods from previous implementation
    suspend fun findByEmail(email: String): Employee? {
        return queries.findByEmail(email)?.let { mapper.fromRecord(it) }
    }

    private suspend fun count(): Long {
        return queries.count()
    }
}