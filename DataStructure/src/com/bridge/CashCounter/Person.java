package com.bridge.CashCounter;

public class Person {
	String name;
	int balance;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = this.balance + balance;
	}
	
	public Person(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
}
