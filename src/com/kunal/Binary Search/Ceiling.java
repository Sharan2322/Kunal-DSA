package com.kunal;

// smallest number grater or = target
public class Ceiling {
	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 9, 14, 16, 18};
		System.out.println(ceiling(arr, 15));


	}

     // return the index of smallest no. >= target
	static int ceiling(int[] arr, int target){
		if (target > arr[arr.length -1]){
			return -1;
		}

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
				return mid;
			}
		}
		return start;
	}
}

