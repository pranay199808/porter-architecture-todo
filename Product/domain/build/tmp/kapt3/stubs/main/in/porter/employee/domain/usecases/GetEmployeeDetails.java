package in.porter.employee.domain.usecases;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lin/porter/employee/domain/usecases/GetEmployeeDetails;", "", "employeeDetailsRepo", "Lin/porter/porterbizz/domain/employee/repos/EmployeeDetailsRepo;", "(Lin/porter/porterbizz/domain/employee/repos/EmployeeDetailsRepo;)V", "invoke", "Lin/porter/porterbizz/domain/employee/entities/PaginatedResponse;", "Lin/porter/porterbizz/domain/employee/entities/Employee;", "pagination", "Lin/porter/porterbizz/domain/employee/entities/PaginationRequest;", "(Lin/porter/porterbizz/domain/employee/entities/PaginationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain"})
public final class GetEmployeeDetails {
    @org.jetbrains.annotations.NotNull()
    private final in.porter.porterbizz.domain.employee.repos.EmployeeDetailsRepo employeeDetailsRepo = null;
    
    @javax.inject.Inject()
    public GetEmployeeDetails(@org.jetbrains.annotations.NotNull()
    in.porter.porterbizz.domain.employee.repos.EmployeeDetailsRepo employeeDetailsRepo) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super in.porter.porterbizz.domain.employee.entities.Employee> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    in.porter.porterbizz.domain.employee.entities.PaginationRequest pagination, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super in.porter.porterbizz.domain.employee.entities.PaginatedResponse<in.porter.porterbizz.domain.employee.entities.Employee>> $completion) {
        return null;
    }
}