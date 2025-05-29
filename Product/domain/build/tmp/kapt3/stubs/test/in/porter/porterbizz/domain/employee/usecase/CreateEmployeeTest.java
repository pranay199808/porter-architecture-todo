package in.porter.porterbizz.domain.employee.usecase;

@org.junit.jupiter.api.TestInstance(value = org.junit.jupiter.api.TestInstance.Lifecycle.PER_METHOD)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lin/porter/porterbizz/domain/employee/usecase/CreateEmployeeTest;", "", "()V", "createEmployee", "Lin/porter/porterbizz/domain/employee/usecases/CreateEmployee;", "employeeRepo", "Lin/porter/porterbizz/domain/employee/repos/EmployeeDetailsRepo;", "setup", "", "should create a new employee and return with generated ID", "domain_test"})
public final class CreateEmployeeTest {
    @org.jetbrains.annotations.NotNull()
    private final in.porter.porterbizz.domain.employee.repos.EmployeeDetailsRepo employeeRepo = null;
    private in.porter.porterbizz.domain.employee.usecases.CreateEmployee createEmployee;
    
    public CreateEmployeeTest() {
        super();
    }
    
    @org.junit.jupiter.api.BeforeEach()
    public final void setup() {
    }
}