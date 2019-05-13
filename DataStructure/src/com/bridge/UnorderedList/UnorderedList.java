package com.bridge.UnorderedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UnorderedList {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("/home/admin3/Shubham/file.txt");
		Scanner sc = new Scanner(file);
		Scanner sc1 = new Scanner(System.in);
		String str[] = sc.nextLine().split(" ");
		String str1 = null;
		try {
			LinkedList list = new LinkedList();
			
			
			for (int i = 0; i < str.length; i++) {
				list.add(str[i]);
			}
			list.show();
			System.out.print("Enter a word :");
			str1 = sc1.next();
			if(list.search(str1)) {
				list.remove(str1);
			}else {
				list.add(str1);
			}
			System.out.println();
			list.show();
		} catch (Exception e) {
			System.err.println("Wrong Input");
			e.printStackTrace();
			System.exit(0);
		}

	}

}
