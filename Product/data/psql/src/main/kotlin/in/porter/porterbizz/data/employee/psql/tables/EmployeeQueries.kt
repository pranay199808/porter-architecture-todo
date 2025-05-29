package `in`.porter.porterbizz.data.employee.psql.queries

import `in`.porter.porterbizz.data.employee.psql.model.EmployeeRecord
import `in`.porter.porterbizz.data.employee.psql.tables.EmployeeTable
import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq

import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction
import javax.inject.Inject

class EmployeeQueries
@Inject
constructor(
    private val database: Database
) {
    suspend fun getById(id: Int): EmployeeRecord? = transaction(database) {
        EmployeeTable.select { EmployeeTable.id eq id }
            .singleOrNull()
            ?.let { resultRow -> mapToRecord(resultRow) }
    }

    suspend fun getAll(page: Int, pageSize: Int): List<EmployeeRecord> = transaction(database) {
        EmployeeTable.selectAll()
            .orderBy(EmployeeTable.id)
            .limit(pageSize, offset = ((page - 1) * pageSize).toLong())
            .map { resultRow -> mapToRecord(resultRow) }
    }

    suspend fun create(record: EmployeeRecord): EmployeeRecord = transaction(database) {
        val id = EmployeeTable.insert {
            it[name] = record.name
            it[email] = record.email
            it[designation] = record.designation
            it[department] = record.department
            it[salary] = record.salary
            it[joinDate] = record.joinDate
            it[isActive] = record.isActive
            it[createdAt] = record.createdAt
            it[updatedAt] = record.updatedAt
        } get EmployeeTable.id

        record.copy(id = id)
    }

    suspend fun update(record: EmployeeRecord): EmployeeRecord? = transaction(database) {
        val updated = EmployeeTable.update({ EmployeeTable.id eq record.id }) {
            it[name] = record.name
            it[email] = record.email
            it[designation] = record.designation
            it[department] = record.department
            it[salary] = record.salary
            it[joinDate] = record.joinDate
            it[isActive] = record.isActive
            it[updatedAt] = record.updatedAt
        }

        if (updated > 0) record else null
    }

    suspend fun delete(id: Int): Boolean = transaction(database) {
        EmployeeTable.deleteWhere { EmployeeTable.id eq id } > 0
    }

    suspend fun findByEmail(email: String): EmployeeRecord? = transaction(database) {
        EmployeeTable.select { EmployeeTable.email eq email }
            .singleOrNull()
            ?.let { resultRow -> mapToRecord(resultRow) }
    }

    suspend fun count(): Long = transaction(database) {
        EmployeeTable.selectAll().count()
    }

    private fun mapToRecord(row: ResultRow): EmployeeRecord = EmployeeRecord(
        id = row[EmployeeTable.id],
        name = row[EmployeeTable.name],
        email = row[EmployeeTable.email],
        designation = row[EmployeeTable.designation],
        department = row[EmployeeTable.department],
        salary = row[EmployeeTable.salary],
        joinDate = row[EmployeeTable.joinDate],
        isActive = row[EmployeeTable.isActive],
        createdAt = row[EmployeeTable.createdAt],
        updatedAt = row[EmployeeTable.updatedAt]
    )
} 