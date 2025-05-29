package in.porter.porterbizz.data.employee.psql.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lin/porter/porterbizz/data/employee/psql/di/EmployeePsqlHelperModule;", "", "()V", "provideEmployeeMapper", "Lin/porter/porterbizz/data/employee/psql/mapper/EmployeeMapper;", "provideEmployeeQueries", "Lin/porter/porterbizz/data/employee/psql/queries/EmployeeQueries;", "database", "Lorg/jetbrains/exposed/sql/Database;", "psql"})
public final class EmployeePsqlHelperModule {
    
    public EmployeePsqlHelperModule() {
        super();
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final in.porter.porterbizz.data.employee.psql.mapper.EmployeeMapper provideEmployeeMapper() {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final in.porter.porterbizz.data.employee.psql.queries.EmployeeQueries provideEmployeeQueries(@org.jetbrains.annotations.NotNull()
    org.jetbrains.exposed.sql.Database database) {
        return null;
    }
}