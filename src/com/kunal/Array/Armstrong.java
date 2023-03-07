package com.kunal;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();

//		System.out.println(isPrime(n));
//		System.out.println(isArmstrong(n));

		for(int i =100; i<1000; i++){
			if(isArmstrong(i)){
				System.out.print(i+ ", ");
			}
		}

	}

	// check prime number
	static boolean isPrime(int n) {
		int c = 2;

		if (n <= 1) {
			return false;
		}
		while (c * c < n) {
			if (n % c == 0) {
				return false;
			}
			c++;
		}
		return c * c > n;
	}


	//print all the 3 digits armstrong number
	static boolean isArmstrong(int n) {

		int original = n;
		int sum = 0;

		while (n > 0) {
			int rem = n % 10;
			n /= 10;
			int cube = rem * rem * rem;
			sum = sum + cube;
		}
		return sum == original;
	}
}