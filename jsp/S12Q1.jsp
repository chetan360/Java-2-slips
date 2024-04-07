<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Is Perfect?</h1>
        <form action="S12Q1.jsp" method="post">
            Enter a number: <input type="text" name="num">
            <input type="submit" value="is perfect?">
        </form>
        <%
            String numStr = request.getParameter("num");
            int n = 0;
            
            if(numStr != null && !numStr.isEmpty()) {
                n = Integer.parseInt(numStr);
                
                if(n > 1) {
                    int sum = 0;
                    for(int i=1; i<=n/2; i++) {
                        if(n % i == 0) {
                            sum += i;
                        }
                    }
                    
                    if(sum == n) {
        %>
                        <h3>Perfect number</h3>
        <%
                    } else {
        %>
                        <h3>Not a perfect number</h3>
        <%
                    }
                }
            }
        %>
    </body>
</html>