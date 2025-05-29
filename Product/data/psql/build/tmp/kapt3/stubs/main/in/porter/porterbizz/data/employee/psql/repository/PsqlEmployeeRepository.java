package in.porter.porterbizz.data.employee.psql.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH\u0082@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0096@\u00a2\u0006\u0002\u0010\u001bJ\u0016\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0002\u0010\u0012J\u001e\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0002\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lin/porter/porterbizz/data/employee/psql/repository/PsqlEmployeeRepository;", "Lin/porter/porterbizz/domain/employee/repos/EmployeeDetailsRepo;", "mapper", "Lin/porter/porterbizz/data/employee/psql/mapper/EmployeeMapper;", "queries", "Lin/porter/porterbizz/data/employee/psql/queries/EmployeeQueries;", "(Lin/porter/porterbizz/data/employee/psql/mapper/EmployeeMapper;Lin/porter/porterbizz/data/employee/psql/queries/EmployeeQueries;)V", "count", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createEmployee", "Lin/porter/porterbizz/domain/employee/entities/Employee;", "employee", "(Lin/porter/porterbizz/domain/employee/entities/Employee;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEmployee", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findByEmail", "email", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllEmployees", "Lin/porter/porterbizz/domain/employee/entities/PaginatedResponse;", "pagination", "Lin/porter/porterbizz/domain/employee/entities/PaginationRequest;", "(Lin/porter/porterbizz/domain/employee/entities/PaginationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEmployeeById", "updateEmployee", "(ILin/porter/porterbizz/domain/employee/entities/Employee;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "psql"})
public final class PsqlEmployeeRepository implements in.porter.porterbizz.domain.employee.repos.EmployeeDetailsRepo {
    @org.jetbrains.annotations.NotNull()
    private final in.porter.porterbizz.data.employee.psql.mapper.EmployeeMapper mapper = null;
    @org.jetbrains.annotations.NotNull()
    private final in.porter.porterbizz.data.employee.psql.queries.EmployeeQueries queries = null;
    
    @javax.inject.Inject()
    public PsqlEmployeeRepository(@org.jetbrains.annotations.NotNull()
    in.porter.porterbizz.data.employee.psql.mapper.EmployeeMapper mapper, @org.jetbrains.annotations.NotNull()
    in.porter.porterbizz.data.employee.psql.queries.EmployeeQueries queries) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getAllEmployees(@org.jetbrains.annotations.NotNull()
    in.porter.porterbizz.domain.employee.entities.PaginationRequest pagination, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super in.porter.porterbizz.domain.employee.entities.PaginatedResponse<in.porter.porterbizz.domain.employee.entities.Employee>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getEmployeeById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super in.porter.porterbizz.domain.employee.entities.Employee> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object createEmployee(@org.jetbrains.annotations.NotNull()
    in.porter.porterbizz.domain.employee.entities.Employee employee, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super in.porter.porterbizz.domain.employee.entities.Employee> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateEmployee(int id, @org.jetbrains.annotations.NotNull()
    in.porter.porterbizz.domain.employee.entities.Employee employee, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super in.porter.porterbizz.domain.employee.entities.Employee> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteEmployee(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object findByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super in.porter.porterbizz.domain.employee.entities.Employee> $completion) {
        return null;
    }
    
    private final java.lang.Object count(kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
}