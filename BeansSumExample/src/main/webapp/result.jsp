<%-- 
    Document   : result
    Created on : Jun 13, 2025, 4:30:47 PM
    Author     : M. Haseeb Sardar
--%>

<%@page import = "beans.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>The sum is:
            <jsp:useBean id="sBean" class="beans.SumBean" scope="page"/>
            <jsp:setProperty name="sBean" property="num1" param="num1"/>
            <jsp:setProperty name="sBean" property="num2" param="num2"/>
            <%
                sBean.calculateSum();
            %>
            <jsp:getProperty name="sBean" property="sum" />
        </h2>
    </body>
</html>
