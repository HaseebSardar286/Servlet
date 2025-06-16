/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.sql.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author M. Haseeb Sardar
 */
public class PersonDAO {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/personinfo";
    private static final String userName = "root";
    private static final String password = "root";
    private Connection con;
    public PersonDAO() throws Exception{
        establishConnection();
    }
    
    private void establishConnection() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        this.con = DriverManager.getConnection(url, userName, password);
        
    }
    
    public ArrayList retrievePersonList(String pName) throws Exception{
        ArrayList pList = new ArrayList();
        
        String query = "SELECT * FROM persondetails WHERE personName=?";
        PreparedStatement ps = con.prepareStatement(query);
        
        ps.setString(1, "pName");
        
        ResultSet rs = ps.executeQuery();
        
        String name;
        int salary;
        String mobile;
        
        while(rs.next()){
            name = rs.getString("name");
            mobile = rs.getString("mobile");
            salary = rs.getInt("salary");
            
            PersonInfo pBean = new PersonInfo();
            
            pBean.setName(name);
            pBean.setSalary(salary);
            pBean.setMobile(mobile);
            
            pList.add(pBean);
        }
        
        return pList;
    }
    
    public void addPerson(PersonInfo person) throws Exception{
        String query = "INSERT INTO persondetails VALUES(?,?,?)";
        
        PreparedStatement ps = con.prepareStatement(query);
        String name = person.getName();
        int salary = person.getSalary();
        String mobile = person.getMobile();
        
        ps.setString(1, name);
        ps.setInt(2, salary);
        ps.setString(3, mobile);
        
        ps.executeUpdate();
    }
    
    
    public void finalize() throws Exception{
        if(con!=null){
            con.close();
        }
    }
}


