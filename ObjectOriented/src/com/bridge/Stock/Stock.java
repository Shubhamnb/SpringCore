package com.bridge.Stock;

public class Stock {
	String name;
	int noOfShare;
	int price;
	
	//Parameterise Constructor
	public Stock(String name, int noOfShare, int price) {
		this.name = name;
		this.noOfShare = noOfShare;
		this.price = price;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfShare() {
		return noOfShare;
	}
	public void setNoOfShare(int noOfShare) {
		this.noOfShare = noOfShare;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
