package in.porter.porterbizz.service.employee.usecases;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0002\u0010\u0015J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0086@\u00a2\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0002\u0010\u0015J\u0018\u0010\u001c\u001a\u00060\u001dj\u0002`\u001e2\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0002J\u001e\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0002\u0010 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lin/porter/porterbizz/service/employee/usecases/EmployeeService;", "", "getEmployeeDetails", "Lin/porter/employee/domain/usecases/GetEmployeeDetails;", "createEmployee", "Lin/porter/porterbizz/domain/employee/usecases/CreateEmployee;", "updateEmployee", "Lin/porter/employee/domain/usecases/UpdateEmployee;", "deleteEmployee", "Lin/porter/porterbizz/domain/employee/usecases/DeleteEmployee;", "mapper", "Lin/porter/porterbizz/service/employee/mapper/EmployeeMapper;", "paginationMapper", "Lin/porter/porterbizz/service/employee/mapper/PaginationRequestMapper;", "(Lin/porter/employee/domain/usecases/GetEmployeeDetails;Lin/porter/porterbizz/domain/employee/usecases/CreateEmployee;Lin/porter/employee/domain/usecases/UpdateEmployee;Lin/porter/porterbizz/domain/employee/usecases/DeleteEmployee;Lin/porter/porterbizz/service/employee/mapper/EmployeeMapper;Lin/porter/porterbizz/service/employee/mapper/PaginationRequestMapper;)V", "Lin/porter/employee/apimodels/employee/usecases/entities/Employee;", "employee", "(Lin/porter/employee/apimodels/employee/usecases/entities/Employee;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllEmployees", "Lin/porter/employee/apimodels/employee/usecases/entities/PaginatedResponse;", "paginationRequest", "Lin/porter/employee/apimodels/employee/usecases/entities/PaginationRequest;", "(Lin/porter/employee/apimodels/employee/usecases/entities/PaginationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEmployee", "toApiException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "(ILin/porter/employee/apimodels/employee/usecases/entities/Employee;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service"})
public final class EmployeeService {
    @org.jetbrains.annotations.NotNull()
    private final in.porter.employee.domain.usecases.GetEmployeeDetails getEmployeeDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final in.porter.porterbizz.domain.employee.usecases.CreateEmployee createEmployee = null;
    @org.jetbrains.annotations.NotNull()
    private final in.porter.employee.domain.usecases.UpdateEmployee updateEmployee = null;
    @org.jetbrains.annotations.NotNull()
    private final in.porter.porterbizz.domain.employee.usecases.DeleteEmployee deleteEmployee = null;
    @org.jetbrains.annotations.NotNull()
    private final in.porter.porterbizz.service.employee.mapper.EmployeeMapper mapper = null;
    @org.jetbrains.annotations.NotNull()
    private final in.porter.porterbizz.service.employee.mapper.PaginationRequestMapper paginationMapper = null;
    
    @javax.inject.Inject()
    public EmployeeService(@org.jetbrains.annotations.NotNull()
    in.porter.employee.domain.usecases.GetEmployeeDetails getEmployeeDetails, @org.jetbrains.annotations.NotNull()
    in.porter.porterbizz.domain.employee.usecases.CreateEmployee createEmployee, @org.jetbrains.annotations.NotNull()
    in.porter.employee.domain.usecases.UpdateEmployee updateEmployee, @org.jetbrains.annotations.NotNull()
    in.porter.porterbizz.domain.employee.usecases.DeleteEmployee deleteEmployee, @org.jetbrains.annotations.NotNull()
    in.porter.porterbizz.service.employee.mapper.EmployeeMapper mapper, @org.jetbrains.annotations.NotNull()
    in.porter.porterbizz.service.employee.mapper.PaginationRequestMapper paginationMapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getEmployee(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super in.porter.employee.apimodels.employee.usecases.entities.Employee> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllEmployees(@org.jetbrains.annotations.NotNull()
    in.porter.employee.apimodels.employee.usecases.entities.PaginationRequest paginationRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super in.porter.employee.apimodels.employee.usecases.entities.PaginatedResponse<in.porter.employee.apimodels.employee.usecases.entities.Employee>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createEmployee(@org.jetbrains.annotations.NotNull()
    in.porter.employee.apimodels.employee.usecases.entities.Employee employee, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super in.porter.employee.apimodels.employee.usecases.entities.Employee> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateEmployee(int id, @org.jetbrains.annotations.NotNull()
    in.porter.employee.apimodels.employee.usecases.entities.Employee employee, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super in.porter.employee.apimodels.employee.usecases.entities.Employee> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteEmployee(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Exception toApiException(java.lang.Exception e) {
        return null;
    }
}