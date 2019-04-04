import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.bridge.utility.Utility;

public class RafeWork {

	public static void main(String[] args) throws FileNotFoundException {
		 
		ArrayList<String> list = new ArrayList<String>();
		
		String str2[];
		int i = 0;
		String searchWord = null;
		    // pass the path to the file as a parameter 
		    File file = 
		      new File("/home/admin3/Shubham/file.txt"); 
		    Scanner sc = new Scanner(file); 
		    Scanner sc1 = new Scanner(System.in);
		  
		    while (sc.hasNext()) {
		    	list.add(sc.next());
		    }
		    String str[] = new String[list.size()];
		    System.out.println(list);
		    
		
		  Iterator<String> it = list.iterator(); 
		  while (it.hasNext()) { 
		  str[i] = it.next();
		  i++;
		  }
		  str2 = Utility.insertionSort(str);                                
		 for (String string : str2) {
			System.out.print(string+" ");
		}
		 System.out.println();
		 System.out.print("Enter a word : ");
		 searchWord = sc1.next();
		 
		 int a = Utility.binarySearch(str, searchWord);
		 System.out.print("Element is found :"+a);
		 
		 sc.close();
	}  
}
