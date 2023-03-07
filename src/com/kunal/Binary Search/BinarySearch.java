package com.kunal;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1, 3 , 4, 6, 78};
		System.out.println(binarySearch(arr, 4));

	}
	static int binarySearch(int[] arr, int target){
		int start = 0;
		int end = arr.length - 1;
		while(start <= end){
//			int mid = (start+end)/2;  // might be possible that it exceeds the range of integer in java
			int mid = start +(end - start)/2;
			if (target < arr[mid]) {
				end = mid - 1;
			}
			else if (target > arr[mid]){
				start = mid + 1;
			}
			else {
				// ans is found
				return mid;
			}
		}
		return -1;
	}
}
