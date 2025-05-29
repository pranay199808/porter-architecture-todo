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
public final class DeleteEmployee_Factory implements Factory<DeleteEmployee> {
  private final Provider<EmployeeDetailsRepo> employeeDetailsRepoProvider;

  public DeleteEmployee_Factory(Provider<EmployeeDetailsRepo> employeeDetailsRepoProvider) {
    this.employeeDetailsRepoProvider = employeeDetailsRepoProvider;
  }

  @Override
  public DeleteEmployee get() {
    return newInstance(employeeDetailsRepoProvider.get());
  }

  public static DeleteEmployee_Factory create(
      Provider<EmployeeDetailsRepo> employeeDetailsRepoProvider) {
    return new DeleteEmployee_Factory(employeeDetailsRepoProvider);
  }

  public static DeleteEmployee newInstance(EmployeeDetailsRepo employeeDetailsRepo) {
    return new DeleteEmployee(employeeDetailsRepo);
  }
}
