package `in`.porter.porterbizz.domain.employee.usecase

import `in`.porter.employee.domain.usecases.GetEmployeeDetails
import `in`.porter.porterbizz.domain.employee.entities.Employee
import `in`.porter.porterbizz.domain.employee.entities.PaginatedResponse
import `in`.porter.porterbizz.domain.employee.entities.PaginationRequest
import `in`.porter.porterbizz.domain.employee.exceptions.EmployeeNotFoundException
import `in`.porter.porterbizz.domain.employee.repos.EmployeeDetailsRepo
import `in`.porter.porterbizz.domain.employee.usecase.utils.shouldThrowSuspend
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.amshove.kluent.shouldBeEqualTo

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class GetEmployeeDetailsTest {

    private val repo: EmployeeDetailsRepo = mockk()
    private lateinit var useCase: GetEmployeeDetails

    private val employee = Employee(
        id = 1,
        firstName = "Alice",
        lastName = "Smith",
        email = "alice@example.com",
        department = "Finance",
        position = "Analyst",
        salary = 75000.0
    )

    @BeforeEach
    fun setup() {
        useCase = GetEmployeeDetails(repo)
    }

    @Test
    fun `should return employee when found by ID`(): Unit = runBlocking {
        coEvery { repo.getEmployeeById(1) } returns employee

        val result = useCase.invoke(1)

        result shouldBeEqualTo employee
    }

    @Test
    fun `should throw EmployeeNotFoundException when employee not found by ID`(): Unit = runBlocking {
        coEvery { repo.getEmployeeById(99) } returns null

        shouldThrowSuspend<EmployeeNotFoundException> {
            useCase.invoke(99)
        }
    }

    @Test
    fun `should return paginated employees`(): Unit = runBlocking {
        val request = PaginationRequest(page = 1, pageSize = 10)
        val paginatedResponse = PaginatedResponse(
            items = listOf(employee),
            total = 1,
            page = 1,
            pageSize = 10,
            totalPages = 1
        )

        coEvery { repo.getAllEmployees(request) } returns paginatedResponse

        val result = useCase.invoke(request)

        result shouldBeEqualTo paginatedResponse
    }
}