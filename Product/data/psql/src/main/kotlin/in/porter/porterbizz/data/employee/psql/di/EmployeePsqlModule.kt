package `in`.porter.porterbizz.data.employee.psql.di

import dagger.Binds
import dagger.Module
import `in`.porter.porterbizz.data.employee.psql.repository.PsqlEmployeeRepository
import `in`.porter.porterbizz.domain.employee.repos.EmployeeDetailsRepo
import javax.inject.Singleton

@Module
abstract class EmployeePsqlModule {
    @Binds
    @Singleton
    abstract fun bindEmployeeRepository(
        impl: PsqlEmployeeRepository
    ): EmployeeDetailsRepo
} 