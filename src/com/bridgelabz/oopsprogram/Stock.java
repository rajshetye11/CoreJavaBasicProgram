package com.bridgelabz.oopsprogram;

public class Stock {
	
	public String stockName;
	public int noOfShares;
	public int sharePrice;
	public int totalValue;
	public int stockReport;
	
	public Stock(String stockName, int noOfShares, int sharePrice){
		this.stockName = stockName;
		this.noOfShares = noOfShares;
		this.sharePrice = sharePrice;
	}
	
	public void calculateStockReport() {
		 totalValue = noOfShares*sharePrice;
		System.out.println("Total Value of "+noOfShares+" Shares of "+stockName+" is "+totalValue+ " Rs");
	}
	
	
}
