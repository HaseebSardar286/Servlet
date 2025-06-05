/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author M. Haseeb Sardar
 */
public class PersonInfo {
    String name;
    String address;
    String mobile;
    
    public PersonInfo(String name, String address, String mobile){
        this.name=name;
        this.address=address;
        this.mobile=mobile;
    }
    
    public String toString(){
        return "Name: " + name + " Address: " + address + " Mobile: " + mobile;
    }
    
}
