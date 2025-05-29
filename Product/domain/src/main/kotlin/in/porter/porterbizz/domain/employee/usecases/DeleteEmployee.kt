package `in`.porter.porterbizz.domain.employee.usecases


import `in`.porter.porterbizz.domain.employee.exceptions.EmployeeNotFoundException
import `in`.porter.porterbizz.domain.employee.repos.EmployeeDetailsRepo
import javax.inject.Inject

class DeleteEmployee
@Inject
constructor(
    private val employeeDetailsRepo: EmployeeDetailsRepo
) {
    suspend fun invoke(id: Int) {
        // First check if employee exists
        employeeDetailsRepo.getEmployeeById(id) ?: throw EmployeeNotFoundException(id)
        employeeDetailsRepo.deleteEmployee(id)
    }
} 