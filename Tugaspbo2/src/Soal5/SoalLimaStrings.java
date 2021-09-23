/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal5;

/**
 *
 * @author LENOVO
 */

import java.util.Scanner;

public class SoalLimaStrings {
   public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	       String A;
	       String B;
	       
	       int PA;
	       int PB;
	       
	      // A = "Hello";
	      // B = "Java";
	       A = input.nextLine();
	       B = input.nextLine();
	       
	       PA = A.length();
	       PB = B.length();
	       
	       System.out.println(PA+PB);
	       
	       if(PA>PB)
	       {
	           System.out.println("Yes");
	       }else{
	           System.out.println("No");
	       }
	    
	       System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
	}

}
