package `in`.porter.porterbizz.domain.employee.usecase

import `in`.porter.porterbizz.domain.employee.usecases.CreateEmployee


import `in`.porter.porterbizz.domain.employee.entities.Employee
import `in`.porter.porterbizz.domain.employee.repos.EmployeeDetailsRepo
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class CreateEmployeeTest {

    private val employeeRepo: EmployeeDetailsRepo = mockk()
    private lateinit var createEmployee: CreateEmployee

    @BeforeEach
    fun setup() {
        createEmployee = CreateEmployee(employeeRepo)
    }

    @Test
    fun `should create a new employee and return with generated ID`() = runBlocking {
        val input = Employee(
            id = 0,
            firstName = "Jane",
            lastName = "Smith",
            email = "jane.smith@example.com",
            department = "HR",
            position = "Manager",
            salary = 85000.0,
            phoneNumber = "8888888888",
            dateOfBirth = "1985-07-15",
            startDate = "2024-08-01"
        )

        val expected = input.copy(id = 31)

        coEvery { employeeRepo.createEmployee(input) } returns expected

        val result = createEmployee.invoke(input)

        assertEquals(expected, result)
    }
}
