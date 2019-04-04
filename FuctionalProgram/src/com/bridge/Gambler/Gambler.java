package com.bridge.Gambler;
/*
 * @author : Shubham Bohari
 * 
 * 
 * purepose: Simulates a gambler who start with $stake and place 
 * 			 fair $1 bets until he/she goes broke (i.e. has no 
 * 			 money) or reach $goal. Keeps track of the number of 
 * 			 times he/she wins and the number of bets he/she makes. Run the experiment N times, averages the results, and prints them out.
 *
 * 
 * */
import java.util.Random;
import java.util.Scanner;

public class Gambler {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int stake = 0,goal = 0,n = 0,i = 0;
		float bets = 0,wins = 0, trails = 0;
		try {
			System.out.print("Enter Stake :");
			stake = sc.nextInt();
			System.out.print("Enter goal :");
			goal = sc.nextInt();
		}
		catch (Exception e) {
			System.out.println("Input is wrong");
			System.exit(0);
		}
		
		//Logic for gambling
		if(stake >= goal){
			System.out.println("Stake cannot more then goal");
		}
		else {
			
			try {
				System.out.print("Enter trails :");
				trails = sc.nextInt();
			}
			catch (Exception e) {
				System.out.println("Input is wrong");
				System.exit(0);
			}
		
			for (i = 0; i < trails; i++) {
				 n= ran.nextInt(2);
				 if(n == 0) {
					 stake += -1;
					 bets++;
				 }
				 else {
					 stake += +1;
					 wins++;
				 }
				 if(stake == 0) {
					 System.out.println("****************-> Loos <-*****************");
					 break;
				 }
				 if(stake == goal) {
					 System.out.println("****************-> Wins <-*****************");
					 break;
				 }
			}
		
		
			System.out.println("Win Percentage :"+((wins/i)*100));
			System.out.println("bets Percentage :"+((bets/i)*100));
		}
	}//main
}//class
