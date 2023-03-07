package com.kunal;

public class sumOfDigits_Rec {
	public static void main(String[] args) {
		System.out.println(sumDigit(1234));
	}

	static int sumDigit(int n){
		if (n == 0){
			return 0;
		}

//		int rem = n % 10;
//		return rem + sumDigit(n/10);

		return n%10 + sumDigit(n/10);

	}
}
