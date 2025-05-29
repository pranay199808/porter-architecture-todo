package in.porter.porterbizz.data.employee.psql.queries;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
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
public final class EmployeeQueries_Factory implements Factory<EmployeeQueries> {
  private final Provider<Database> databaseProvider;

  public EmployeeQueries_Factory(Provider<Database> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public EmployeeQueries get() {
    return newInstance(databaseProvider.get());
  }

  public static EmployeeQueries_Factory create(Provider<Database> databaseProvider) {
    return new EmployeeQueries_Factory(databaseProvider);
  }

  public static EmployeeQueries newInstance(Database database) {
    return new EmployeeQueries(database);
  }
}
