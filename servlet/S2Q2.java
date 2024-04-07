// java 7 or below replace jakarta with javax
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet(urlPatterns = {"/S2Q2"})
public class S2Q2 extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<html><body>");
        pw.println("<h1> Clint Info. </h1>");
        pw.println("IP Address: " + req.getRemoteAddr() + "<br>");
        pw.println("Browser Type: " + req.getHeader("User-Agent") + "<br>");
        pw.println("<h1> Server Info. </h1>");
        pw.println("OS: " + System.getProperty("os.name") + "<br>");
        pw.println("Loaded Servlet: " + getServletContext().getFilterRegistrations().keySet().toString());
    }
}
