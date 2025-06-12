<%-- 
    Document   : java
    Created on : Jun 12, 2025, 12:41:11 PM
    Author     : M. Haseeb Sardar
--%>

<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>
<%@page import="bean.*" %>
<%@page import="java.io.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Course Outline</title>
        <style>
            table {
                border-collapse: collapse;
                width: 80%;
                margin: 20px auto;
            }
            th, td {
                border: 1px solid black;
                padding: 8px;
                text-align: left;
            }
            th {
                background-color: #f2f2f2;
            }
            h1, h3 {
                text-align: center;
            }
        </style>
    </head>
    <body>
        <h1>Welcome to Java Learning Center</h1>
        <h3>Course Outline</h3>
        
        <table>
            <tr>
                <th>Session No.</th>
                <th>Topics</th>
                <th>Assignments</th>
            </tr>
        <%
                CourseDAO cDAO = new CourseDAO();
                ArrayList courseList = cDAO.retrieveCourseList("Web Development");
                CourseOutlineBean javaBean = null;
                for(int i=0; i<courseList.size(); i++){
                javaBean = (CourseOutlineBean) courseList.get(i);
                
            %>
            <tr>
                <td><%= javaBean.getSessionNo() %></td>
                <td><%= javaBean.getTopic() %></td>
                <td><%= javaBean.getAssignment() %></td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>