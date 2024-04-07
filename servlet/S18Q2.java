
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet(urlPatterns = {"/S18Q2"})
public class S18Q2 extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        PrintWriter pw = res.getWriter();
        
        int sno = Integer.parseInt(req.getParameter("sno"));
        String sname = req.getParameter("sname");
        String sClass = req.getParameter("class");
        double marks = Double.parseDouble(req.getParameter("marks"));
        
        //asuming total subjects are 3
        double per = marks/3;
        
        char grade = 'F';
        if(per > 85)
            grade = 'A';
        else if(per > 75)
            grade = 'B';
        else if(per > 65)
            grade = 'C';
        else if(per > 55)
            grade = 'D';
        else if(per > 40)
            grade = 'F';
        
        pw.println("<h1>Student result is:</h1>");
        pw.println("<h3>Student no: " + sno +" </h3>");
        pw.println("<h3>Student Name: " + sname +" </h3>");
        pw.println("<h3>Class: " + sClass +" </h3>");
        pw.println("<h3>Marks: " + marks +" </h3>");
        pw.println("<h3>Persantage: " + per +" </h3>");
        pw.println("<h3>Grade: " + grade +" </h3>");
    }
}
