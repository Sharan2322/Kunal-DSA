package com.kunal;

// https://leetcode.com/problems/set-mismatch/

public class SetMIsmatch {
	public int[] findErrorNums(int[] nums) {

		int i = 0;
		while (i < nums.length) {
			int correct = nums[i] - 1 ;  // range --> (1 to n)
			if (nums[i]  != nums[correct]){
				swap(nums, i, correct);
			}else {
				i++;
			}
		}

		// search for first missing number
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != index + 1){
				return new int[]{nums[index], index + 1};
			}
		}

		// case 2
		return new int[]{-1, -1};
	}


	static void swap(int[] arr, int start, int end){
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

	}

