package shubham.java;

import java.util.Scanner;

public class First1000PrimeNumber {

	
	public static void main(String[] args) {
			int count=0,c=0;
			int i=2;
			int arr[] = new int[168];
			int k=0;
			
			//System.out.println("Shubham");
			
			while(i < 1000) {
				if(i==2) {
					count++;
					System.out.print (i+" ");
					arr[k] = i;
					k++;
					i++;
					continue;
				}
				for(int j=2;j<i;j++) {
					if(i%j == 0) {
						break;
					}
					if(j == (i-1)) {
						arr[k] = i;
						System.out.print(i+" ");
						count++;
						k++;
					}
				}
				
				i++;
			}
		
		 
	}

}
