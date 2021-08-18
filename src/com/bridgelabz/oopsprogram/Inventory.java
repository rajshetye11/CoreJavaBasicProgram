package com.bridgelabz.oopsprogram;

public class Inventory {
	public String itemName;
	public int weight;
	public int price;
	public int itemTotal;
	
	
	public Inventory(String itemName, int weight, int price) {
		this.itemName = itemName;
		this.weight = weight;
		this.price = price;
	}

	public void calculateTotal() {
		itemTotal = weight * price;
		System.out.println("Total Value of "+weight+" Kg "+itemName+" is "+itemTotal+ " Rs");
	}
	
}
