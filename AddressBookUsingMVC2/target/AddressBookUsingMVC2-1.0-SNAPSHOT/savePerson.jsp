<%-- 
    Document   : savePerson.jsp
    Created on : Jun 16, 2025, 1:21:11 PM
    Author     : M. Haseeb Sardar
--%>

<%@page errorPage="errorPage.jsp" %>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="pDAO" class="beans.PersonDAO" scope="page" />
        <jsp:useBean id="pBean" class="beans.PersonInfo" scope="page" />
        
        <jsp:setProperty name="pBean" property="*" />
        
        <%
            pDAO.addPerson(pBean);
        %>
        
    <center>
        <h3>New Person Record is Saved Successfully!</h3>
        <h4>
            <a href="addPerson.jsp">Add Person</a>
        </h4>
        
        <h4>
            <a href="searchPerson.jsp">Search Person</a>
        </h4>
    </center>
    </body>
</html>
