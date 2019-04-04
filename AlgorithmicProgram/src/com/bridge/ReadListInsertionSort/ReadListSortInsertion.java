package com.bridge.ReadListInsertionSort;

import java.util.Scanner;

import com.bridge.utility.Utility;

public class ReadListSortInsertion {
	/****************Method for sort a list*********************/
	public static String[] sortList(String str) {
		String[] str2 = str.split(" ");
		String str3[] = Utility.insertionSort(str2);
		return str3;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = null;
		try {
			System.out.print("Enter a list of word :");
			str = sc.nextLine();
			String str1[] = sortList(str);
			for (String string : str1) {
				System.out.print(string+" ");
			}
		} catch (Exception e) {
			System.out.println("Wrong Input");
			System.exit(0);
		}
	}

}
