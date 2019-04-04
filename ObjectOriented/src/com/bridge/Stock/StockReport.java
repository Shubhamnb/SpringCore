package com.bridge.Stock;

import java.util.Scanner;
/*
 * @author : Shubham Bohari
 * 
 * */
public class StockReport {

	public static void main(String[] args) {
		Stock[] stock = getStock();
		calculateAndDisplayStock(stock);
	}
	
	/*************This Method Calculate each Stock Value And DIsplay Stock Data********/
	private static void calculateAndDisplayStock(Stock[] stock) {
		for (int i = 0; i < stock.length; i++) {
			System.out.println("============="+stock[i].name+"=============");
			System.out.println("NoOfShare  :: "+stock[i].noOfShare);
			System.out.println("Price      :: "+stock[i].price);
			System.out.println("StockValue :: "+(stock[i].noOfShare * stock[i].price));
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}
	
	
	/**************This Method Get Input From Stock User*********/
	private static Stock[] getStock() {
		Scanner sc = new Scanner(System.in);
		int numOfStock = 0;
		Stock[] stock = null;
		try {
			System.out.print("Enter a numbe of Stock :");
			numOfStock = sc.nextInt();
			stock = new Stock[numOfStock];
			for (int i = 0; i < numOfStock; i++) {
				System.out.print("Enter name, noOfShare, price of "+(i+1)+" stock :");
				stock[i] = new Stock(sc.next(), sc.nextInt(), sc.nextInt());
			}
			System.out.println();
			System.out.println();
		} catch (Exception e) {
			System.err.println("Wrong Input");
			//e.printStackTrace();
			System.exit(0);
		}
		return stock;
	}

}
