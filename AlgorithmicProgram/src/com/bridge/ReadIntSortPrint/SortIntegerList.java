package com.bridge.ReadIntSortPrint;

import java.util.Scanner;

import com.bridge.utility.Utility;

public class SortIntegerList {

	public static int[] sortInteger(int[] ar) {
		return Utility.bubbleSort(ar);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr ;
		int num = 0;
		int ar[] = null;
		try {
			System.out.print("Enter number : ");
			num = sc.nextInt();
			arr = new int[num];
			System.out.println("Enter "+num+" Element :");
			for (int i = 0; i < num; i++) {
				arr[i] = sc.nextInt();
			}
			ar = sortInteger(arr);
			System.out.print("Your sorted Integer list : ");
			for (int i : ar) {
				System.out.print(i+" ");
			}
		} catch (Exception e) {
			System.out.println("Wrong Input");
			System.exit(0);
		}
	}

}
