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
public final class PaginationRequestMapper_Factory implements Factory<PaginationRequestMapper> {
  @Override
  public PaginationRequestMapper get() {
    return newInstance();
  }

  public static PaginationRequestMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PaginationRequestMapper newInstance() {
    return new PaginationRequestMapper();
  }

  private static final class InstanceHolder {
    private static final PaginationRequestMapper_Factory INSTANCE = new PaginationRequestMapper_Factory();
  }
}
