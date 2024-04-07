import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.logging.*;

@WebServlet(urlPatterns = {"/S11Q1"})
public class S11Q1 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter pw = res.getWriter();
        
        String cnoStr = req.getParameter("cno");
        
        if (cnoStr != null && !cnoStr.isEmpty()) {
            try {
                int cno = Integer.parseInt(cnoStr);
                
                Class.forName("org.postgresql.Driver");
                Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
                
                String sql = "select * from customer where cno = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, cno);
                
                ResultSet rs = pstmt.executeQuery();
                
                while (rs.next()) {
                    pw.println("cno: " + rs.getInt("cno"));
                    pw.println("cname: " + rs.getString("cname"));
                }
            } catch (NumberFormatException | SQLException e) {
                e.printStackTrace();
                pw.println("Error: " + e.getMessage());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(S11Q1.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            pw.println("Error: cno parameter is missing or empty.");
        }
    }
}
