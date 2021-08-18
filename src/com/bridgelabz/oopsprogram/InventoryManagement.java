package com.bridgelabz.oopsprogram;

import java.util.Scanner;

public class InventoryManagement {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of items to add");
		int num = sc.nextInt();
		Inventory [] arr = new Inventory[num];
		String itemName;
		int weight;
		int price;
		
		for(int i = 0; i< num ; i++)
		{
			System.out.println("Enter Name ");
			itemName = sc.next();
			System.out.println("Enter weight");
			weight = sc.nextInt();
			System.out.println("Enter Price ");
			price = sc.nextInt();
			arr[i]= new Inventory(itemName,weight,price);
			
			arr[i].calculateTotal();
		}
		sc.close();
	}
}
