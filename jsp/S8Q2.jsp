<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .prime { color: red; }
        </style>
    </head>
    <body>
        <h1>Is prime?</h1>
        <form action="S8Q2.jsp" method="post">
            Enter a number: <input type="text" name="num">
            <input type="submit" value="is prime ?">
        </form>
        <%
            String numStr = request.getParameter("num");
            int n = 0;
            
            if(numStr != null && !numStr.isEmpty()) {
                n = Integer.parseInt(numStr);
                
                if(n > 1) {
                    boolean isPrime = true;
                    for(int i=2; i<n; i++) {
                        if(n % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    
                    if(isPrime) {
        %>
                        <h3 class="prime">Prime number</h3>
        <%
                    } else {
        %>
                        <h3 class="prime">Not a prime number</h3>
        <%
                    }
                }
            }
        %>
    </body>
</html>
