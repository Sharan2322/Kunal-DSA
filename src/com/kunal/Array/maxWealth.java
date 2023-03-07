package com.kunal;

//https://leetcode.com/problems/richest-customer-wealth/description/

public class maxWealth {
	public static void main(String[] args) {
		int[][] arr = {{1,3,4},{9,5},{5,3,2}};
		System.out.println(maximumWealth(arr));

	}
	static int  maximumWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;
		for (int person = 0; person < accounts.length ; person++) {
			int sum = 0;
			for (int account = 0; account < accounts[person].length ; account++) {
				sum += accounts[person][account];
			}
			if (sum > max){
				max = sum;
			}
		}
		return max;
	}




}
