package com.bridge.Hash;



import com.bridge.OrderedList.LinkedList1;

public class Hashing {
	LinkedList1[] list = new LinkedList1[11];
	
	
	/**CONSTRUCTOR FOR INITHIALIZING LIST ARRAY**/
	public Hashing() {
		for (int i = 0; i < list.length; i++) {
			list[i] = new LinkedList1();
		}
	}
	
	
	/****METHODE TO ADD ELEMENT IN APPROPRIAT POSITION****/
	public void addHash(int num) {
		int mod = num % 11;
		//System.out.println(mod);
		list[mod].add(num);
	}

	
	/*****METHODE TO DISPALY HASH ELEMENT*******/
	public void showHash() {
		for (int i = 0; i < list.length; i++) {
			System.out.print(i+" ");
			if(list[i].isEmpty()) {
				System.out.println("[///////]");
			}else {
				list[i].show();
			}
		}
	}
	
	/*****METHODE TO SEARCH HASH ELEMENT*******/
	public boolean search(int num) {
		 int mod = num % 11;
		 if(list[mod].search(num))
			 return true;
		return false;
	}
	
	
	/*****METHODE TO REMOVE HASH ELEMENT*******/
	public void remove(int num) {
		int mod = num % 11;
		list[mod].remove(num);
	}
	
}
