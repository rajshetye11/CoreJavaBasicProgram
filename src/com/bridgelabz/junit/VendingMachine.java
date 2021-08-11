package com.bridgelabz.junit;

import java.util.Scanner;

public class VendingMachine 
{
	public static void main(String[] args) {

		int notes[] = new int[] {1000,500,100,50,10,5,2,1};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of Change");
		int change = sc.nextInt();
		
		System.out.println("Amount of 1000 "+ change/1000);
		System.out.println("Amount of 500 " +(change%1000)/500);
		System.out.println("Amount of 100 " +((change%1000)%500)/100);
		System.out.println("Amount of 50 " +(((change%1000)%500)%100)/50);
		System.out.println("Amount of 10 " +((((change%1000)%500)%100)%50)/10);
		System.out.println("Amount of 5 " +(((((change%1000)%500)%100)%50)%10)/5);
		System.out.println("Amount of 2 " +((((((change%1000)%500)%100)%50)%10)%5)/2);
		System.out.println("Amount of 1 " +(((((((change%1000)%500)%100)%50)%10)%5)%2)/1);
	}
}
