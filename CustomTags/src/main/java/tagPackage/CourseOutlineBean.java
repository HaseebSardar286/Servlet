package tagPackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author M. Haseeb Sardar
 */
import java.io.*;
public class CourseOutlineBean implements Serializable{
    
    private int sessionNo;
    private String topic, assignment;
    
    public CourseOutlineBean(){
        sessionNo = 0;
        topic = "";
        assignment = "";
    }
    
    public void setSessionNo(int sessionNo){
        this.sessionNo = sessionNo;
    }
    
    public void setTopic(String topic){
        this.topic = topic;
    }
    
    public void setAssignment(String assignment){
        this.assignment = assignment;
    }
    
    public int getSessionNo(){
        return sessionNo;
    }
    
    public String getTopic(){
        return topic;
    }
    
    public String getAssignment(){
        return assignment;
    }
}
