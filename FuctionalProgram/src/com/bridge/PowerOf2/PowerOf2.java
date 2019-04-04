package com.bridge.PowerOf2;
/*
 * @auther : Shubham Bohari
 * purepose : This program takes a command-line argument N and
 * 			: prints a table of the powers of 2 that are less 
 * 			: than or equal to 2^N.
 * */
import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		 
		 int num = 0;
		 System.out.println("Enter the number ");
		 try {
			  num = Integer.parseInt(args[0]);
		 }
		 catch (Exception e) {
			 System.out.println("Input is wrong");
			 System.exit(0);
		}
		 int n = 1;
		 
		 // Logic for 1 to n power of 2 
			 if(num >= 0 && num < 31) { 
				 for(int i=0;i<num;i++) {
					 n = n * 2;
					 System.out.print("2^"+(i+1)+"=");
					 System.out.println(n+" ");
				 }
			 }
	}

}
