package `in`.porter.porterbizz.data.employee.psql.di


import dagger.BindsInstance
import dagger.Component
import `in`.porter.porterbizz.domain.employee.repos.EmployeeDetailsRepo
import org.jetbrains.exposed.sql.Database
import javax.inject.Singleton


@Singleton
@Component(
  modules =
  [
    EmployeePsqlModule::class, EmployeePsqlHelperModule::class,DatabaseModule::class
  ]
)
interface EmployeePsqlDataComponent {

  val employeeRepository: EmployeeDetailsRepo

  @Component.Builder
  interface Builder {

    fun build(): EmployeePsqlDataComponent

  }

}
