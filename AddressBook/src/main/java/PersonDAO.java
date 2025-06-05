
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author M. Haseeb Sardar
 */
public class PersonDAO {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/personinfo";
    private static final String userName = "root";
    private static final String password = "root";


    public PersonInfo searchPerson(String sName){
    PersonInfo person = null;

    

    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
    
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    
    try{
    Connection con = DriverManager.getConnection(url, userName, password);
    String query = "SELECT * FROM personDetails WHERE personName=?";
    PreparedStatement ps = con.prepareStatement(query);

    ps.setString(1, sName);
    ResultSet rs = ps.executeQuery();
    
    if(rs.next()){
        String name = rs.getString("name");
        String address = rs.getString("address");
        String mobile = rs.getString("mobile");
    
    person = new PersonInfo(name, address, mobile);
    
    }
    con.close();
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    
    return person;
}  
}
