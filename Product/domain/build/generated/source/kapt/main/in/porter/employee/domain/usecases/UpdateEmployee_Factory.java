package in.porter.employee.domain.usecases;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import in.porter.porterbizz.domain.employee.repos.EmployeeDetailsRepo;
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
public final class UpdateEmployee_Factory implements Factory<UpdateEmployee> {
  private final Provider<EmployeeDetailsRepo> employeeDetailsRepoProvider;

  public UpdateEmployee_Factory(Provider<EmployeeDetailsRepo> employeeDetailsRepoProvider) {
    this.employeeDetailsRepoProvider = employeeDetailsRepoProvider;
  }

  @Override
  public UpdateEmployee get() {
    return newInstance(employeeDetailsRepoProvider.get());
  }

  public static UpdateEmployee_Factory create(
      Provider<EmployeeDetailsRepo> employeeDetailsRepoProvider) {
    return new UpdateEmployee_Factory(employeeDetailsRepoProvider);
  }

  public static UpdateEmployee newInstance(EmployeeDetailsRepo employeeDetailsRepo) {
    return new UpdateEmployee(employeeDetailsRepo);
  }
}
