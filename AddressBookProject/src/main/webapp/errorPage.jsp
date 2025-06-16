<%-- 
    Document   : errorPage
    Created on : Jun 16, 2025, 1:21:27 PM
    Author     : M. Haseeb Sardar
--%>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
    </head>
    <body>
        <h1>Error Page</h1>
        <h3>
            <%
                if (exception instanceof SQLException) {
            %>
            An SQL Exception
            <%
                } else if (exception instanceof ClassNotFoundException) {
            %>
            Class Not Found Exception
            <%
                } else {
            %>
            An Exception
            <%
                }
            %>
            occurred while interacting with Database
        </h3>
        
        <h3>
            The Error Message was: 
            <%= exception.getMessage() %>
        </h3>
        
        <h3>Please Try Again!</h3>
        <h3>
            <a href="addPerson.jsp">Add Person</a>
        </h3>
        
        <h3>
            <a href="searchPerson.jsp">Search Person</a>
        </h3>
    </body>
</html>