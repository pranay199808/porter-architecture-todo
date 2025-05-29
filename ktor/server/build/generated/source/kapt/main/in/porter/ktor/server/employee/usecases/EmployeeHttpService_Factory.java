package in.porter.ktor.server.employee.usecases;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import in.porter.porterbizz.service.employee.usecases.EmployeeService;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class EmployeeHttpService_Factory implements Factory<EmployeeHttpService> {
  private final Provider<EmployeeService> serviceProvider;

  public EmployeeHttpService_Factory(Provider<EmployeeService> serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  @Override
  public EmployeeHttpService get() {
    return newInstance(serviceProvider.get());
  }

  public static EmployeeHttpService_Factory create(Provider<EmployeeService> serviceProvider) {
    return new EmployeeHttpService_Factory(serviceProvider);
  }

  public static EmployeeHttpService newInstance(EmployeeService service) {
    return new EmployeeHttpService(service);
  }
}
