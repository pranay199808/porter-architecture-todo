package `in`.porter.employee.domain.usecases


import `in`.porter.porterbizz.domain.employee.entities.Employee
import `in`.porter.porterbizz.domain.employee.entities.PaginatedResponse
import `in`.porter.porterbizz.domain.employee.entities.PaginationRequest
import `in`.porter.porterbizz.domain.employee.exceptions.EmployeeNotFoundException
import `in`.porter.porterbizz.domain.employee.repos.EmployeeDetailsRepo
import javax.inject.Inject

class GetEmployeeDetails
@Inject
constructor(
  private val employeeDetailsRepo: EmployeeDetailsRepo
) {
  suspend fun invoke(id: Int): Employee {
    return employeeDetailsRepo.getEmployeeById(id) ?: throw EmployeeNotFoundException(id)
  }

  suspend fun invoke(pagination: PaginationRequest): PaginatedResponse<Employee> {
    return employeeDetailsRepo.getAllEmployees(pagination)
  }
}