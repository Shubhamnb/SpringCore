package com.bridge.bussiness;

public class Bank {
	String ac = "sbi123";
	int amount= 5000;
	
	public int deposite(String ac, int amount) throws AccountNumberNotFound {
		if(ac.equalsIgnoreCase(this.ac)) {
			System.out.println(" Deposite((Method))");
			this.amount = amount + this.amount;
			return amount;
		}
		else {
			throw new AccountNumberNotFound();
		}
	}
}
