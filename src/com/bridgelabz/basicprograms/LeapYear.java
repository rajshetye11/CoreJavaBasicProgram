package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Year");
		
		
		for (int i=1;i<=9999;i++) {
			
			int year = sc.nextInt();
			if(year<=9999 && year>=1000)
			{
				if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
				{
					System.out.println(year+" is a Leap Year");
				}else
				{
					System.out.println(year+" is not a Leap Year");
				}
			}else {
				System.out.println("Number should be 4 digit");
				
			}
		}
		
		

	}
}
