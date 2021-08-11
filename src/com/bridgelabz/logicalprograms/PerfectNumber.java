package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
	 public static void main(String args[]){
		   
	      int number;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number :");
	      number = sc.nextInt();
	      int sum = 0;
	      
	      for(int i = 1; i< number/2; i++) {
	         if(number%i == 0) {
	        	 sum+=i;
	         }
	      }
	      System.out.println("");
	      if(sum*2 == number)
	    	  System.out.println(number+" is a perfect number. ");
	      else
	    	  System.out.println(number+" is not a perfect number. ");
	     
	   }
}
