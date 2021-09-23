/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal4;

/**
 *
 * @author LENOVO
 */
public class ConvertDataType {
     static short methodOne(long l) 
     { 
        int i = (int) l; 
        return (short)i;  
     } 
     
     public static void main(String[] args) 
     { 
        double d = 10.25; 
        float f = (float) d;  
        byte b = (byte) methodOne((long) f);  
        System.out.println(b); 
     } 

}
