package in.porter.porterbizz.data.employee.psql.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import in.porter.porterbizz.data.employee.psql.mapper.EmployeeMapper;
import javax.annotation.processing.Generated;

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
public final class EmployeePsqlHelperModule_ProvideEmployeeMapperFactory implements Factory<EmployeeMapper> {
  private final EmployeePsqlHelperModule module;

  public EmployeePsqlHelperModule_ProvideEmployeeMapperFactory(EmployeePsqlHelperModule module) {
    this.module = module;
  }

  @Override
  public EmployeeMapper get() {
    return provideEmployeeMapper(module);
  }

  public static EmployeePsqlHelperModule_ProvideEmployeeMapperFactory create(
      EmployeePsqlHelperModule module) {
    return new EmployeePsqlHelperModule_ProvideEmployeeMapperFactory(module);
  }

  public static EmployeeMapper provideEmployeeMapper(EmployeePsqlHelperModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideEmployeeMapper());
  }
}
