package com.bridge.HarmonicNumber;
/*
 * @author : Shubham Bohari
 * purepose:  Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N 
 * 
 * */
import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		double harmo = 0.0;
		System.out.println("Enter the number : ");
		try {
			n = sc.nextInt();
		}
		catch (Exception e) {
			System.out.println("Input is wrong");
			System.exit(0);
		}
		for(int i=1;i<=n;i++) {
			harmo += 1.0/i;
			
		}
		System.out.println("Harmonic Number = "+harmo);
	}
}
