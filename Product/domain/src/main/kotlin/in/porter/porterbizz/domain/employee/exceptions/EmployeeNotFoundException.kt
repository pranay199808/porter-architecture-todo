package `in`.porter.porterbizz.domain.employee.exceptions

class EmployeeNotFoundException(id: Int) : RuntimeException("Employee not found with id: $id") 