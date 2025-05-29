package `in`.porter.employee.domain.usecases


import `in`.porter.porterbizz.domain.employee.entities.Employee
import `in`.porter.porterbizz.domain.employee.exceptions.EmployeeNotFoundException
import `in`.porter.porterbizz.domain.employee.repos.EmployeeDetailsRepo
import javax.inject.Inject

class UpdateEmployee
@Inject
constructor(
    private val employeeDetailsRepo: EmployeeDetailsRepo
) {
    suspend fun invoke(id: Int, employee: Employee): Employee {
        // First check if employee exists
        employeeDetailsRepo.getEmployeeById(id) ?: throw EmployeeNotFoundException(id)
        return employeeDetailsRepo.updateEmployee(id, employee)
    }
}