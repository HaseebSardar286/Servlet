/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author M. Haseeb Sardar
 */
import java.io.*;
import java.util.*;
public class SumBean implements Serializable{
    
    private int num1;
    private int num2;
    private int sum;
    
    public SumBean(){
        num1=0;
        num2=0;
        sum=0;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public int getSum(){
       return sum;
    }
    
    public void calculateSum(){
        sum = num1 + num2;
    }
}
