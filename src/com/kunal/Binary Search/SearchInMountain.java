package com.kunal;

// https://leetcode.com/problems/find-in-mountain-array/

public class SearchInMountain {
	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,3,1};
		int target = 3;
		System.out.println(search(arr, target));
	}

	static int search(int[] arr, int target){
		int peak = peakIndexInMountainArray(arr);
		int firstHalf = orderAgnostic(arr,target, 0, peak);
		if(firstHalf != -1 ){
			return firstHalf;
		}
		return orderAgnostic(arr,target,peak +1, arr.length - 1);
	}



	static int peakIndexInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end){
			int mid = start +(end - start)/2;

			if (arr[mid] > arr[mid + 1] ){
				// you are in dec part of array
				// this may be ans, but look at left
				// this is why end ! = mid - 1;
				end = mid;
			}
			else {
				// you are in ace part of array
				start = mid +1;
			}
		}
		return end; // we can write start also bcz start == end pointing to largest number in array
	}

	static int orderAgnostic(int[] arr, int target, int start, int end){
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
