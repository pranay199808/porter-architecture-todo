package `in`.porter.porterbizz.service.employee.exceptions

sealed class EmployeeApiException(message: String) : RuntimeException(message) {
    class NotFound(message: String) : EmployeeApiException(message)
    class InternalError(message: String) : EmployeeApiException(message)
    class ValidationError(message: String) : EmployeeApiException(message)
    class AlreadyExists(message: String) : EmployeeApiException(message)
} 