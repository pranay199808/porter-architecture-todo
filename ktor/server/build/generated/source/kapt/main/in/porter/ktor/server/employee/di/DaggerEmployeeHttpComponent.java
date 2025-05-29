package in.porter.ktor.server.employee.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import in.porter.employee.domain.usecases.GetEmployeeDetails;
import in.porter.employee.domain.usecases.GetEmployeeDetails_Factory;
import in.porter.employee.domain.usecases.UpdateEmployee;
import in.porter.employee.domain.usecases.UpdateEmployee_Factory;
import in.porter.porterbizz.data.employee.psql.di.EmployeePsqlDataComponent;
import in.porter.porterbizz.domain.employee.repos.EmployeeDetailsRepo;
import in.porter.porterbizz.domain.employee.usecases.CreateEmployee;
import in.porter.porterbizz.domain.employee.usecases.CreateEmployee_Factory;
import in.porter.porterbizz.domain.employee.usecases.DeleteEmployee;
import in.porter.porterbizz.domain.employee.usecases.DeleteEmployee_Factory;
import in.porter.ktor.server.employee.usecases.EmployeeHttpService;
import in.porter.porterbizz.service.employee.mapper.EmployeeMapper_Factory;
import in.porter.porterbizz.service.employee.mapper.PaginationRequestMapper_Factory;
import in.porter.porterbizz.service.employee.usecases.EmployeeService;
import in.porter.porterbizz.service.employee.usecases.EmployeeService_Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class DaggerEmployeeHttpComponent {
  private DaggerEmployeeHttpComponent() {
  }

  public static EmployeeHttpComponent.Factory factory() {
    return new Factory();
  }

  private static final class Factory implements EmployeeHttpComponent.Factory {
    @Override
    public EmployeeHttpComponent create(EmployeeHttpModule employeeHttpModule,
        EmployeePsqlDataComponent employeePsqlDataComponent) {
      Preconditions.checkNotNull(employeeHttpModule);
      Preconditions.checkNotNull(employeePsqlDataComponent);
      return new EmployeeHttpComponentImpl(employeeHttpModule, employeePsqlDataComponent);
    }
  }

  private static final class EmployeeHttpComponentImpl implements EmployeeHttpComponent {
    private final EmployeeHttpComponentImpl employeeHttpComponentImpl = this;

    private Provider<EmployeeDetailsRepo> getEmployeeRepositoryProvider;

    private Provider<GetEmployeeDetails> getEmployeeDetailsProvider;

    private Provider<CreateEmployee> createEmployeeProvider;

    private Provider<UpdateEmployee> updateEmployeeProvider;

    private Provider<DeleteEmployee> deleteEmployeeProvider;

    private Provider<EmployeeService> employeeServiceProvider;

    private Provider<EmployeeHttpService> provideEmployeeHttpServiceProvider;

    private EmployeeHttpComponentImpl(EmployeeHttpModule employeeHttpModuleParam,
        EmployeePsqlDataComponent employeePsqlDataComponentParam) {

      initialize(employeeHttpModuleParam, employeePsqlDataComponentParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final EmployeeHttpModule employeeHttpModuleParam,
        final EmployeePsqlDataComponent employeePsqlDataComponentParam) {
      this.getEmployeeRepositoryProvider = new GetEmployeeRepositoryProvider(employeePsqlDataComponentParam);
      this.getEmployeeDetailsProvider = GetEmployeeDetails_Factory.create(getEmployeeRepositoryProvider);
      this.createEmployeeProvider = CreateEmployee_Factory.create(getEmployeeRepositoryProvider);
      this.updateEmployeeProvider = UpdateEmployee_Factory.create(getEmployeeRepositoryProvider);
      this.deleteEmployeeProvider = DeleteEmployee_Factory.create(getEmployeeRepositoryProvider);
      this.employeeServiceProvider = EmployeeService_Factory.create(getEmployeeDetailsProvider, createEmployeeProvider, updateEmployeeProvider, deleteEmployeeProvider, EmployeeMapper_Factory.create(), PaginationRequestMapper_Factory.create());
      this.provideEmployeeHttpServiceProvider = DoubleCheck.provider(EmployeeHttpModule_ProvideEmployeeHttpServiceFactory.create(employeeHttpModuleParam, employeeServiceProvider));
    }

    @Override
    public EmployeeHttpService getEmployeeHttpService() {
      return provideEmployeeHttpServiceProvider.get();
    }

    private static final class GetEmployeeRepositoryProvider implements Provider<EmployeeDetailsRepo> {
      private final EmployeePsqlDataComponent employeePsqlDataComponent;

      GetEmployeeRepositoryProvider(EmployeePsqlDataComponent employeePsqlDataComponent) {
        this.employeePsqlDataComponent = employeePsqlDataComponent;
      }

      @Override
      public EmployeeDetailsRepo get() {
        return Preconditions.checkNotNullFromComponent(employeePsqlDataComponent.getEmployeeRepository());
      }
    }
  }
}
