
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class S13Q1 {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");    
        DatabaseMetaData md = conn.getMetaData();
        
        System.out.println("" + md.getDatabaseProductName());
        System.out.println("" + md.getDatabaseProductVersion());
        System.out.println("" + md.getDriverName());
        System.out.println("" + md.getDriverVersion());
        
        ResultSet tables = md.getTables(null, null, "%", new String[]{"TABLE"});
        System.out.println("Tables in Database:");
        while(tables.next()) {
            String tableName = tables.getString("TABLE_NAME");
            System.out.println(tableName);
        }
    }
}
