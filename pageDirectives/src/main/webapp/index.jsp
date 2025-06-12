<%-- 
    Document   : index
    Created on : Jun 12, 2025, 1:24:00 PM
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
        
        <%@include file="header.jsp" %>
        
        <table border="1">
            <tr>
                <th></th>
                <th>Apples</th>
                <th>Oranges</th>
            </tr>
            <tr>
                <th>First Quarter</th>
                <td>2307</td>
                <td>4706</td>
            </tr>
            <tr>
                <th>Second Quarter</th>
                <td>2982</td>
                <td>5104</td>
            </tr>
            <tr>
                <th>Third Quarter</th>
                <td>3011</td>
                <td>5220</td>
            </tr>
            <tr>
                <th>Fourth Quarter</th>
                <td>3055</td>
                <td>5287</td>
            </tr>
        </table>
        
        <%@include file="footer.jsp" %>
        
    </body>
</html>
