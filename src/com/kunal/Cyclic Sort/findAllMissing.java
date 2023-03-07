package com.kunal;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class findAllMissing {
	public static void main(String[] args) {


	}

	public List<Integer> findDisappearedNumbers(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int correct = nums[i] - 1;
			if (nums[i] != nums[correct]) {
				swap(nums, i, correct);
			} else {
				i++;
			}
		}

		// find missing no.
		List<Integer> ans = new ArrayList<>();
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != index + 1) {
				ans.add(index + 1);
			}
		}
		return ans;
	}


		static void swap(int[] arr, int start, int end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}




	}



