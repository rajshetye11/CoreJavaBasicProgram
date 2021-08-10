package com.bridgelabz.basicprograms;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Value of N");
		int n = sc.nextInt();
		float harmonic = 1;
		
		for (int i=2;i<=n;i++)
		{
			harmonic+=(float)1/i;
			
		}
		System.out.println("Value of N is "+n);
		System.out.println("Harmonic = "+harmonic);
		
	}
}
