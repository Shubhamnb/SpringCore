package shubham.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine {
	
	public static void machinVending(int n) {
		Map map = new HashMap();
		int arr[] = {1000, 500, 100, 50, 10, 5, 2, 1};
		/*
		 *
		 */
		
		int i = 0;
		while(i < arr.length) {
			if(n / arr[i] > 0) {
				map.put(arr[i], n/arr[i]);
				n = n % arr[i];
			}
			i++;
		}
		System.out.println(map);
	}
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int num = 0;
	   try {
		System.out.println("Enter the number");
		num = sc.nextInt();
		machinVending(num);
	} catch (Exception e) {
		System.out.println("Wrong Input");
		e.printStackTrace();
		System.exit(0);
	}
   }
}
