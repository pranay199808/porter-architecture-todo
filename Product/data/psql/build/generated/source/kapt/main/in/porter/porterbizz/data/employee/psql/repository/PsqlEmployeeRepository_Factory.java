package in.porter.porterbizz.data.employee.psql.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import in.porter.porterbizz.data.employee.psql.mapper.EmployeeMapper;
import in.porter.porterbizz.data.employee.psql.queries.EmployeeQueries;
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
public final class PsqlEmployeeRepository_Factory implements Factory<PsqlEmployeeRepository> {
  private final Provider<EmployeeMapper> mapperProvider;

  private final Provider<EmployeeQueries> queriesProvider;

  public PsqlEmployeeRepository_Factory(Provider<EmployeeMapper> mapperProvider,
      Provider<EmployeeQueries> queriesProvider) {
    this.mapperProvider = mapperProvider;
    this.queriesProvider = queriesProvider;
  }

  @Override
  public PsqlEmployeeRepository get() {
    return newInstance(mapperProvider.get(), queriesProvider.get());
  }

  public static PsqlEmployeeRepository_Factory create(Provider<EmployeeMapper> mapperProvider,
      Provider<EmployeeQueries> queriesProvider) {
    return new PsqlEmployeeRepository_Factory(mapperProvider, queriesProvider);
  }

  public static PsqlEmployeeRepository newInstance(EmployeeMapper mapper, EmployeeQueries queries) {
    return new PsqlEmployeeRepository(mapper, queries);
  }
}
