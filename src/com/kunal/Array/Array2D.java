package com.kunal;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// declaration
//		int[] demo = new int[5];

		// input from user
//		for (int i = 0; i <demo.length; i++) {
//			demo[i] = sc.nextInt();


		// output
//		for (int i = 0; i < demo.length; i++) {
//			System.out.print(demo[i] + ", ");
//		}
//		for(int i: demo){            // for each loop
//			System.out.print(i);
//		}
//		System.out.println(Arrays.toString(demo));


		/* 2D Array

		     1 2 3
		     4 5 6
		     7 8 9
		 */

//		int [][] arr = new int[3][]; //[3]--> row and it is compulsary, []--> col not compalsary

//		int [][] arr2D = {
//				{1, 2, 3,},     //0rh index
//				{4, 5, 6,},     //1st index
//				{7, 8, 9,}      //2nd index
//		};

		int [][] arr = new int[3][3];
		System.out.println(arr.length);  // no. of rows

		//input
		for(int row=0; row < arr.length; row++){
			// for each col in every row
			for(int col =0; col < arr[row].length; col++){
				arr[row][col] = sc.nextInt();
			}
		}

		//output
//		for(int row=0; row < arr.length; row++){
//			// for each col in every row
//			for(int col =0; col < arr[row].length; col++){
//				System.out.print(arr[row][col] + " ");
//			}
//			System.out.println();
//		}

//		for(int row=0; row < arr.length; row++){
//			System.out.println(Arrays.toString(arr[row]));
//		}

		for(int[] a : arr){
			System.out.println(Arrays.toString(a));
		}

	}
}
