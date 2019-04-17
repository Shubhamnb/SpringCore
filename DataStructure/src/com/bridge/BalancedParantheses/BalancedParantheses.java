package com.bridge.BalancedParantheses;
/*
 * @author : Shubham Bohari
 * 
 * */
import java.util.Scanner;

public class BalancedParantheses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = null;
		int num = 0;
		
		try {
			//System.out.print("Enter the Stack Size : ");
			Stack st = new Stack(15);
			//num = sc.nextInt();
			System.out.print("Enter the Arithematic Expression : ");
			str = sc.nextLine();
			char ch[] = str.toCharArray();
				for (int i = 0; i < ch.length; i++) {
					if(ch[i] == '(') {
						st.push(ch[i]);
					}
					if(ch[i] == ')') {
						st.pop(ch[i]);
					}
				}
			if(st.isEmpty()) {
				System.out.println("Balanced Parantheses");
			}else {
				System.out.println("UnBalanced Parantheses");
			}
			
			
		}catch (Exception e) {
			System.err.println("Wrong Input");
			e.printStackTrace();
			System.exit(0);
		}

	}

}
