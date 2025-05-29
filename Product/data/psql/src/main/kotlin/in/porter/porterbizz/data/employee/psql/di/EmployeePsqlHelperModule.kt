package `in`.porter.porterbizz.data.employee.psql.di

import dagger.Provides
import dagger.Module
import `in`.porter.porterbizz.data.employee.psql.mapper.EmployeeMapper
import `in`.porter.porterbizz.data.employee.psql.queries.EmployeeQueries
import org.jetbrains.exposed.sql.Database

@Module
class EmployeePsqlHelperModule {
    @Provides
    fun provideEmployeeMapper(): EmployeeMapper {
        return EmployeeMapper()
    }

    @Provides
    fun provideEmployeeQueries(database: Database): EmployeeQueries {
        return EmployeeQueries(database)
    }
}
