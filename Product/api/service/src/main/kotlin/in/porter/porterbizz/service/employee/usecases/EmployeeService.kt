package `in`.porter.porterbizz.service.employee.usecases

import `in`.porter.employee.apimodels.employee.usecases.entities.Employee
import `in`.porter.employee.apimodels.employee.usecases.entities.PaginationRequest
import `in`.porter.employee.apimodels.employee.usecases.entities.PaginatedResponse
import `in`.porter.employee.domain.usecases.GetEmployeeDetails
import `in`.porter.employee.domain.usecases.UpdateEmployee
import `in`.porter.porterbizz.domain.employee.exceptions.EmployeeNotFoundException
import `in`.porter.porterbizz.domain.employee.usecases.CreateEmployee
import `in`.porter.porterbizz.domain.employee.usecases.DeleteEmployee
import `in`.porter.porterbizz.service.employee.exceptions.EmployeeApiException
import `in`.porter.porterbizz.service.employee.mapper.EmployeeMapper
import `in`.porter.porterbizz.service.employee.mapper.PaginationRequestMapper
import javax.inject.Inject

class EmployeeService
@Inject
constructor(
    private val getEmployeeDetails: GetEmployeeDetails,
    private val createEmployee: CreateEmployee,
    private val updateEmployee: UpdateEmployee,
    private val deleteEmployee: DeleteEmployee,
    private val mapper: EmployeeMapper,
    private val paginationMapper: PaginationRequestMapper
) {
    suspend fun getEmployee(id: Int): Employee {
        try {
            return getEmployeeDetails.invoke(id)
                .let { mapper.fromDomainModel(it) }
        } catch (e: Exception) {
            throw toApiException(e)
        }
    }

    suspend fun getAllEmployees(paginationRequest: PaginationRequest): PaginatedResponse<Employee> {
        try {

            return getEmployeeDetails.invoke(paginationMapper.toDomain(paginationRequest))
                .let { response ->
                    PaginatedResponse(
                        items = response.items.map { mapper.fromDomainModel(it) },
                        total = response.total,
                        page = response.page,
                        pageSize = response.pageSize,
                        totalPages = response.totalPages
                    )
                }
        } catch (e: Exception) {
            throw toApiException(e)
        }
    }

    suspend fun createEmployee(employee: Employee): Employee {
        try {

            val domainEmployee = createEmployee.invoke(mapper.toDomainModel(employee))
            println("Domain employee returned: $domainEmployee") // Debug log
            val apiEmployee = mapper.fromDomainModel(domainEmployee)
            println("Mapped API employee: $apiEmployee")
            return apiEmployee
        } catch (e: Exception) {
            throw toApiException(e)
        }
    }

    suspend fun updateEmployee(id: Int, employee: Employee): Employee {
        try {
            return updateEmployee.invoke(id, mapper.toDomainModel(employee))
                .let { mapper.fromDomainModel(it) }
        } catch (e: Exception) {
            throw toApiException(e)
        }
    }

    suspend fun deleteEmployee(id: Int) {
        try {
            deleteEmployee.invoke(id)
        } catch (e: Exception) {
            throw toApiException(e)
        }
    }

    private fun toApiException(e: Exception): Exception {
        return when (e) {
            is EmployeeNotFoundException -> EmployeeApiException.NotFound(e.message ?: "Employee not found")
            else -> EmployeeApiException.InternalError(e.message ?: "Internal server error")
        }
    }
}

