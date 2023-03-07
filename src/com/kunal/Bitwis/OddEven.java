package com.kunal;

public class OddEven {
	public static void main(String[] args) {

//		int n = 45;
		int n = 58;
		OddEven(n);
		System.out.println(isOdd(n));

	}

	static void OddEven(int n){
		if ((n & 1) == 1){
			System.out.println("Odd");
		}
		else {
			System.out.println("Even");
		}
	}

	static boolean isOdd(int n){
		return (n & 1) == 1;
	}

}
