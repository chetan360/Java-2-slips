<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="S20Q1.jsp" method="post">
            Enter a number :<input type="text" name="num"><br>
            <input type="submit" value="show in words">
        </form>
        
        <%
        String numStr = request.getParameter("num");
            
        if(numStr != null && !numStr.isEmpty()) {
            int t = Integer.parseInt(numStr);
            int rev = 0, rem;
            
            // reverse the number
            while(t > 0) {
                rem = t % 10;
                rev = (rev * 10) + rem;
                t = t / 10;
            }
            
            t = rev;
            rev = 0;
            while(t > 0) {
                rem = t % 10;
                rev = (rev * 10) + rem;
                t = t / 10;
                
                switch(rem) {
                    case 0: out.println("zero");
                        break;
                    case 1: out.println("one");
                        break;
                    case 2: out.println("two");
                        break;
                    case 3: out.println("three");
                        break;
                    case 4: out.println("four");
                        break;
                    case 5: out.println("five");
                        break;
                    case 6: out.println("six");
                        break;
                    case 7: out.println("seven");
                        break;
                    case 8: out.println("eight");
                        break;
                    case 9: out.println("nine");
                        break;
                }
            }
        }
        %>
    </body>
</html>
