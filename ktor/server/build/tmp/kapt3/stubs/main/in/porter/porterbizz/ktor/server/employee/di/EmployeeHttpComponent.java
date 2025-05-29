package in.porter.porterbizz.ktor.server.employee.di;

@EmployeeHttpScope()
@dagger.Component(dependencies = {in.porter.porterbizz.data.employee.psql.di.EmployeePsqlDataComponent.class}, modules = {in.porter.porterbizz.ktor.server.employee.di.EmployeeHttpModule.class})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0007"}, d2 = {"Lin/porter/porterbizz/ktor/server/employee/di/EmployeeHttpComponent;", "", "employeeHttpService", "Lin/porter/porterbizz/ktor/server/employee/usecases/EmployeeHttpService;", "getEmployeeHttpService", "()Lin/porter/porterbizz/ktor/server/employee/usecases/EmployeeHttpService;", "Factory", "server"})
public abstract interface EmployeeHttpComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract in.porter.porterbizz.ktor.server.employee.usecases.EmployeeHttpService getEmployeeHttpService();
    
    @dagger.Component.Factory()
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lin/porter/porterbizz/ktor/server/employee/di/EmployeeHttpComponent$Factory;", "", "create", "Lin/porter/porterbizz/ktor/server/employee/di/EmployeeHttpComponent;", "employeeHttpModule", "Lin/porter/porterbizz/ktor/server/employee/di/EmployeeHttpModule;", "employeePsqlDataComponent", "Lin/porter/porterbizz/data/employee/psql/di/EmployeePsqlDataComponent;", "server"})
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract in.porter.porterbizz.ktor.server.employee.di.EmployeeHttpComponent create(@org.jetbrains.annotations.NotNull()
        in.porter.porterbizz.ktor.server.employee.di.EmployeeHttpModule employeeHttpModule, @org.jetbrains.annotations.NotNull()
        in.porter.porterbizz.data.employee.psql.di.EmployeePsqlDataComponent employeePsqlDataComponent);
    }
}