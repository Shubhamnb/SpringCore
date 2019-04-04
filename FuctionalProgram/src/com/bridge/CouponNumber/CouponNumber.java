package com.bridge.CouponNumber;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CouponNumber {
	
	public static void couponNumber(int num) {
		
		Random ran = new Random();
		Set set = new HashSet();
		int ranNumber = 0;
		
		for (int i = 0; i < num; i++) {
			ranNumber = ran.nextInt(100);
			set.add(ranNumber);
		}
		System.out.println(set);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		try {
			System.out.print("Enter a Number :");
			num = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Wrong Input");
			System.exit(0);
		}
		couponNumber(num);
	}

}
