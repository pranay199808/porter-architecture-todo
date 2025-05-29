package `in`.porter.porterbizz.domain.employee.usecase

import `in`.porter.porterbizz.domain.employee.entities.Employee
import `in`.porter.porterbizz.domain.employee.exceptions.EmployeeNotFoundException
import `in`.porter.porterbizz.domain.employee.repos.EmployeeDetailsRepo
import `in`.porter.porterbizz.domain.employee.usecases.DeleteEmployee
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class DeleteEmployeeTest {

    private val employeeDetailsRepo: EmployeeDetailsRepo = mockk()
    private lateinit var deleteEmployee: DeleteEmployee

    @BeforeEach
    fun setup() {
        deleteEmployee = DeleteEmployee(employeeDetailsRepo)
    }

    @Test
    fun `should delete employee when exists`() = runBlocking {
        val employeeId = 1
        val employee = Employee(
            id = employeeId,
            firstName = "John",
            lastName = "Doe",
            email = "john@example.com",
            department = "IT",
            position = "Engineer",
            salary = 60000.0
        )

        coEvery { employeeDetailsRepo.getEmployeeById(employeeId) } returns employee
        coEvery { employeeDetailsRepo.deleteEmployee(employeeId) } returns Unit

        deleteEmployee.invoke(employeeId)

        coVerify(exactly = 1) { employeeDetailsRepo.getEmployeeById(employeeId) }
        coVerify(exactly = 1) { employeeDetailsRepo.deleteEmployee(employeeId) }
    }

    @Test
    fun `should throw EmployeeNotFoundException when employee does not exist`() = runBlocking {
        val employeeId = 999

        coEvery { employeeDetailsRepo.getEmployeeById(employeeId) } returns null

        try {
            deleteEmployee.invoke(employeeId)
            assert(false) { "Expected EmployeeNotFoundException to be thrown" }
        } catch (ex: EmployeeNotFoundException) {
            // test passes
            assert(ex.message?.contains(employeeId.toString()) == true)
        }

        coVerify(exactly = 1) { employeeDetailsRepo.getEmployeeById(employeeId) }
        coVerify(exactly = 0) { employeeDetailsRepo.deleteEmployee(any()) }
    }
}
