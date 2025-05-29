package in.porter.porterbizz.data.employee.psql.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lin/porter/porterbizz/data/employee/psql/di/EmployeePsqlModule;", "", "()V", "bindEmployeeRepository", "Lin/porter/porterbizz/domain/employee/repos/EmployeeDetailsRepo;", "impl", "Lin/porter/porterbizz/data/employee/psql/repository/PsqlEmployeeRepository;", "psql"})
public abstract class EmployeePsqlModule {
    
    public EmployeePsqlModule() {
        super();
    }
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract in.porter.porterbizz.domain.employee.repos.EmployeeDetailsRepo bindEmployeeRepository(@org.jetbrains.annotations.NotNull()
    in.porter.porterbizz.data.employee.psql.repository.PsqlEmployeeRepository impl);
}