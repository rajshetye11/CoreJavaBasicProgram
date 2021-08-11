package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class FIbonacciSeries {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		
		int num = sc.nextInt();
		int first_num=0;
		int second_num=1;
		int sum;
		
		System.out.print("Fibonacci Series of "+num+" = ");
		System.out.print(first_num+" "+second_num+" ");
		
		for (int i = 2; i < num; i++) {
			
			sum = first_num + second_num;
			first_num = second_num;
			second_num=sum;
			System.out.print(sum+" ");
			
			
		} 
		
		
		

	}
}
