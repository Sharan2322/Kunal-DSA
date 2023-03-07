package com.kunal;

 //https://leetcode.com/problems/first-missing-positive/

public class firstMissingPositive {
	public int firstMissingPositive(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int correct = nums[i] -1;  // range --> (1 to n)
			if (nums[i] > 0 && nums[i]  != nums[correct]){
				swap(nums, i, correct);
			}else {
				i++;
			}
		}

		// search for first missing number
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != index + 1){
				return  index + 1;
			}
		}

		// case 2
		return nums.length + 1;
	}


	static void swap(int[] arr, int start, int end){
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
