package `in`.porter.ktor.server.employee.di

import dagger.Component
import `in`.porter.porterbizz.data.employee.psql.di.EmployeePsqlDataComponent
import `in`.porter.ktor.server.employee.usecases.EmployeeHttpService

@EmployeeHttpScope
@Component(
    dependencies = [
        EmployeePsqlDataComponent::class
    ],
    modules = [
        EmployeeHttpModule::class]
)


interface EmployeeHttpComponent {
    val employeeHttpService: EmployeeHttpService

    @Component.Factory
    interface Factory {
        fun create(
            employeeHttpModule: EmployeeHttpModule,
            employeePsqlDataComponent: EmployeePsqlDataComponent): EmployeeHttpComponent
    }
}
