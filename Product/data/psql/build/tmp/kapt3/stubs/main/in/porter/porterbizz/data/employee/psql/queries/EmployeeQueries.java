package in.porter.porterbizz.data.employee.psql.queries;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0014J$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00162\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001e\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lin/porter/porterbizz/data/employee/psql/queries/EmployeeQueries;", "", "database", "Lorg/jetbrains/exposed/sql/Database;", "(Lorg/jetbrains/exposed/sql/Database;)V", "count", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "Lin/porter/porterbizz/data/employee/psql/model/EmployeeRecord;", "record", "(Lin/porter/porterbizz/data/employee/psql/model/EmployeeRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findByEmail", "email", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "", "page", "pageSize", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getById", "mapToRecord", "row", "Lorg/jetbrains/exposed/sql/ResultRow;", "update", "psql"})
public final class EmployeeQueries {
    @org.jetbrains.annotations.NotNull()
    private final org.jetbrains.exposed.sql.Database database = null;
    
    @javax.inject.Inject()
    public EmployeeQueries(@org.jetbrains.annotations.NotNull()
    org.jetbrains.exposed.sql.Database database) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super in.porter.porterbizz.data.employee.psql.model.EmployeeRecord> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAll(int page, int pageSize, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<in.porter.porterbizz.data.employee.psql.model.EmployeeRecord>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object create(@org.jetbrains.annotations.NotNull()
    in.porter.porterbizz.data.employee.psql.model.EmployeeRecord record, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super in.porter.porterbizz.data.employee.psql.model.EmployeeRecord> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    in.porter.porterbizz.data.employee.psql.model.EmployeeRecord record, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super in.porter.porterbizz.data.employee.psql.model.EmployeeRecord> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object findByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super in.porter.porterbizz.data.employee.psql.model.EmployeeRecord> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object count(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    private final in.porter.porterbizz.data.employee.psql.model.EmployeeRecord mapToRecord(org.jetbrains.exposed.sql.ResultRow row) {
        return null;
    }
}