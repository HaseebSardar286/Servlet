<%-- 
    Document   : secondJSP
    Created on : Jun 12, 2025, 12:04:54 PM
    Author     : M. Haseeb Sardar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!-- JSP to sum 2 numbers -->
        
        <%-- Declaration --%>
        
        <%!
            int res;
            public int sum(int op1, int op2){
                return op1+op2;
            }
        %>
        
        <%-- Scriplets --%>
        
        <%
            String op1 = request.getParameter("num1");
            String op2 = request.getParameter("num2");
            int fnum = Integer.parseInt(op1);
            int snum = Integer.parseInt(op2);
            res = sum(fnum, snum);
        %>
        
        <%-- Result --%>
        
        h3>Sum is: <%= res %></h3>
        
    </body>
</html>
