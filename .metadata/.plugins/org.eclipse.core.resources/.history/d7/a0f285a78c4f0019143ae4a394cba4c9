package com.bridge.utility;

public class Utility {
	//method for Integer Binary Search
	public static int binarySearch(int ar[], int ele) {
		int st=0, end=ar.length, mid=0;
		
		//Sorting Array Using Insertion Sort
		int arr[] = insertionSort(ar);
		
		//Logic for Binary Search
		while(st <= end) {
			mid=(st+end)/2;
			
			//If element found than return +VE
				if(arr[mid] == ele) {
					return mid+1;
				}
			//Start and end calculate
				if(arr[mid]<ele) {
					st=mid+1;
				}
				else {
					end=mid-1;
				}
		}
		return -1;
	}
	
	/********************Binary Search String Method******/
	public static int binarySearch(String ar[], String ele) {
		int st=0, end=ar.length, mid=0;
		
		//Sorting Array Using Insertion Sort
		String arr[] = insertionSort(ar);
		
		//Logic for Binary Search
				while(st <= end) {
					mid=(st+end)/2;
					
					//If element found than return +VE
						if(arr[mid].equalsIgnoreCase(ele)) {
							return mid+1;
						}
					//Start and end calculate
						if(arr[mid].compareToIgnoreCase(ele) < 0) {
							st=mid+1;
						}
						else {
							end=mid-1;
						}
				}
		return -1;
	}
	
	/**************** Method for insertion Sort ******************/
	public static int[] insertionSort(int arr[]) {
		
		int j=0;
		int key=0;
		for(int i=1; i < arr.length; i++) {
			j=i-1;
			key = arr[i];
			while(j >= 0 && arr[j] > key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		return arr;
	}
	
	/*****************Method for insertion sort ******************/
	public static String[] insertionSort(String inputArray[]) {
		int lineNumber = inputArray.length;
	    int i,j;
	    String key;
		for (j = 1; j < lineNumber; j++) {
	        key = inputArray[j];
	        i = j - 1;
	        while (i >= 0) {
	            if (key.compareTo(inputArray[i]) > 0) {
	                break;
	            }
	            inputArray[i + 1] = inputArray[i];
	            i--;
	        }
	        inputArray[i + 1] = key;
		}
		return inputArray;
  }
	
	/******************Method for Bubble Sort Integer***********************/
	public static int[] bubbleSort(int arr[]) {
		for(int i=1; i < arr.length; i++) {
			for(int j=0; j < arr.length-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp;
					temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	
	
	/******************Method for Bubble Sort String***********************/
	public static String[] bubbleSort(String arr[]) {
		for(int i=1; i < arr.length; i++) {
			for(int j=0; j < arr.length-i; j++) {
				if(arr[j].compareTo(arr[j+1]) > 0) {
					String temp;
					temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	
	/************************Display Array element***************************/
	public static void displayArray(int[] arr) {
		for (int i : arr) {
			  System.out.print(i+" ");
		}

	}
	public static void displayArray(String[] str) {
		for (String i : str) {
			  System.out.print(i+" ");
		    }
	}
}
