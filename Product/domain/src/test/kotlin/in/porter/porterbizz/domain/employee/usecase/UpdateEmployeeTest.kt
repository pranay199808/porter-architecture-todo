package `in`.porter.porterbizz.domain.employee.usecase

import `in`.porter.employee.domain.usecases.UpdateEmployee
import `in`.porter.porterbizz.domain.employee.entities.Employee
import `in`.porter.porterbizz.domain.employee.exceptions.EmployeeNotFoundException
import `in`.porter.porterbizz.domain.employee.repos.EmployeeDetailsRepo
import `in`.porter.porterbizz.domain.employee.usecase.utils.shouldThrowSuspend
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class UpdateEmployeeTest {

    private val repo: EmployeeDetailsRepo = mockk()
    private lateinit var useCase: UpdateEmployee

    private val id = 1
    private val input = Employee(
        id = id,
        firstName = "Updated",
        lastName = "Name",
        email = "updated@example.com",
        department = "IT",
        position = "Lead",
        salary = 95000.0
    )

    @BeforeEach
    fun setup() {
        useCase = UpdateEmployee(repo)
    }

    @Test
    fun `should update and return the employee when exists`() = runBlocking {
        coEvery { repo.getEmployeeById(id) } returns input
        coEvery { repo.updateEmployee(id, input) } returns input

        val result = useCase.invoke(id, input)

        result shouldBeEqualTo input
        coVerify(exactly = 1) { repo.updateEmployee(id, input) }
    }

    @Test
    fun `should throw EmployeeNotFoundException when employee does not exist`() = runBlocking {
        coEvery { repo.getEmployeeById(id) } returns null

        shouldThrowSuspend<EmployeeNotFoundException> {
            useCase.invoke(id, input)
        }

        coVerify(exactly = 0) { repo.updateEmployee(any(), any()) }
    }
}

