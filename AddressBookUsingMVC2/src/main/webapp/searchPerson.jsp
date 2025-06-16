<%-- 
    Document   : searchPerson
    Created on : Jun 16, 2025, 2:13:01 PM
    Author     : M. Haseeb Sardar
--%>
<%@page errorPage="errorPage.jsp" %>
<%@page import="java.util.*" %>
<%@page import="java.sql.*" %>
<%@page import="beans.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Person Details </title>
        
    </head>
    <body>
        <h1>Person Details</h1>
        
        <form action="controller" name="search">
            <table border='1'>
                <tr>
                    <td><h4>Name: </h4></td>
                    <td><input type='text' name='name'/></td>
                </tr>
                <tr>
                    <td><input type="submit" name='action' value='Search'/></td>
                </tr>
            </table>
        </form>
        
            
        <h4>
            <a href="controller?action=addPerson">Add Person</a>
        </h4>
        
    </body>
</html>
