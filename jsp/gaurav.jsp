
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <form action="gaurav.jsp" method="post">
            Enter roll no :<input type="text" name="rno"><br>
            Enter name    :<input type="text" name="name">
            <input type="submit" value="submit">
        </form>
        
        
        <% 
            String temp = request.getParameter("rno");
            String name = request.getParameter("name");
            
            int rno = 0;
            if(temp != null && !temp.isEmpty()) {
                rno = Integer.parseInt(temp);
            
                out.println("<h1>Roll no: " + rno + "</h1>");
                out.println("<h1>Name   : " + name + "</h1>");
            }
        %>
    </body>
</html>
