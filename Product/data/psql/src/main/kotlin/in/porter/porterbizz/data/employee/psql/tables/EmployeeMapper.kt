package `in`.porter.porterbizz.data.employee.psql.mapper

import `in`.porter.porterbizz.data.employee.psql.model.EmployeeRecord
import `in`.porter.porterbizz.domain.employee.entities.Employee
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.math.BigDecimal
import java.time.LocalDate
import javax.inject.Inject

class EmployeeMapper
@Inject
constructor() {
    private val dateFormatter = DateTimeFormatter.ISO_DATE

    fun toRecord(employee: Employee): EmployeeRecord = EmployeeRecord(
        id = employee.id,
        name = "${employee.firstName} ${employee.lastName}".trim(),
        email = employee.email,
        designation = employee.position,
        department = employee.department,
        salary = BigDecimal.valueOf(employee.salary),
        joinDate = employee.startDate
            ?.let { LocalDate.parse(it, DateTimeFormatter.ISO_DATE).atStartOfDay() }
            ?: LocalDateTime.now()   ,
        isActive = true,
        createdAt = LocalDateTime.now(),
        updatedAt = LocalDateTime.now()
    )

    fun fromRecord(record: EmployeeRecord): Employee = Employee(
        id = record.id,
        firstName = record.name.split(" ").firstOrNull() ?: "",
        lastName = record.name.split(" ").drop(1).joinToString(" "),
        email = record.email,
        department = record.department,
        position = record.designation,
        salary = record.salary.toDouble(),
        startDate = record.joinDate.format(dateFormatter),
        phoneNumber = null,
        dateOfBirth = null
    )
}