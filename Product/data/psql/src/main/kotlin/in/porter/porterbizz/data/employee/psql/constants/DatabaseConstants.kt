package `in`.porter.porterbizz.data.employee.psql.constants

object DatabaseConstants {
    object Tables {
        const val EMPLOYEE = "employees"
    }

    object Columns {
        const val ID = "id"
        const val FIRST_NAME = "first_name"
        const val LAST_NAME = "last_name"
        const val EMAIL = "email"
        const val DEPARTMENT = "department"
        const val POSITION = "position"
        const val SALARY = "salary"
        const val PHONE_NUMBER = "phone_number"
        const val DATE_OF_BIRTH = "date_of_birth"
        const val START_DATE = "start_date"
    }

    object Config {
        const val MAX_POOL_SIZE = 10
        const val AUTO_COMMIT = false
        const val TRANSACTION_ISOLATION = "TRANSACTION_REPEATABLE_READ"
        const val DEFAULT_DATABASE = "employee_db"
        const val DEFAULT_SCHEMA = "public"
        const val DEFAULT_USERNAME = "pranay.tajne"
        const val DEFAULT_PASSWORD = ""
        const val DEFAULT_PORT = 5432
        const val DEFAULT_HOST = "localhost"
        const val DEFAULT_URL = "jdbc:postgresql://localhost:5432/employee_db"
        const val DEFAULT_DRIVER = "org.postgresql.Driver"
        const val DEFAULT_MAX_LIFETIME = 30000
        const val DEFAULT_CONNECTION_TIMEOUT = 10000
    }
} 