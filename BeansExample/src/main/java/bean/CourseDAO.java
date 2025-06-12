package bean;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author M. Haseeb Sardar
 */
import java.io.*;
import java.sql.*;
import java.util.*;
public class CourseDAO implements Serializable{
    
    private Connection con;
    
    public CourseDAO(){
        establishConnection();
    }
    
    private void establishConnection(){
        String url = "jdbc:mysql://127.0.0.1:3306/CourseOutline";
        String userName = "root";
        String password = "root";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, userName, password);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public ArrayList retrieveCourseList(String cName){
        ArrayList courseDetails = new ArrayList();
        
        try{
            String query = "SELECT sessionNo, topic, assignment FROM Course JOIN SessionDetail " +
                            "ON Course.courseId = SessionDetail.courseId WHERE Course.courseName = ?";
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, cName);
            
            ResultSet rs = ps.executeQuery();
            
            int sessionNo;
            String topic, assignment;
            while(rs.next()){
                sessionNo = rs.getInt("sessionNo");
                topic = rs.getString("topic");
                assignment = rs.getString("assignment");
                
                if(assignment==null){
                    assignment = "";
                }
                
                CourseOutlineBean cBean = new CourseOutlineBean();
                cBean.setSessionNo(sessionNo);
                cBean.setTopic(topic);
                cBean.setAssignment(assignment);
                
                courseDetails.add(cBean);
            }
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return courseDetails;
        
    }
}
