# Employee Demo Porter Architecture

This project demonstrates a clean architecture approach for an employee management system with TODO functionality, following Porter's architectural patterns.

## Project Structure

```
employee-demo-porter-architecture/
├── commons/                    # Shared models and utilities
├── ktor/
│   ├── client/                # HTTP client implementation
│   │   ├── api/               # API interfaces
│   │   ├── config/            # Client configuration
│   │   ├── di/               # Dependency injection
│   │   └── impl/             # API implementations
│   └── server/                # Server implementation (TBD)
└── buildSrc/                  # Build configuration
```

## Features

- Employee management (CRUD operations)
- Todo management per employee
- Clean architecture with dependency injection
- Type-safe HTTP client using Ktor
- JSON serialization with Jackson

## Usage

### Client Configuration

```kotlin
val config = EmployeeClientConfig(
    protocol = "http",
    host = "localhost",
    port = 8080
)

val component = DaggerEmployeeClientComponent.builder()
    .config(config)
    .build()

// Access APIs
val employeeApi = component.employeeApi
val todoApi = component.todoApi

// Use the APIs
suspend fun example() {
    val employee = Employee(
        name = "John Doe",
        email = "john@example.com",
        department = "Engineering"
    )
    
    val createdEmployee = employeeApi.createEmployee(employee)
    
    val todo = Todo(
        employeeId = createdEmployee.id,
        title = "Complete project",
        description = "Finish the demo project",
        dueDate = Instant.now().plus(7, ChronoUnit.DAYS)
    )
    
    val createdTodo = todoApi.createTodo(todo)
}
```

## Dependencies

- Kotlin 1.9.20
- Ktor 2.3.7
- Dagger 2.48
- Jackson 2.15.3

## Building

```bash
./gradlew build
```

## Testing

```bash
./gradlew test
``` 