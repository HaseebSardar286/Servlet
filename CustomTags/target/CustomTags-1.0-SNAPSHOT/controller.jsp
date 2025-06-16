<%-- 
    Document   : controller
    Created on : Jun 12, 2025, 12:42:54 PM
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
        <%
        String pageName = request.getParameter("page");
        if(pageName.equals("web"))
        {
            response.sendRedirect("web.jsp");
        }else if(pageName.equals("java"))
        {
            response.sendRedirect("java.jsp");
        }
        %>
    </body>
</html>
