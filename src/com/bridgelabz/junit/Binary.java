package com.bridgelabz.junit;

import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {

	int decNum, res;
	String bin = "";
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	decNum = sc.nextInt();
	if (decNum > 255) {
		System.out.println("Enter Number between 1 to 255");
	} else {

		while (decNum > 0) {
			res = decNum % 2;
			bin = res + "" + bin;
			decNum = decNum / 2;
		}

		System.out.println("Binary is: " + bin);
	}
}
}
