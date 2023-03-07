package com.kunal;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class findAllDuplicates {

	public List<Integer> findDuplicates(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int correct = nums[i] - 1 ;  // range --> (1 to n)
			if ( nums[i]  != nums[correct]){
				swap(nums, i, correct);
			}else {
				i++;
			}
		}

		// find duplicate element
		List<Integer> ans = new ArrayList<>();
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != index+1){
				ans.add(nums[index]);
			}
		}
		return ans;

	}

	static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
