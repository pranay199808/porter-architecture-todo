package `in`.porter.porterbizz.apimodels.employee.exceptions

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties("stack_trace", "cause", "suppressed", "localized_message")
open class EmployeeException(message: String) : Exception(message)
