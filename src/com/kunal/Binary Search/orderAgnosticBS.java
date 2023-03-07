package com.kunal;

public class orderAgnosticBS {
	public static void main(String[] args) {

		int[] arr = {23, 15, 12, 9, 8, 5, 1};
		System.out.println(orderAgnostic(arr, 9));

		int[] demo = {4, 7, 9, 13, 46, 68, 90};
		System.out.println(orderAgnostic(demo, 46));

	}

	static int orderAgnostic(int[] arr, int target){
		int start = 0;
		int end = arr.length - 1;
		boolean isAsc = arr[start] < arr[end];

		while (start <= end){
			int mid = start + (end - start)/2;
			if (arr[mid] == target){
				return mid;
			}

			if (isAsc){
				if (target < arr[mid]){
					end = mid - 1;
				}
				else {
					start = start + 1;
				}
			}
			else {
				if (target > arr[mid]){
					end = mid - 1;
				}
				else {
					start = start + 1;
				}
			}

		}
		return -1;
	}


}


