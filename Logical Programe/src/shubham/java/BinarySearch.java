package shubham.java;


import java.util.Scanner;


public class BinarySearch {
	public static int binarySearch(int arr[],int ele) {
		
		//Sort the Array
		for(int i=1;i<=arr.length;i++) {
			for(int j=0;j<(arr.length-i);j++) {
				if(arr[j]>arr[j+1]) {
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for (int i : arr) { System.out.print(i+" "); }
		System.out.println();
		
		int st=0;
		int end=arr.length;
		int mid=0;
		//System.out.println(st+" "+end);
		//Logic for Binary Search
		while(st <= end) {
			mid=(st+end)/2;
			
			
			if(arr[mid] == ele) {
				return mid+1;
			}
			if(arr[mid]<ele) {
				st=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= {10,52,64,75,35,95,24,16};
		int ele = 0;
		
		
		
		System.out.println("Enter a Search number");
		ele = sc.nextInt();
		
		  int result = binarySearch(arr,ele); 
		  if(result == 0) {
		  System.out.println("The Number is not present"); 
		  } 
		  else {
		  System.out.println("The Number is found at Location "+result);
		  }
	}
}
