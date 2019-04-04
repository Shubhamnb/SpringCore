package com.bridge.ToBinary;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		
		try {
			System.out.print("Enter the number in Decimal :");
			num = sc.nextInt();
			int count = 0;
			int[] arr = {128, 64, 32, 16, 8, 4, 2, 1};
			char temp = 0;
			char ar[] = ToBinary.toBinary(num);
			for (int c : ar) {
				System.out.print(c);
			}
			// logic for swapping
			
			 for (int i = 0, j = 4; i < 4; i++, j++) {
				 temp = ar[i];
				 ar[i] = ar[j];
				 ar[j] = temp;
			 }
			 
			 //logic for counting new number
			 for (int i = 0; i < ar.length; i++) {
				if(ar[i] == 1)
					count = count + arr[i];
			}
			 
			 System.out.println();
			for (int c : ar) {
				System.out.print(c);
			}
			System.out.println();
			 System.out.println(count);
		} catch (Exception e) {
			System.err.println("Wrong input");
			System.exit(0);
		}
	}

}
