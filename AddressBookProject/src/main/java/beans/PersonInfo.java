/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.io.*;
/**
 *
 * @author M. Haseeb Sardar
 */
public class PersonInfo {
    
    private String name, mobile;
    private int salary;
    public PersonInfo(){
        this.name = "";
        this.salary = 0;
        this.mobile = "";
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setSalary(int salary){
        this.salary=salary;
    }
    
    public void setMobile(String mobile){
        this.mobile=mobile;
    }
    
    public String getName(){
        return name;
    }
    
    public int getSalary(){
        return salary;
    }
    
    public String getMobile(){
        return mobile;
    }
}
