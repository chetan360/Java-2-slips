<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.time.LocalTime" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="S22Q2.jsp" method="post">
            Enter user name :<input type="text" name="user"><br>
            <input type="submit" value="greet">
        </form>
        
        <%
            String user = request.getParameter("user");
            
            if(user != null && !user.isEmpty()) { 
                LocalTime currTime = LocalTime.now();
                int hour = currTime.getHour();
            
                if(hour >= 0 && hour < 12)
                    out.println("Good Morning " + user);
                else if(hour >= 12 && hour <= 18)
                    out.println("Good Afternoon " + user);
                else
                    out.println("Good Morning " + user);
            }
        %>
    </body>
</html>
