package com.kunal;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class EvenDigits_Leetcode {
	public static void main(String[] args) {

		int[] nums = {12, 345, 2, 63, 7896};
		System.out.println(FindNumbers(nums));
		System.out.println(digit2(3462));

	}
	static int FindNumbers(int[] nums){
		int count = 0;

		for (int i : nums){
			if (even(i)){
				count++;
			}
		}
		return count;
	}


	static boolean even(int nums){
		int numberOfDigits = digits(nums);
//		if (numberOfDigits % 2 == 0){
//			return true;
//		}
//		return false;

		return numberOfDigits % 2 == 0;
	}


	static int digits(int num){
		if (num < 0){
			num = num * -1;
		}
		if (num == 0){
			return 1;
		}
		int count = 0;
		while (num > 0 ){
			count++;
			num = num / 10;
		}
		return count;
	}

	static int digit2(int num){
		return (int)(Math.log10(num)) + 1;
	}


}
