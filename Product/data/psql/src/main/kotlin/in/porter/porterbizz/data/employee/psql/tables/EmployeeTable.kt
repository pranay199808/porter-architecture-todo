package `in`.porter.porterbizz.data.employee.psql.tables

import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.javatime.datetime
import java.time.LocalDateTime

object EmployeeTable : Table("employees") {
    val id = integer("id").autoIncrement()
    val name = varchar("name", 255)
    val email = varchar("email", 255).uniqueIndex()
    val designation = varchar("designation", 100)
    val department = varchar("department", 100)
    val salary = decimal("salary", 10, 2)
    val joinDate = datetime("join_date").default(LocalDateTime.now())
    val isActive = bool("is_active").default(true)
    val createdAt = datetime("created_at").default(LocalDateTime.now())
    val updatedAt = datetime("updated_at").default(LocalDateTime.now())

    override val primaryKey = PrimaryKey(id)
}
