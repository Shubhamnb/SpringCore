package com.bridge.FeraniteCelsius;

import java.util.Scanner;

public class TemperaturConversion {

	public static int  temperaturConversion(String str) {
		int fahrenheit = 0;
		int celsius = 0;
		
		if(str.charAt(str.length()-1) == 'c' || str.charAt(str.length()-1) == 'C') {
			celsius = Integer.parseInt(str.substring(0,str.length()-2));
			
		}
		else {
			fahrenheit = Integer.parseInt(str.substring(0,str.length()-2));
			
		}
		if(celsius == 0) {
			celsius = (fahrenheit - 32) * 5/9;
			System.out.print("Converted from F to C :: "+celsius);
		}else {
			fahrenheit = (celsius * 9/5) + 32;
			System.out.println("Converted from C to F :: "+fahrenheit);
		}
			
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = null;
		
		try {
			System.out.print("Enter a Tempretur in Celsius or Fahrenheit :: ");
			str = sc.next();
			temperaturConversion(str);
		} catch (Exception e) {
			System.err.println("Wrong Input");
			System.exit(0);
		}

	}

}
