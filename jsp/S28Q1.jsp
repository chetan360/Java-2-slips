<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="S28Q1.jsp" method="post">
            Enter Str :<input type="type" name="str"><br>
            <input type="submit" value="Reverse">
        </form>
        
        <%
            String str = request.getParameter("str");
            
            if(str != null && !str.isEmpty()) {
                StringBuilder rev = new StringBuilder(str);
                rev.reverse();
                
                out.println("<h1>" + rev +"</h1>");
            }
        %>
    </body>
</html>
