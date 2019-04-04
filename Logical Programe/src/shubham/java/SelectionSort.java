package shubham.java;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = {56,32,15,62,34,18,95};
		
		
		for(int i=0;i<6;i++) {
			for(int j=i+1;j<7;j++) {
				if(arr[i]>arr[j]) {
					int temp;
					temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
