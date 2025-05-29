package in.porter.porterbizz.domain.employee.usecase;

@org.junit.jupiter.api.TestInstance(value = org.junit.jupiter.api.TestInstance.Lifecycle.PER_METHOD)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\b\u0010\f\u001a\u00020\nH\u0007J\b\u0010\r\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lin/porter/porterbizz/domain/employee/usecase/GetEmployeeDetailsTest;", "", "()V", "employee", "Lin/porter/porterbizz/domain/employee/entities/Employee;", "repo", "Lin/porter/porterbizz/domain/employee/repos/EmployeeDetailsRepo;", "useCase", "Lin/porter/employee/domain/usecases/GetEmployeeDetails;", "setup", "", "should return employee when found by ID", "should return paginated employees", "should throw EmployeeNotFoundException when employee not found by ID", "domain_test"})
public final class GetEmployeeDetailsTest {
    @org.jetbrains.annotations.NotNull()
    private final in.porter.porterbizz.domain.employee.repos.EmployeeDetailsRepo repo = null;
    private in.porter.employee.domain.usecases.GetEmployeeDetails useCase;
    @org.jetbrains.annotations.NotNull()
    private final in.porter.porterbizz.domain.employee.entities.Employee employee = null;
    
    public GetEmployeeDetailsTest() {
        super();
    }
    
    @org.junit.jupiter.api.BeforeEach()
    public final void setup() {
    }
}