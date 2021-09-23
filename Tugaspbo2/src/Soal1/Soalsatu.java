/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal1;

/**
 *
 * @author LENOVO
 */

import java.util.Scanner;
//import java.util.InputMismatchException;
public class Soalsatu {
public static void main(String[] args) {
	       Scanner keyboard = new Scanner(System.in);
	       
	       int T;
	       System.out.print("Total you wanna input : ");
	        T = keyboard.nextInt();
	        
	        for(int a=0; a<T; a++) {
	            try{
	                long N ;
	                N = keyboard.nextLong();
	                
	                System.out.println(N+" can be fitted in: " );
	                
	                if (N>=Byte.MIN_VALUE && N<=Byte.MAX_VALUE){
	                    System.out.println("* byte");
	                }
	                
	                if(N>=Short.MIN_VALUE  && N<=Short.MAX_VALUE){
	                    System.out.println("* short");
	                }
	                if (N>=Integer.MIN_VALUE && N<=Integer.MAX_VALUE){
	                    System.out.println("* int");
	                }
	                if (N>=Long.MIN_VALUE && N<=Long.MAX_VALUE) {
	                    System.out.println("* long");
	                }
	            }
	                   catch(Exception e) {
	                        System.out.print(keyboard.next()+" can't be fitted anywhere");
	            }
	        }
	    }

}
