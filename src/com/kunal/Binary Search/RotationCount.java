package com.kunal;

public class RotationCount {
	public static void main(String[] args) {
		int[] arr = {4, 5, 6, 7, 0, 1, 2};
		System.out.println(countRotations(arr));

	}

	private static int countRotations(int[] arr) {
		int pivot = findPivot(arr);
		return pivot + 1;
	}


	// this will not work in duplicate values
	static int findPivot(int[] arr){
		int start = 0;
		int end = arr.length -1;
		int ans = -1;
		while (start <= end){
			int mid = start + (end - start)/2;
			// 4 case
			if ( mid < end && arr[mid] > arr[mid + 1]){
				return ans = mid;
			}
			if ( mid > start && arr[mid] < arr[mid - 1] ){
				return ans = mid - 1;
			}
			if (arr[mid] <= arr[start]){
				end = mid -1;
			}
			else {
				start = mid + 1;
			}
		}
		return ans;
	}




	// use this for duplicate values
	static int findPivotWithDuplicates(int[] arr){
		int start = 0;
		int end = arr.length -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			// if elements at middle, start, end are equal then just skip the duplicates
			if(arr[mid] == arr[start] && arr[mid] == arr[end]){
				// skip the duplicates
				// check whether start is pivot
				if (arr[start] > arr[start + 1]){
					return start;
				}
				start++;
				// check whether end is pivot
				if (arr[end] < arr[end - 1]){
					return  end - 1;
				}
				end--;
			}
			// left side is sorted, so pivot should be in right
			else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return -1;
	}






}
