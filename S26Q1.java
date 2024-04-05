
import java.sql.*;

public class S26Q1 {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        
        String sql = "delete from emp where id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, Integer.parseInt(args[0]));
        ps.executeUpdate();
    }
}
