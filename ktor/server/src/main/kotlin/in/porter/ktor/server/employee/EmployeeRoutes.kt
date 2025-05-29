package `in`.porter.ktor.server.employee

import io.ktor.server.routing.*
import io.ktor.server.application.*
import `in`.porter.ktor.server.employee.di.EmployeeHttpComponent

fun Route.employeeRoutes(httpComponent: EmployeeHttpComponent) {
    route("employees") {
        // Get all employees with pagination
        get {
            httpComponent.employeeHttpService.getAllEmployees(call)
        }

        // Create new employee
        post {
            httpComponent.employeeHttpService.createEmployee(call)
        }

        // Operations on specific employee by ID
        route("{id}") {
            // Get employee by ID
            get {
                httpComponent.employeeHttpService.getEmployee(call)
            }

            // Update employee
            put {
                httpComponent.employeeHttpService.updateEmployee(call)
            }

            // Delete employee
            delete {
                httpComponent.employeeHttpService.deleteEmployee(call)
            }
        }
    }
}
