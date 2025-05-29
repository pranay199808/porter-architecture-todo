package in.porter.porterbizz.data.employee.psql.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import org.jetbrains.exposed.sql.Database;

@ScopeMetadata("javax.inject.Singleton")
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
public final class DatabaseModule_ProvideDatabaseFactory implements Factory<Database> {
  @Override
  public Database get() {
    return provideDatabase();
  }

  public static DatabaseModule_ProvideDatabaseFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Database provideDatabase() {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideDatabase());
  }

  private static final class InstanceHolder {
    private static final DatabaseModule_ProvideDatabaseFactory INSTANCE = new DatabaseModule_ProvideDatabaseFactory();
  }
}
