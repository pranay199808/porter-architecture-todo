package com.porter.employee.model

import java.time.Instant
import java.util.UUID

data class Employee(
    val id: UUID = UUID.randomUUID(),
    val name: String,
    val email: String,
    val department: String,
    val createdAt: Instant = Instant.now(),
    val updatedAt: Instant = Instant.now()
)

data class Todo(
    val id: UUID = UUID.randomUUID(),
    val employeeId: UUID,
    val title: String,
    val description: String,
    val status: TodoStatus = TodoStatus.PENDING,
    val dueDate: Instant,
    val createdAt: Instant = Instant.now(),
    val updatedAt: Instant = Instant.now()
)

enum class TodoStatus {
    PENDING,
    IN_PROGRESS,
    COMPLETED,
    CANCELLED
} 