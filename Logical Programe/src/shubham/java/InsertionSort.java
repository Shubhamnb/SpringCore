package shubham.java;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {12,35,24,21,16,11};
		int j=0;
		int key=0;
		for(int i=1;i<6;i++) {
			j=i-1;
			key = arr[i];
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
