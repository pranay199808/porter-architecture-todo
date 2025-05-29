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
public final class GetEmployeeDetails_Factory implements Factory<GetEmployeeDetails> {
  private final Provider<EmployeeDetailsRepo> employeeDetailsRepoProvider;

  public GetEmployeeDetails_Factory(Provider<EmployeeDetailsRepo> employeeDetailsRepoProvider) {
    this.employeeDetailsRepoProvider = employeeDetailsRepoProvider;
  }

  @Override
  public GetEmployeeDetails get() {
    return newInstance(employeeDetailsRepoProvider.get());
  }

  public static GetEmployeeDetails_Factory create(
      Provider<EmployeeDetailsRepo> employeeDetailsRepoProvider) {
    return new GetEmployeeDetails_Factory(employeeDetailsRepoProvider);
  }

  public static GetEmployeeDetails newInstance(EmployeeDetailsRepo employeeDetailsRepo) {
    return new GetEmployeeDetails(employeeDetailsRepo);
  }
}
