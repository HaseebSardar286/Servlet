<%-- 
    Document   : index
    Created on : Jun 12, 2025, 12:40:54 PM
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
        <h1>Select the Page you want to visit</h1>
        
        <form action="controller.jsp" name="nyForm">
            <h3>
                <input type="radio" name="page" value="web"/>
                Web Design and Development
            </h3>
            
            <h3>
                <input type="radio" name="page" value="java"/>
                Java
            </h3>
            <br/>
            
            <input type="submit" value="Submit"/>            
            
        </form>
    </body>
</html>
