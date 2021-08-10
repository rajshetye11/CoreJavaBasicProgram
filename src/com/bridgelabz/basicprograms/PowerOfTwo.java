package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter Number");
//		 int n = Integer.parseInt(args[0]);    //For Command Line arg 
		 int n = sc.nextInt();

	        int i = 0;                // count from 0 to N
	        int powerOfTwo = 1;       // the ith power of two

	     
	        while (i <= n) 
	        {
	            System.out.println(i + " " + powerOfTwo);  
	            powerOfTwo = 2 * powerOfTwo;               
	            i = i + 1;
	        }
	}
}
