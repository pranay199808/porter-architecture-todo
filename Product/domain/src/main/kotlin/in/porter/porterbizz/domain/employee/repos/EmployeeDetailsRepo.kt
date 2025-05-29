package `in`.porter.porterbizz.domain.employee.repos


import `in`.porter.porterbizz.domain.employee.entities.Employee
import `in`.porter.porterbizz.domain.employee.entities.PaginatedResponse
import `in`.porter.porterbizz.domain.employee.entities.PaginationRequest


interface EmployeeDetailsRepo {
  suspend fun getAllEmployees(pagination: PaginationRequest): PaginatedResponse<Employee>
  suspend fun getEmployeeById(id: Int): Employee?
  suspend fun createEmployee(employee: Employee): Employee
  suspend fun updateEmployee(id: Int, employee: Employee): Employee
  suspend fun deleteEmployee(id: Int)
}
