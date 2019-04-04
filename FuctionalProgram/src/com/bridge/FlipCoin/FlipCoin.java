package com.bridge.FlipCoin;
/*
 * @SHubham Bohari
 * @purpose : Flip Coin and print percentage of Heads and Tails
 *
 * 
 * */
import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
	/***Static Methode For Calculating Percentage***/
	public static void flipCoin(int num) {
		int head = 0;
		int tail = 1;
		float headPer = 0.0f,headCount = 0.0f;
		float tailPer = 0.0f,tailCount = 0.0f;
		Random ran = new Random();
		
		for (int i = 0; i < num; i++) {
			int no = ran.nextInt(2);
			 
			if (head == no) {
				headCount++;
			}
			else {
				tailCount++;
			}
		}
		headPer = (headCount/num) * 100;
		tailPer = (tailCount/num) * 100;
		System.out.println("Head :"+headPer+"%");
		System.out.println("Tail :"+tailPer+"%");
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		boolean flag = false;
		
		
		System.out.println("Enter the Number :");
		try {
			num =sc.nextInt();
		}
		catch (Exception e) {
			System.out.println("Input is wrong");
			System.exit(0);
		}
		
		
		
		
			if(num != (int)num) {
				System.out.println("Wrong Input ******");
			}
			else {
				flipCoin(num);
			}
		
		
	}
}
