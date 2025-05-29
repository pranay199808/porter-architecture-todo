package in.porter.porterbizz.data.employee.psql.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import in.porter.porterbizz.data.employee.psql.mapper.EmployeeMapper;
import in.porter.porterbizz.data.employee.psql.queries.EmployeeQueries;
import in.porter.porterbizz.data.employee.psql.repository.PsqlEmployeeRepository;
import in.porter.porterbizz.data.employee.psql.repository.PsqlEmployeeRepository_Factory;
import in.porter.porterbizz.domain.employee.repos.EmployeeDetailsRepo;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.jetbrains.exposed.sql.Database;

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
public final class DaggerEmployeePsqlDataComponent {
  private DaggerEmployeePsqlDataComponent() {
  }

  public static EmployeePsqlDataComponent.Builder builder() {
    return new Builder();
  }

  public static EmployeePsqlDataComponent create() {
    return new Builder().build();
  }

  private static final class Builder implements EmployeePsqlDataComponent.Builder {
    @Override
    public EmployeePsqlDataComponent build() {
      return new EmployeePsqlDataComponentImpl(new EmployeePsqlHelperModule());
    }
  }

  private static final class EmployeePsqlDataComponentImpl implements EmployeePsqlDataComponent {
    private final EmployeePsqlDataComponentImpl employeePsqlDataComponentImpl = this;

    private Provider<EmployeeMapper> provideEmployeeMapperProvider;

    private Provider<Database> provideDatabaseProvider;

    private Provider<EmployeeQueries> provideEmployeeQueriesProvider;

    private Provider<PsqlEmployeeRepository> psqlEmployeeRepositoryProvider;

    private Provider<EmployeeDetailsRepo> bindEmployeeRepositoryProvider;

    private EmployeePsqlDataComponentImpl(EmployeePsqlHelperModule employeePsqlHelperModuleParam) {

      initialize(employeePsqlHelperModuleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final EmployeePsqlHelperModule employeePsqlHelperModuleParam) {
      this.provideEmployeeMapperProvider = EmployeePsqlHelperModule_ProvideEmployeeMapperFactory.create(employeePsqlHelperModuleParam);
      this.provideDatabaseProvider = DoubleCheck.provider(DatabaseModule_ProvideDatabaseFactory.create());
      this.provideEmployeeQueriesProvider = EmployeePsqlHelperModule_ProvideEmployeeQueriesFactory.create(employeePsqlHelperModuleParam, provideDatabaseProvider);
      this.psqlEmployeeRepositoryProvider = PsqlEmployeeRepository_Factory.create(provideEmployeeMapperProvider, provideEmployeeQueriesProvider);
      this.bindEmployeeRepositoryProvider = DoubleCheck.provider((Provider) psqlEmployeeRepositoryProvider);
    }

    @Override
    public EmployeeDetailsRepo getEmployeeRepository() {
      return bindEmployeeRepositoryProvider.get();
    }
  }
}
