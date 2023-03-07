package com.kunal;

public class NoOfDigits {
	public static void main(String[] args) {
		int n = 7875;
		int b = 2;     // base

		int ans = (int)(Math.log(n) / Math.log(b) + 1);

		System.out.println(ans);
	}
}
