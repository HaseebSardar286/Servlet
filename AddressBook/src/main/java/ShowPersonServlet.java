/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.*;
import java.net.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

/**
 *
 * @author M. Haseeb Sardar
 */
public class ShowPersonServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out = response.getWriter();

String name = request.getParameter("pName");

PersonDAO personDAO = new PersonDAO();
PersonInfo person = personDAO.searchPerson(name);

out.println("<html>");
out.println("<body>");
out.println("<h1>Search Results</h1>");

if(person!=null){
    name = name.trim();
    out.println("<h3>" + person.toString() + "</h3>");
        }else{
    out.println("<h3> Sorry! No records found </h3>");
}

out.println("</body>");
out.println("</html>");

out.close();

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
