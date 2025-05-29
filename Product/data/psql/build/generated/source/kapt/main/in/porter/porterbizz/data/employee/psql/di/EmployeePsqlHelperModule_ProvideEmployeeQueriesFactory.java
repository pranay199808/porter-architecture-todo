package in.porter.porterbizz.data.employee.psql.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import in.porter.porterbizz.data.employee.psql.queries.EmployeeQueries;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import org.jetbrains.exposed.sql.Database;

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
public final class EmployeePsqlHelperModule_ProvideEmployeeQueriesFactory implements Factory<EmployeeQueries> {
  private final EmployeePsqlHelperModule module;

  private final Provider<Database> databaseProvider;

  public EmployeePsqlHelperModule_ProvideEmployeeQueriesFactory(EmployeePsqlHelperModule module,
      Provider<Database> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public EmployeeQueries get() {
    return provideEmployeeQueries(module, databaseProvider.get());
  }

  public static EmployeePsqlHelperModule_ProvideEmployeeQueriesFactory create(
      EmployeePsqlHelperModule module, Provider<Database> databaseProvider) {
    return new EmployeePsqlHelperModule_ProvideEmployeeQueriesFactory(module, databaseProvider);
  }

  public static EmployeeQueries provideEmployeeQueries(EmployeePsqlHelperModule instance,
      Database database) {
    return Preconditions.checkNotNullFromProvides(instance.provideEmployeeQueries(database));
  }
}
