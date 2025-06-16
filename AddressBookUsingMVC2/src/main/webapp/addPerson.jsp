<%-- 
    Document   : addPerson
    Created on : Jun 16, 2025, 1:15:27 PM
    Author     : M. Haseeb Sardar
--%>

<%@page errorPage="errorPage.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Person Detail Book</h1>
        <h3>Add Person Details</h3>
        
        <form action="controller" name="register">
            <table border='1'>
                <tr>
                    <td><h4>Name: </h4></td>
                    <td><input type='text' name='name'/></td>
                </tr>
                <tr>
                    <td><h4>Salary: </h4></td>
                    <td><input type='number' name='salary'/></td>
                </tr>
                <tr>
                    <td><h4>Mobile: </h4></td>
                    <td><input type='text' name='mobile'/></td>
                </tr>
                <tr>
                    <td><input type="submit" name='action' value='Save'/></td>
                </tr>
            </table>
        </form>
        
        
        <h4>
            <a href="controller?action=searchPerson">Search Person</a>
        </h4>
    </body>
</html>
