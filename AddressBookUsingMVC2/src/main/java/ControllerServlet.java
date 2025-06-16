 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import beans.*;
import java.util.*;
/**
 *
 * @author M. Haseeb Sardar
 */
public class ControllerServlet extends HttpServlet {

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
        String userAction = request.getParameter("action");
        if(userAction.equals("save")){
            System.out.println("Details recieved");
            addPerson(request,response);
            System.out.println("Details sent to function");
        }else if(userAction.equals("search")){
            searchPerson(request,response);
        }else if(userAction.equals("addPerson")){
            response.sendRedirect("addPerson.jsp");
        }else if(userAction.equals("searchPerson")){
            response.sendRedirect("searchPerson.jsp");
        }
    }
    
    
    private void addPerson(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
        try{
            System.out.println("Details adding");
            PersonDAO pDAO = new PersonDAO();
            PersonInfo person = new PersonInfo();
            
            String name = request.getParameter("name");
            person.setName(name);
            
            int salary = Integer.parseInt(request.getParameter("salary"));
            person.setSalary(salary);
            
            String mobile = request.getParameter("mobile");
            person.setMobile(mobile);
            
            pDAO.addPerson(person);
            response.sendRedirect("savePerson.jsp");
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }

    
    private void searchPerson(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
        try{
            PersonDAO pDAO = new PersonDAO();
            PersonInfo person = new PersonInfo();
            
            String name = request.getParameter("name");
            person.setName(name);
            
            ArrayList pList = pDAO.retrievePersonList(name);
            request.setAttribute("list", pList);
            
            RequestDispatcher rd = request.getRequestDispatcher("showPerson.jsp");
            rd.forward(request, response);
            

            
        }catch(Exception e){
            System.out.println(e.getMessage());
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
