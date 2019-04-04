package com.bridge.searchWordFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.bridge.utility.Utility;

public class SearchWordFromFile {
	
	public static int searchWord(String ele) throws FileNotFoundException {
		
		ArrayList<String> list = new ArrayList<String>();
		File file = new File("/home/admin3/Shubham/file.txt"); 
		Scanner sc = new Scanner(file); 
		String str2[];
		int result = 0;
		int i = 0;
		
		while (sc.hasNext()) {
	    	list.add(sc.next());
	    }
		
		String str[] = new String[list.size()];
		
		Iterator<String> it = list.iterator(); 
		  while (it.hasNext()) { 
		  str[i] = it.next();
		  i++;
		  }
		  str2 = Utility.insertionSort(str);
		  
		  result = Utility.binarySearch(str, ele);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ele = null;
		int result  = 0;
		try {
			System.out.print("Enter a word : ");
			ele = sc.next();
			result = searchWord(ele);
			if(result == -1){
				System.out.println("Element is not in a List ");
			}
			else {
				System.out.println("Eelement is found at : "+result);
			}
		}catch (Exception e) {
			System.out.println("Wrong Input");
			System.exit(0);
		}
	}

}
