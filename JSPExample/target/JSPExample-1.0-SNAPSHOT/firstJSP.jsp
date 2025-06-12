<%-- 
    Document   : firstJSP
    Created on : Jun 12, 2025, 12:04:42 PM
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
        <h1>Enter two numbers to see their sum</h1>
        <form action="secondJSP.jsp" name="myForm">
            <h3>First Number</h3>
            <input type="text" name="num1"/>
            <h3>Second Number</h3>
            <input type="text" name="num2"/>
            <br/><br/>
            
            <input type="submit" value="Add"/>
        </form>
    </body>
</html>
