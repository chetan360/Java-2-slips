<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .res { color: red; font-size: 18px; }
        </style>
    </head>
    <body>
        <h1>Calculate sum of fist and last digit?</h1>
        <form action="S14Q2.jsp" method="post">
            Enter a number: <input type="text" name="num">
            <input type="submit" value="sum?">
        </form>
        <%
            String numStr = request.getParameter("num");
            int n = 0;
            
            if(numStr != null && !numStr.isEmpty()) {
                n = Integer.parseInt(numStr);
                
                int fDigit = n;
                while(fDigit >= 10) {
                    fDigit /= 10;
                }
                int lDigit = n % 10;
                
                int sum = fDigit + lDigit;
        %>
                <h3 class="res">Sum of first and last digit is <%= sum %></h3>
        <%        
            }
        %>
    </body>
</html>