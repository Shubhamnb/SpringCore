package com.bridge.MonthalyPayment;

import java.util.Scanner;

public class MonthalyPayment {
	
	public static double monthalyPayment(double P, double R, double Y) {
		double n = 0.0;
		double r = 0.0;
		double q = 0.0;
		double result = 0.0;
		n = 12 * Y;
		r = R / (12 * 100);
		q =  Math.pow((1+r), (-n));
		result =  ((P * r) / (1 - q));
		return result;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double p = 0.0, y = 0.0, r = 0.0;
		double payment = 0.0;
		double result = 0.0;
		try {
			System.out.print("Enter Principal Amount :");
			p = sc.nextInt();
			System.out.print("Enter Interest :");
			r = sc.nextInt();
			System.out.print("Enter no of Year :");
			y = sc.nextInt();
			result = monthalyPayment(p, r, y);
			System.out.println(result);
		} catch (Exception e) {
			System.err.println("Wrong Input");
			e.printStackTrace();
			System.exit(0);
		}

	}

}
