package com.bridge.QudraticEquation;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0,b = 0,c = 0;
		try {
			System.out.print("ENter a coffiecient :");
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();                                   
		}catch (Exception e) {
			System.out.println("Wrong Input");
			System.exit(0);
		}
		int delta = b*b - 4*a*c;
		if(delta == 0) {
			System.out.print("root's are same : ");
			System.out.println(-b/2*a);
		}
		else {
			
		 System.out.println("roots are real and distict");
		 int xquderent = (int) (-b + Math.sqrt(delta))/(2*a);
		 int yquderent = (int) ((-b - Math.sqrt(delta))/(2*a));
		 System.out.println(xquderent+" "+" "+yquderent);
		}
	}	

}
