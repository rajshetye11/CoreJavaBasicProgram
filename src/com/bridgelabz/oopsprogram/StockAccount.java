package com.bridgelabz.oopsprogram;

import java.util.Scanner;

public class StockAccount {
	public Stock [] arr;
	public String stockName;
	public int noOfShares;
	public int sharePrice;
	public int stockReport;
	public Scanner sc = new Scanner(System.in);
	
	public StockAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Stocks to add");
		int num = sc.nextInt();
		arr = new Stock[num];
		addStock();
		
	}
	
	public void addStock() {
		for(int i = 0; i< arr.length ; i++)
		{
			System.out.println("Enter Stock Name ");
			stockName = sc.next();
			System.out.println("Enter No of Shares");
			noOfShares = sc.nextInt();
			System.out.println("Enter Share Price ");
			sharePrice = sc.nextInt();
			arr[i]= new Stock(stockName,noOfShares,sharePrice);
		}
	}
	
	public void buyStock() {
		System.out.println("Enter the name of company to buy stocks");
		String company = sc.nextLine();
		for (int i = 0; i < arr.length; i++) {
			String companyName = (String)this.arr[i].stockName;
			if(companyName.equals(company))
			{
				System.out.println("Enter the no of Shares you want to buy?");
				int buy = sc.nextInt();
				arr[i].noOfShares += buy;
			}
		}
	}
	
	public void sellStock() {
		System.out.println("Enter the name of company to sell stocks");
		String company = sc.nextLine();
		for(int i =0;i<arr.length;i++) {
			String companyName2 = (String)this.arr[i].stockName;
			if(companyName2.equals(company)) {
				System.out.println("Enter the no of Shares you want to sell?");
				int sell=sc.nextInt();
				arr[i].noOfShares -= sell;
			}
		}
	}
	
	public void printReport() {
		for (int j=0;j<arr.length;j++) {
			arr[j].calculateStockReport();
		}
		for (int i=0; i<arr.length; i++) {
			int totalValue = arr[i].sharePrice*arr[i].noOfShares;
			stockReport += totalValue;		
		}
	}
	
	public void stockReport() {
		int stockReport = 0;
		System.out.println();
		for (int i=0; i<arr.length; i++) {
			int totalValue = arr[i].sharePrice*arr[i].noOfShares;
			stockReport += totalValue;
					
		}
		System.out.println("Total value of Stocks : "+stockReport);
	}
		public static void main(String [] args)
		{
			StockAccount sp = new StockAccount();
			sp.stockReport();
			Scanner sc = new Scanner (System.in);
			while(true) {
				System.out.println("Choose below options "+"\n1) Add the stocks"+"\n2)buy stocks"+"\n3) sell stocks"+"\n4) printReport"+"\n5) stockReport");
				int option = sc.nextInt();
					switch(option) {
					case 1:
						sp.addStock();
						break;
					case 2:
						sp.buyStock();
					case 3:
						sp.sellStock();
						break;
					case 4:
						sp.printReport();
						break;
					case 5 :
						sp.stockReport();
					}
				}
		}
		
}
