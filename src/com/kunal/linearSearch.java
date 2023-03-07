package com.kunal;

import java.util.Arrays;

public class linearSearch {
	public static void main(String[] args) {

		int[] arr = {9, 34, 54, 7, 8, 5, 13};
//		System.out.println(linearS(arr,0));
//		System.out.println(linearS2(arr,7));

		//String
		String str = "kunal";
		System.out.println(SearchInString(str,'u'));
		System.out.println(SearchInString2(str,'a'));

		// print all str character in array
		System.out.println(Arrays.toString(str.toCharArray()));

		// find min value in array
		System.out.println(minValue(arr));

		// linear search in 2D array
		int[][] demo ={
				{2, 3, 6},
				{5, 12, 4, 6},
				{7, 13, 78, 65},
				{9, 14}
		};
		int target = 78;
		int[] ans = LinearSearch2D(demo,target);
		System.out.println(Arrays.toString(ans));

	}

	static int linearS(int[] arr, int num){
		if (arr.length == 0){
			return -1;
		}
		for (int i = 0; i <arr.length ; i++) {
			if(arr[i] == num){
				return i;
			}
		}
		return -1;
	}

	static int linearS2(int[] arr, int num){
		if (arr.length == 0){
			return -1;
		}
		// for each loop
		for (int element : arr) {
			if(element == num){
				return element;
			}
		}
		return -1;
	}


    static boolean SearchInString(String str, char targate){
		if(str.length() == 0){
			return false;
		}

	    for (int i = 0; i <str.length(); i++) {
			if (targate == str.charAt(i)){
				return true;
			}
	    }return false;

    }

    // for each loop
	static boolean SearchInString2(String str, char targate){
		if(str.length() == 0){
			return false;
		}

		for (int ch : str.toCharArray()) {
			if (targate == ch){
				return true;
			}
		}return false;

	}

	static int minValue(int[] arr){
		int min = arr[0];
		for (int i = 0; i < arr.length ; i++) {
			if (arr[i]<min){
				min = arr[i];
			}
		}
		return min;

	}


	// linear search in 2D array
	static int[] LinearSearch2D(int[][] arr, int targat){

		for (int row = 0; row<arr.length; row++){
			for (int col = 0; col<arr[row].length; col++){
				if (arr[row][col] == targat){
					return new int[]{row, col};
				}
			}
		}
		return new int[]{-1, -1};
	}

}
