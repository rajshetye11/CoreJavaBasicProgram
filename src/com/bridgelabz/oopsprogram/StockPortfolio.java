package com.bridgelabz.oopsprogram;

import java.util.Scanner;

public class StockPortfolio {
	public Stock [] arr;
	public String stockName;
	public int noOfShares;
	public int sharePrice;
	public int stockReport;
	
	public StockPortfolio() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Stocks to add");
		int num = sc.nextInt();
		arr = new Stock[num];

		for(int i = 0; i< num ; i++)
		{
			System.out.println("Enter Stock Name ");
			stockName = sc.next();
			System.out.println("Enter No of Shares");
			noOfShares = sc.nextInt();
			System.out.println("Enter Share Price ");
			sharePrice = sc.nextInt();
			arr[i]= new Stock(stockName,noOfShares,sharePrice);
		}
		for (int j=0;j<num;j++) {
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
			StockPortfolio sp = new StockPortfolio();
			sp.stockReport();
			
		}
		
}
