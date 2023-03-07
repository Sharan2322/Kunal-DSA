package com.kunal;

//https://leetcode.com/problems/missing-number/

public class MissingNumber {
	public static void main(String[] args) {


	}

	public int missingNumber(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int correct = nums[i] ;  // range --> (1 to n)
			if (nums[i] < nums.length && nums[i]  != nums[correct]){
				swap(nums, i, correct);
			}else {
				i++;
			}
		}

		// search for first missing number
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != index){
				return  index;
			}
		}

		// case 2
		return nums.length;
	}


	static void swap(int[] arr, int start, int end){
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}



}
