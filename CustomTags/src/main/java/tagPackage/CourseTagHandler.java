/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/TagHandler.java to edit this template
 */
package tagPackage;

import java.util.*;
import jakarta.servlet.jsp.*;
import jakarta.servlet.jsp.tagext.*;

/**
 *
 * @author M. Haseeb Sardar
 */
public class CourseTagHandler extends SimpleTagSupport {

    private String pageName;

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        CourseDAO cDAO = new CourseDAO();
        ArrayList courseList = cDAO.retrieveCourseList(pageName);
        
        display(courseList);
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }
    
    private void display(ArrayList cList){
        PageContext pc = (PageContext)getJspContext();
        JspWriter out = pc.getOut();
        
        try{
            
            out.print("<table>");
            out.print("<tr>");
            out.print("<th>Session No.</th>");
            out.print("<th>Topics</th>");
            out.print("<th>Assignments</th>");
            out.print("</tr>");
            
            for(int i=0; i<cList.size(); i++){
                CourseOutlineBean cBean = (CourseOutlineBean)cList.get(i);
                
                out.print("<tr>");
                out.print("<td>" + cBean.getSessionNo()+ "</td>");
                out.print("<td>" + cBean.getTopic() + "</td>");
                out.print("<td>" + cBean.getAssignment() + "</td>");
                out.print("</tr>");
            }
            out.print("</table>");
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
