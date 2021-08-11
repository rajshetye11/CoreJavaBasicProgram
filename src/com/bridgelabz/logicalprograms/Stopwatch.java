package com.bridgelabz.logicalprograms;

import java.util.Scanner;



public class Stopwatch {
	public static void main(String[] args) {

		long start=0,stop=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 0 to start the Stopwatch");
		int stopwatch = sc.nextInt();
		
		if(stopwatch==0)
		{
			start = System.currentTimeMillis();

		}
		
		System.out.println("Press 1 to stop the Stopwatch");
		stopwatch = sc.nextInt();
		
		if(stopwatch==1)
		{
			stop=System.currentTimeMillis();
		}
		
		long difference = (stop - start);
		long mils = difference % 1000;
	    difference = (difference - mils) / 1000;
		System.out.println("The elapsed time is " +difference+ " seconds.");
		

	}
}
