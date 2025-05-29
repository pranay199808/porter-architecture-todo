package in.porter.ktor.server.employee.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import in.porter.ktor.server.employee.usecases.EmployeeHttpService;
import in.porter.porterbizz.service.employee.usecases.EmployeeService;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("in.porter.porterbizz.ktor.server.employee.di.EmployeeHttpScope")
@QualifierMetadata
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
public final class EmployeeHttpModule_ProvideEmployeeHttpServiceFactory implements Factory<EmployeeHttpService> {
  private final EmployeeHttpModule module;

  private final Provider<EmployeeService> employeeServiceProvider;

  public EmployeeHttpModule_ProvideEmployeeHttpServiceFactory(EmployeeHttpModule module,
      Provider<EmployeeService> employeeServiceProvider) {
    this.module = module;
    this.employeeServiceProvider = employeeServiceProvider;
  }

  @Override
  public EmployeeHttpService get() {
    return provideEmployeeHttpService(module, employeeServiceProvider.get());
  }

  public static EmployeeHttpModule_ProvideEmployeeHttpServiceFactory create(
      EmployeeHttpModule module, Provider<EmployeeService> employeeServiceProvider) {
    return new EmployeeHttpModule_ProvideEmployeeHttpServiceFactory(module, employeeServiceProvider);
  }

  public static EmployeeHttpService provideEmployeeHttpService(EmployeeHttpModule instance,
      EmployeeService employeeService) {
    return Preconditions.checkNotNullFromProvides(instance.provideEmployeeHttpService(employeeService));
  }
}
