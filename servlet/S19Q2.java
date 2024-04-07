
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

@WebServlet(urlPatterns = {"/S19Q2"})
public class S19Q2 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        PrintWriter pw = res.getWriter();
        
        String user = req.getParameter("user");
        String pass = req.getParameter("pass");
        
                
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
            
            String sql = "select * from login";
            PreparedStatement pt = conn.prepareStatement(sql);
            
            ResultSet rs = pt.executeQuery();
            
            boolean success = false;
            while (rs.next()) {
                if(rs.getString("user").equals(user))
                    if(rs.getString("pass").equals(pass)) {
                        success = true;
                        break;
                    }
            }
            
            if(success)
                pw.println("<h1>Login successfull.</h1>");
            else
                pw.println("<h1>Login Faild.</h1>");
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        } catch (SQLException s) {
            s.printStackTrace();
        }
    
    }
}
