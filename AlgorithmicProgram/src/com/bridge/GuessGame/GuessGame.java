package com.bridge.GuessGame;

import java.util.Scanner;

public class GuessGame {

	public static void gessNumber(int n,Scanner sc) {
		int arr[] = new int[n];
		int st=1;
		int end=arr.length;
		int mid=0;
		boolean flag = false;
		System.out.println("Input : {true} - {false}");
		while(st != end) {
			mid = (st+end) / 2;
			System.out.print("{"+st+"-"+mid+"} - "+"{"+(mid+1)+"-"+end+"} :");
			flag = sc.nextBoolean();
			if(flag == true) {
				end = mid;
			}else {
				st = mid+1;
			}
			System.out.println();
		}
		System.out.print("Your Number is : "+st);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		try {
			System.out.print("Enter N value :");
			n = sc.nextInt();
			System.out.println("Think a number between 1 to "+n);
			gessNumber(n, sc);
		} catch (Exception e) {
			System.out.println("Wrong Input");
			e.printStackTrace();
			System.exit(0);
		}
	}

}
