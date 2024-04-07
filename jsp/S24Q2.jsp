<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="S24Q2.jsp" method="post">
            User Name :<input type="text" name="user"><br>   
            Password  :<input type="text" name="pass"><br>
            <input type="submit" value="login">
        </form>
        
        
        <%
            String user = request.getParameter("user");
            String pass = request.getParameter("pass");
            
            if(user != null && pass != null)
                if(user.equals(pass))
                    response.sendRedirect("Login.html");
                else
                    response.sendRedirect("Error.html");
        %>
    </body>
</html>
