package com.bridge.SumZero;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TripletsSumZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set set = new HashSet();
		int arr[] = null;
		try {
			System.out.print("Enter the number :");
			arr = new int[sc.nextInt()];
			for (int i = 0; i < arr.length; i++) {
				set.add(sc.nextInt());
			}
		}
		catch (Exception e) {
			System.out.println("Wrong input :");
			System.exit(0);
		}
		Iterator iterator = set.iterator();
		for (int i = 0; i < arr.length; i++) {
			if(iterator.hasNext()) {
				arr[i] = (int)iterator.next();
			}
		}
		for (int i = 0; i < arr.length-3; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int k = j+1; k < arr.length; k++) {
					if(arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
				}
			}
		}

	}

}
