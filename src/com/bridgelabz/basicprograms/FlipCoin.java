package com.bridgelabz.basicprograms;

import java.util.Iterator;
import java.util.Scanner;

public class FlipCoin {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter no of times to flip the coin");

	    int noOfFlips= sc.nextInt();  // Read user input
	    int heads=0;
	    int tails=0;
	    
	    for (int i = 0; i < noOfFlips ; i++) 
	    {
	    	double randomNumber = Math.random();
	    	if(randomNumber < 0.5)
	    	{
	    		heads++;
	    		System.out.println("Heads :" +heads);
	    	}else
	    	{
	    		tails++;
	    		System.out.println("Tails :" +tails);
	    	}
		}
	    double HeadsPercentage = ((heads*100.00)/(noOfFlips));
	    System.out.println("Heads Percentage " +HeadsPercentage+ " %");
	    double TailsPercentage = ((tails*1.0)/(noOfFlips*1.0))*100;
	    System.out.println("Tails Percentage "+TailsPercentage+ " %");
	}

}
