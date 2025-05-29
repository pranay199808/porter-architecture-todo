package in.porter.porterbizz.domain.employee.repos;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00a2\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lin/porter/porterbizz/domain/employee/repos/EmployeeDetailsRepo;", "", "createEmployee", "Lin/porter/porterbizz/domain/employee/entities/Employee;", "employee", "(Lin/porter/porterbizz/domain/employee/entities/Employee;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEmployee", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllEmployees", "Lin/porter/porterbizz/domain/employee/entities/PaginatedResponse;", "pagination", "Lin/porter/porterbizz/domain/employee/entities/PaginationRequest;", "(Lin/porter/porterbizz/domain/employee/entities/PaginationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEmployeeById", "updateEmployee", "(ILin/porter/porterbizz/domain/employee/entities/Employee;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain"})
public abstract interface EmployeeDetailsRepo {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllEmployees(@org.jetbrains.annotations.NotNull()
    in.porter.porterbizz.domain.employee.entities.PaginationRequest pagination, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super in.porter.porterbizz.domain.employee.entities.PaginatedResponse<in.porter.porterbizz.domain.employee.entities.Employee>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getEmployeeById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super in.porter.porterbizz.domain.employee.entities.Employee> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createEmployee(@org.jetbrains.annotations.NotNull()
    in.porter.porterbizz.domain.employee.entities.Employee employee, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super in.porter.porterbizz.domain.employee.entities.Employee> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateEmployee(int id, @org.jetbrains.annotations.NotNull()
    in.porter.porterbizz.domain.employee.entities.Employee employee, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super in.porter.porterbizz.domain.employee.entities.Employee> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteEmployee(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}