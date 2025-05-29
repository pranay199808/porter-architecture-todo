package in.porter.porterbizz.domain.employee.usecases;

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
public final class CreateEmployee_Factory implements Factory<CreateEmployee> {
  private final Provider<EmployeeDetailsRepo> employeeDetailsRepoProvider;

  public CreateEmployee_Factory(Provider<EmployeeDetailsRepo> employeeDetailsRepoProvider) {
    this.employeeDetailsRepoProvider = employeeDetailsRepoProvider;
  }

  @Override
  public CreateEmployee get() {
    return newInstance(employeeDetailsRepoProvider.get());
  }

  public static CreateEmployee_Factory create(
      Provider<EmployeeDetailsRepo> employeeDetailsRepoProvider) {
    return new CreateEmployee_Factory(employeeDetailsRepoProvider);
  }

  public static CreateEmployee newInstance(EmployeeDetailsRepo employeeDetailsRepo) {
    return new CreateEmployee(employeeDetailsRepo);
  }
}
