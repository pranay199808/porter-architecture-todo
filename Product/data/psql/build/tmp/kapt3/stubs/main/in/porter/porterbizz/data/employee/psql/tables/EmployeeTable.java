package in.porter.porterbizz.data.employee.psql.tables;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0018\u0010\u0018\u001a\u00060\u0019R\u00020\u0001X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0007\u00a8\u0006!"}, d2 = {"Lin/porter/porterbizz/data/employee/psql/tables/EmployeeTable;", "Lorg/jetbrains/exposed/sql/Table;", "()V", "createdAt", "Lorg/jetbrains/exposed/sql/Column;", "Ljava/time/LocalDateTime;", "getCreatedAt", "()Lorg/jetbrains/exposed/sql/Column;", "department", "", "getDepartment", "designation", "getDesignation", "email", "getEmail", "id", "", "getId", "isActive", "", "joinDate", "getJoinDate", "name", "getName", "primaryKey", "Lorg/jetbrains/exposed/sql/Table$PrimaryKey;", "getPrimaryKey", "()Lorg/jetbrains/exposed/sql/Table$PrimaryKey;", "salary", "Ljava/math/BigDecimal;", "getSalary", "updatedAt", "getUpdatedAt", "psql"})
public final class EmployeeTable extends org.jetbrains.exposed.sql.Table {
    @org.jetbrains.annotations.NotNull()
    private static final org.jetbrains.exposed.sql.Column<java.lang.Integer> id = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.jetbrains.exposed.sql.Column<java.lang.String> name = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.jetbrains.exposed.sql.Column<java.lang.String> email = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.jetbrains.exposed.sql.Column<java.lang.String> designation = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.jetbrains.exposed.sql.Column<java.lang.String> department = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.jetbrains.exposed.sql.Column<java.math.BigDecimal> salary = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.jetbrains.exposed.sql.Column<java.time.LocalDateTime> joinDate = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.jetbrains.exposed.sql.Column<java.lang.Boolean> isActive = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.jetbrains.exposed.sql.Column<java.time.LocalDateTime> createdAt = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.jetbrains.exposed.sql.Column<java.time.LocalDateTime> updatedAt = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.jetbrains.exposed.sql.Table.PrimaryKey primaryKey = null;
    @org.jetbrains.annotations.NotNull()
    public static final in.porter.porterbizz.data.employee.psql.tables.EmployeeTable INSTANCE = null;
    
    private EmployeeTable() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.jetbrains.exposed.sql.Column<java.lang.Integer> getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.jetbrains.exposed.sql.Column<java.lang.String> getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.jetbrains.exposed.sql.Column<java.lang.String> getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.jetbrains.exposed.sql.Column<java.lang.String> getDesignation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.jetbrains.exposed.sql.Column<java.lang.String> getDepartment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.jetbrains.exposed.sql.Column<java.math.BigDecimal> getSalary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.jetbrains.exposed.sql.Column<java.time.LocalDateTime> getJoinDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.jetbrains.exposed.sql.Column<java.lang.Boolean> isActive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.jetbrains.exposed.sql.Column<java.time.LocalDateTime> getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.jetbrains.exposed.sql.Column<java.time.LocalDateTime> getUpdatedAt() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.jetbrains.exposed.sql.Table.PrimaryKey getPrimaryKey() {
        return null;
    }
}