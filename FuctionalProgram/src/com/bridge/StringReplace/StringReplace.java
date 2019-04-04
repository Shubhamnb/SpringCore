package com.bridge.StringReplace;

/*
 * @author : Shubham Bohari
 * @purpose : User Input and Replace String Template
 * 			: “Hello <<UserName>>, How are you?” 	
 * 	
 * */
import java.util.Scanner;

public class StringReplace {
	
	public static void stringReplace(String str1,String str2) {
		String str3 = str1.replaceAll("<<UserName>>", str2);
		System.out.println(str3);
	}
	
	public static void main(String[] args) {
		String str1 = "Hello <<UserName>>,How are you?";
		String str2 = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the UserName :");
		str2 = sc.next();
		if(str2.length() < 3) {
			System.out.println("Enter a String with more than 3 Charachter");
		}
		else {
			stringReplace(str1,str2);
		}
	}
}
