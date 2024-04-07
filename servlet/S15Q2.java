
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet(urlPatterns = {"/S15Q2"})
public class S15Q2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter pw = res.getWriter();
        
        Cookie[] cookies= req.getCookies();
        
        int visited = 0;
        
        if(cookies != null) {
            for(Cookie cookie: cookies) {
                if("visited".equals(cookie.getName())) {
                    visited = Integer.parseInt(cookie.getValue());
                    break;
                }
            }
        }
        
        visited++;
        
        Cookie visitCookie = new Cookie("visited", String.valueOf(visited));
        visitCookie.setMaxAge(24 * 60 * 60);
        res.addCookie(visitCookie);
        
        if(visited == 1)
            pw.println("<h1>Welcome</h1>");
        else
            pw.println("<h1>Number of times visited: " + visited);
    }
}
