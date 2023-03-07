package com.kunal;

import java.util.Arrays;

public class MaxArray {
	public static void main(String[] args) {
		   int[] arr = {3, 2, 4, 6, 34, 9};
//		System.out.println(max(arr));
//		System.out.println(maxRange(arr,1, 3));
		reverse(arr);
		System.out.println(Arrays.toString(arr));

		}


	static  int maxRange(int[] arr,int start, int end){
		int max = start;
		for (int i = 0; i <=end; i++) {
			if (arr[i] > max){
				max= arr[i];
			}
		}
		return max;
	}



	static  int max(int[] arr){
		int max = arr[0];
		for (int i = 0; i <arr.length; i++) {
			if (arr[i] > max){
				max= arr[i];
			}
		}
		return max;
	}

	static void swap(int[] arr, int index1, int index2){
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}


	static void reverse(int[] arr){
		int start = 0;
		int end = arr.length - 1;

		while (start < end){
			swap(arr, start,end);
			start++;
			end--;
		}

	}







}
