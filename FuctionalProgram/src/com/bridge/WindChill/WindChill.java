package com.bridge.WindChill;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = 0;
		int v = 0;
		int windChill = 0;
		try {
			System.out.print("Enter a tempreture : ");
			t = sc.nextInt();
			if (t > 50 ) {
				System.out.println("Temp must lower than 50");
				System.exit(0);
			}
			System.out.print("Enter Wind Speed : ");
			v = sc.nextInt();
			if (v > 120 || v < 3) {
				System.out.println("Wind Speed Is between 3 to 120");
				System.exit(0);
			}
		}catch (Exception e) {
			System.out.println("Wrong Input");
			System.exit(0);
		}
		windChill = (int) (35.74 + ((0.6215*t) + ((0.4275*t) - 35.74) * Math.pow( v, 0.16)));
		System.out.println("Wind Chill :: "+windChill);
	}

}
