package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {

	 public static void main(String args[]){
		   
	      int number;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number :");
	      number = sc.nextInt();
	      int rev = 0, rem;
	      int temp = number;

	      while(number!=0)
	      {
	    	  rem = number % 10;
	    	  rev = rev * 10 + rem;
	    	  number /= 10;	    	  
	      }
	      System.out.println("Reverse of "+temp+" is "+rev);
	 
	 }
	
}
