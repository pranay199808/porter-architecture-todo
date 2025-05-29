package `in`.porter.porterbizz.data.employee.psql.model

import java.math.BigDecimal
import java.time.LocalDateTime

data class EmployeeRecord(
    val id: Int = 0,
    val name: String,
    val email: String,
    val designation: String,
    val department: String,
    val salary: BigDecimal,
    val joinDate: LocalDateTime,
    val isActive: Boolean,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
) 