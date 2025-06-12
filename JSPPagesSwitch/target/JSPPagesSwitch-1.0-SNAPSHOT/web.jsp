<%-- 
    Document   : java
    Created on : Jun 12, 2025, 12:41:11 PM
    Author     : M. Haseeb Sardar
--%>

<%@page import="java.sql.*" %>
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
            String url = "jdbc:mysql://127.0.0.1:3306/CourseOutline";
            String userName = "root";
            String password = "root";
            
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            try {
                // Load driver (optional for MySQL Connector/J 8.x and above)
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                // Establish connection
                con = DriverManager.getConnection(url, userName, password);
                
                // Prepare SQL query
                String query = "SELECT sessionNo, topic, assignment FROM Course JOIN SessionDetail " +
                              "ON Course.courseId = SessionDetail.courseId WHERE Course.courseName = ?";
                ps = con.prepareStatement(query);
                ps.setString(1, "Web Development");
                
                // Execute query
                rs = ps.executeQuery();
                
                // Process results
                while (rs.next()) {
                    String sessionNo = rs.getString("sessionNo");
                    String topic = rs.getString("topic");
                    String assignment = rs.getString("assignment");
                    if (assignment == null) {
                        assignment = "None";
                    }
        %>
            <tr>
                <td><%= sessionNo %></td>
                <td><%= topic %></td>
                <td><%= assignment %></td>
            </tr>
        <%
                }
            } catch (SQLException e) {
        %>
            <tr>
                <td colspan="3" style="color: red; text-align: center;">
                    Error retrieving data: Database connection issue. Please try again later.
                </td>
            </tr>
        <%
            } catch (ClassNotFoundException e) {
        %>
            <tr>
                <td colspan="3" style="color: red; text-align: center;">
                    Error: MySQL driver not found. Contact the administrator.
                </td>
            </tr>
        <%
            } finally {
                // Close resources in reverse order
                try { if (rs != null) rs.close(); } catch (SQLException e) { /* Log error */ }
                try { if (ps != null) ps.close(); } catch (SQLException e) { /* Log error */ }
                try { if (con != null) con.close(); } catch (SQLException e) { /* Log error */ }
            }
        %>
        </table>
    </body>
</html>