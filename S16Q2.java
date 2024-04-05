
import java.sql.*;
import java.util.Scanner;

class Teacher {

    Teacher() throws SQLException, SQLException {
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        
        for(int i=0; i<5; i++)
            insert(conn);
        
        select(conn);
    }

    private void insert(Connection conn) throws SQLException {
        String sql = "insert into teacher values(?, ?, ?)";
        
        PreparedStatement ps = conn.prepareStatement(sql);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter tno:");
        ps.setInt(1, sc.nextInt());
        sc.nextLine();
        
        System.out.println("Enter tname:");
        ps.setString(2, sc.nextLine());
        
        System.out.println("Enter subject:");
        ps.setString(3, sc.nextLine());
        
        ps.executeUpdate();
    }

    private void select(Connection conn) throws SQLException {
        String sql = "select * from teacher where subject = 'java'";
        
        Statement stmt = conn.createStatement();
        
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()) {
            System.out.println("teacher tno: " + rs.getInt("tno"));
            System.out.println("teacher tname: " + rs.getString("tname"));
            System.out.println("teacher subject: " + rs.getString("subject"));
        }
    }
}

public class S16Q2 {
    public static void main(String[] args) throws SQLException {
        new Teacher();
    }
}
