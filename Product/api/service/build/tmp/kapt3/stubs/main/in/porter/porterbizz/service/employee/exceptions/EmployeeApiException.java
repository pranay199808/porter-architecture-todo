package in.porter.porterbizz.service.employee.exceptions;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0006\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r\u00a8\u0006\u000e"}, d2 = {"Lin/porter/porterbizz/service/employee/exceptions/EmployeeApiException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "(Ljava/lang/String;)V", "AlreadyExists", "InternalError", "NotFound", "ValidationError", "Lin/porter/porterbizz/service/employee/exceptions/EmployeeApiException$AlreadyExists;", "Lin/porter/porterbizz/service/employee/exceptions/EmployeeApiException$InternalError;", "Lin/porter/porterbizz/service/employee/exceptions/EmployeeApiException$NotFound;", "Lin/porter/porterbizz/service/employee/exceptions/EmployeeApiException$ValidationError;", "service"})
public abstract class EmployeeApiException extends java.lang.RuntimeException {
    
    private EmployeeApiException(java.lang.String message) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lin/porter/porterbizz/service/employee/exceptions/EmployeeApiException$AlreadyExists;", "Lin/porter/porterbizz/service/employee/exceptions/EmployeeApiException;", "message", "", "(Ljava/lang/String;)V", "service"})
    public static final class AlreadyExists extends in.porter.porterbizz.service.employee.exceptions.EmployeeApiException {
        
        public AlreadyExists(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lin/porter/porterbizz/service/employee/exceptions/EmployeeApiException$InternalError;", "Lin/porter/porterbizz/service/employee/exceptions/EmployeeApiException;", "message", "", "(Ljava/lang/String;)V", "service"})
    public static final class InternalError extends in.porter.porterbizz.service.employee.exceptions.EmployeeApiException {
        
        public InternalError(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lin/porter/porterbizz/service/employee/exceptions/EmployeeApiException$NotFound;", "Lin/porter/porterbizz/service/employee/exceptions/EmployeeApiException;", "message", "", "(Ljava/lang/String;)V", "service"})
    public static final class NotFound extends in.porter.porterbizz.service.employee.exceptions.EmployeeApiException {
        
        public NotFound(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lin/porter/porterbizz/service/employee/exceptions/EmployeeApiException$ValidationError;", "Lin/porter/porterbizz/service/employee/exceptions/EmployeeApiException;", "message", "", "(Ljava/lang/String;)V", "service"})
    public static final class ValidationError extends in.porter.porterbizz.service.employee.exceptions.EmployeeApiException {
        
        public ValidationError(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
    }
}