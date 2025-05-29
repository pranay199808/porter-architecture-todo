package `in`.porter.porterbizz.domain.employee.usecases

import `in`.porter.porterbizz.domain.employee.entities.Employee
import `in`.porter.porterbizz.domain.employee.repos.EmployeeDetailsRepo
import javax.inject.Inject

class CreateEmployee
@Inject
constructor(
    private val employeeDetailsRepo: EmployeeDetailsRepo
) {
    suspend fun invoke(employee: Employee): Employee {
        return employeeDetailsRepo.createEmployee(employee)
    }
}