package com.bridge.StringPermutation;

import java.util.Scanner;

public class StringPermutation {

	public static  void swap(char ch[], int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}
	public static void permutation(char ch[], int currerntIndex) {
		
		if(currerntIndex == ch.length-1) {
			System.out.println(String.valueOf(ch));
		}
		
		for (int i = currerntIndex; i < ch.length; i++)
		{
			swap(ch, currerntIndex, i);
			permutation(ch, currerntIndex + 1);
			swap(ch, currerntIndex, i);
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = null;
		try {
			System.out.print("Enter a String :");
			str = sc.next();
		}catch (Exception e) {
			System.out.println("Wrong Input");
			System.exit(0);
		}
		
		char ch[] = str.toCharArray();
		permutation(ch,0);
	}

}
