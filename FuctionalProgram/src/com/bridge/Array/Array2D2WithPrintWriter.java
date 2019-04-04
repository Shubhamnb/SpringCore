package com.bridge.Array;

/*
 * @author : Shubham Bohari
 * @purpose : A library for reading in 2D arrays of integers, 
 * 			: doubles, or booleans from standard input and 
 * 			: printing them out to standard output.
 * */



import java.io.PrintWriter;
import java.util.Scanner;

public class Array2D2WithPrintWriter {
	
	public static void print(int arr[][], int row, int col) {
		PrintWriter pw = new PrintWriter(System.out);
		pw.write("Your Array is :");
		pw.println();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				pw.write(arr[i][j]+" ");
			}
				pw.println();
		}
		pw.flush();
		pw.close();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row =0,col = 0;
		
		
		try {
			System.out.print("Enter num of row's and coloumn's :");
			row = sc.nextInt();
			col = sc.nextInt();
			int [][]arr = new int[row][col];
			System.out.println("Enter Array elements "+row+" by "+col+" :");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			print(arr,row,col);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Wrong Input");
			System.exit(0);
		}
		
	}

}
