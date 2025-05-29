package in.porter.porterbizz.data.employee.psql.di;

@javax.inject.Singleton()
@dagger.Component(modules = {in.porter.porterbizz.data.employee.psql.di.EmployeePsqlModule.class, in.porter.porterbizz.data.employee.psql.di.EmployeePsqlHelperModule.class, in.porter.porterbizz.data.employee.psql.di.DatabaseModule.class})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0007"}, d2 = {"Lin/porter/porterbizz/data/employee/psql/di/EmployeePsqlDataComponent;", "", "employeeRepository", "Lin/porter/porterbizz/domain/employee/repos/EmployeeDetailsRepo;", "getEmployeeRepository", "()Lin/porter/porterbizz/domain/employee/repos/EmployeeDetailsRepo;", "Builder", "psql"})
public abstract interface EmployeePsqlDataComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract in.porter.porterbizz.domain.employee.repos.EmployeeDetailsRepo getEmployeeRepository();
    
    @dagger.Component.Builder()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lin/porter/porterbizz/data/employee/psql/di/EmployeePsqlDataComponent$Builder;", "", "build", "Lin/porter/porterbizz/data/employee/psql/di/EmployeePsqlDataComponent;", "psql"})
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract in.porter.porterbizz.data.employee.psql.di.EmployeePsqlDataComponent build();
    }
}