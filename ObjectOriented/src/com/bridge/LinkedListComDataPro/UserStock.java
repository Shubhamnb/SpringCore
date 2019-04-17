package com.bridge.LinkedListComDataPro;

public class UserStock {
	private String userName;
	private String noOfShares;
	private String price;

	

	public UserStock() {
	}

	public UserStock(String userName, String noOfShares, String price) {
		this.userName = userName;
		this.noOfShares = noOfShares;
		this.price = price;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNoOfShares() {
		return noOfShares;
	}

	public void setNoOfShares(String noOfShares) {
		this.noOfShares = noOfShares;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return " [userName=" + userName + ", noOfShares=" + noOfShares + ", price=" + price + "]";
	}
}
