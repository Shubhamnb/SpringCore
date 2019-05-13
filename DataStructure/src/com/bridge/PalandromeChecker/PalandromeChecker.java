package com.bridge.PalandromeChecker;

import java.util.Scanner;

public class PalandromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = null;
		DeQueue dq = new DeQueue(15);
		boolean flag = false;
		try {
			System.out.print("Enter a String : ");
			str = sc.next();
			for (int i = 0; i < str.length(); i++) {
				dq.rearEnqueue(str.charAt(i));
			}
			for (int i = 0; i < str.length()/2; i++) {
				if(dq.frontDequeue() != dq.rearDeQueue()) {
					flag = true;
					break;
				}
			}
			
			if(flag == true) {
				System.out.println("Not Palandrom");
			}else {
				System.out.println("Palandrom");
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
