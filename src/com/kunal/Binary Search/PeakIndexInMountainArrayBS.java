package com.kunal;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeakIndexInMountainArrayBS {
	public static void main(String[] args) {
	}

	public int peakIndexInMountainArray(int[] arr) {
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


}
