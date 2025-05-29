package in.porter.porterbizz.service.employee.mapper;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
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
public final class EmployeeMapper_Factory implements Factory<EmployeeMapper> {
  @Override
  public EmployeeMapper get() {
    return newInstance();
  }

  public static EmployeeMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static EmployeeMapper newInstance() {
    return new EmployeeMapper();
  }

  private static final class InstanceHolder {
    private static final EmployeeMapper_Factory INSTANCE = new EmployeeMapper_Factory();
  }
}
