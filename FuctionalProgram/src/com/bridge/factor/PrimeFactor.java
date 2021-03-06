package com.bridge.factor;
/*
 * @author : Shubham Bohari
 * purepose: Computes the prime factorization of N using brute 
 * 		   : force.
 *
 * */
import java.util.Scanner;

public class PrimeFactor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("Enter the Number :");
		try {
			 num = sc.nextInt();
		}
		catch (Exception e) {
			System.out.println("Input is wrong");
			System.exit(0);
		}
		
		//Logic for finding a factor
		while(num != 0) {
			for (int i = 2; i <= num; i++) {
				if(num % i == 0) {
					System.out.print(i+" ");
					num = num/i;
					break;
				}
			}
		}
	}
}
