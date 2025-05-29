package `in`.porter.porterbizz.data.employee.psql.di
import dagger.Module
import dagger.Provides
import org.jetbrains.exposed.sql.Database
import `in`.porter.porterbizz.data.employee.psql.constants.DatabaseConstants.Config
import javax.inject.Singleton

@Module
object DatabaseModule {

  private val dbUrl = System.getenv("DATABASE_URL") ?: Config.DEFAULT_URL
  private val dbUser = System.getenv("DATABASE_USER") ?: Config.DEFAULT_USERNAME
  private val dbPassword = System.getenv("DATABASE_PASSWORD") ?: Config.DEFAULT_PASSWORD



  @Provides
  @Singleton
  fun provideDatabase(): Database {


    return Database.connect(
      url = dbUrl,
      driver = Config.DEFAULT_DRIVER,
      user = dbUser,
      password = dbPassword
    )
  }
}
