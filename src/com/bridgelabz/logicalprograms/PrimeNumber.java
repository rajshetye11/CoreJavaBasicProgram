package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
	 public static void main(String args[]){
		   
	      int number;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number :");
	      number = sc.nextInt();
	      int temp = 0;
	      
	      for(int i = 2; i<= number/2; i++) {
	         if(number%i == 0) {
	        	 temp++;
	         }
	      }
	      System.out.println("");
	      if(temp >= 1)
	    	  System.out.println(number+" is not a Prime number. ");
	      else
	    	  System.out.println(number+" is a Prime number. ");
	     
	   }
}
