package `in`.porter.ktor.server.employee.di

import dagger.Module
import dagger.Provides
import `in`.porter.ktor.server.employee.usecases.EmployeeHttpService
import `in`.porter.porterbizz.service.employee.usecases.EmployeeService

@Module
class EmployeeHttpModule {
    @Provides
    @EmployeeHttpScope
    fun provideEmployeeHttpService(employeeService: EmployeeService): EmployeeHttpService {
        return EmployeeHttpService(employeeService)
    }
} 