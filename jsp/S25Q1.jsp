<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="S25Q1.jsp" method="post">
            Enter Name:<input type="text" name="name"><br>
            Enter Age :<input type="text" name="age"><br>
            <input type="submit" value="submit">
        </form>
        
        <%
            String name = request.getParameter("name");
            String ageStr = request.getParameter("age");
            
            if(ageStr != null && !ageStr.isEmpty()) {
                int age = Integer.parseInt(ageStr);
                
                if(age >= 18)
                    out.println("<h1>" + name + " is eligible for voting.</h1>");
                else
                    out.println("<h1>" + name + " is not eligible for voting.</h1>");
            }
        %>
    </body>
</html>
