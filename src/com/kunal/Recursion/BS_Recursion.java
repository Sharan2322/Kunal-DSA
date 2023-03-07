package com.kunal;

public class BS_Recursion {
	public static void main(String[] args) {

		int[] arr = {2, 4, 6, 8, 45, 67};
		int target = 8;
		System.out.println(Bsearch(arr, target, 0, arr.length - 1));

	}


	static int Bsearch(int[] arr, int target, int s, int e){
		if (s > e){
			return -1;
		}
		int m = s + (e - s)/2;
		if (arr[m] == target){
			return m;
		}
		if (target < arr[m]){
			return Bsearch(arr, target, s, m - 1);
		}
		return Bsearch(arr, target, s + 1, e);
	}



}
