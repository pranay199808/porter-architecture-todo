package in.porter.porterbizz.service.employee.usecases;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import in.porter.employee.domain.usecases.GetEmployeeDetails;
import in.porter.employee.domain.usecases.UpdateEmployee;
import in.porter.porterbizz.domain.employee.usecases.CreateEmployee;
import in.porter.porterbizz.domain.employee.usecases.DeleteEmployee;
import in.porter.porterbizz.service.employee.mapper.EmployeeMapper;
import in.porter.porterbizz.service.employee.mapper.PaginationRequestMapper;
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
public final class EmployeeService_Factory implements Factory<EmployeeService> {
  private final Provider<GetEmployeeDetails> getEmployeeDetailsProvider;

  private final Provider<CreateEmployee> createEmployeeProvider;

  private final Provider<UpdateEmployee> updateEmployeeProvider;

  private final Provider<DeleteEmployee> deleteEmployeeProvider;

  private final Provider<EmployeeMapper> mapperProvider;

  private final Provider<PaginationRequestMapper> paginationMapperProvider;

  public EmployeeService_Factory(Provider<GetEmployeeDetails> getEmployeeDetailsProvider,
      Provider<CreateEmployee> createEmployeeProvider,
      Provider<UpdateEmployee> updateEmployeeProvider,
      Provider<DeleteEmployee> deleteEmployeeProvider, Provider<EmployeeMapper> mapperProvider,
      Provider<PaginationRequestMapper> paginationMapperProvider) {
    this.getEmployeeDetailsProvider = getEmployeeDetailsProvider;
    this.createEmployeeProvider = createEmployeeProvider;
    this.updateEmployeeProvider = updateEmployeeProvider;
    this.deleteEmployeeProvider = deleteEmployeeProvider;
    this.mapperProvider = mapperProvider;
    this.paginationMapperProvider = paginationMapperProvider;
  }

  @Override
  public EmployeeService get() {
    return newInstance(getEmployeeDetailsProvider.get(), createEmployeeProvider.get(), updateEmployeeProvider.get(), deleteEmployeeProvider.get(), mapperProvider.get(), paginationMapperProvider.get());
  }

  public static EmployeeService_Factory create(
      Provider<GetEmployeeDetails> getEmployeeDetailsProvider,
      Provider<CreateEmployee> createEmployeeProvider,
      Provider<UpdateEmployee> updateEmployeeProvider,
      Provider<DeleteEmployee> deleteEmployeeProvider, Provider<EmployeeMapper> mapperProvider,
      Provider<PaginationRequestMapper> paginationMapperProvider) {
    return new EmployeeService_Factory(getEmployeeDetailsProvider, createEmployeeProvider, updateEmployeeProvider, deleteEmployeeProvider, mapperProvider, paginationMapperProvider);
  }

  public static EmployeeService newInstance(GetEmployeeDetails getEmployeeDetails,
      CreateEmployee createEmployee, UpdateEmployee updateEmployee, DeleteEmployee deleteEmployee,
      EmployeeMapper mapper, PaginationRequestMapper paginationMapper) {
    return new EmployeeService(getEmployeeDetails, createEmployee, updateEmployee, deleteEmployee, mapper, paginationMapper);
  }
}
