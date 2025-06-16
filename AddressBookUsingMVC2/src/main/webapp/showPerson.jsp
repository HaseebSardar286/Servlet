<%-- 
    Document   : showPerson
    Created on : Jun 16, 2025, 4:35:26 PM
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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Person Details</h1>
        <h3>Following Results Meet Your Search Criteria</h3>
        <table>
            <tr>
                <th>Name</th>
                <th>Salary</th>
                <th>Mobile</th>
            </tr>
            
            <jsp:useBean id="pDAO" class="beans.PersonDAO" scope="page" />
            
            <%
                String pName = request.getParameter("name");
                ArrayList pList = pDAO.retrievePersonList(pName);
                PersonInfo person = null;
                for(int i = 0; i<pList.size(); i++){
                person = (PersonInfo)pList.get(i);
                
            %>
            <tr>
                <td> <%= person.getName() %> </td>
                <td> <%= person.getSalary() %> </td>
                <td> <%= person.getMobile() %> </td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>
