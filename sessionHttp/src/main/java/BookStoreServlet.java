/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

/**
 *
 * @author M. Haseeb Sardar
 */
public class BookStoreServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        
        HttpSession session = request.getSession(true);
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Shopping Cart Example</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Online Book Store</h1>");
        
        String eURL1 = response.encodeURL("BookStoreServlet?book=first");
        String eURL2 = response.encodeURL("BookStoreServlet?book=second");
        out.println("<h2><a href="+eURL1+">" + 
                "Java Core Servlets</a></h2>" +
                "<br>"+
                
                "<h2><a href="+eURL2+">" + 
                "Java How to Program</a></h2>" +
                "<br>"
                );
        
        out.println("<h1>Ypu have selected the following books</h1>");
        out.println("<br/>");
        
        String book = request.getParameter("book");
        
        if(book!=null){
            if(book.equals("first")){
                session.setAttribute("fBook","java core servlets");
            }else if(book.equals("second")){
                session.setAttribute("sBook", "java how to program");
            }
        }
        
        printSessionInfo(out, session);
        
        
        out.println("</body>");
        out.println("</html>");
        out.close();
        
    }
    
    public void printSessionInfo(PrintWriter out, HttpSession session){
        String title = "";
        
        title = (String) session.getAttribute("fBook");
        if(title!=null){
            out.println("<h2>"+ title+ "</h2>");
        }
        
        title = (String)session.getAttribute("sBook");
        if(title!=null){
            out.println("<h2>"+ title+ "</h2>");
        }

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
