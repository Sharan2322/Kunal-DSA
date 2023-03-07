package com.kunal;

public class Reverse_Rec {
	public static void main(String[] args) {

		rev(1234);
//		System.out.println(ans);

		System.out.println(rev2(1234));

		System.out.println(palindrom(1234321));
	}

	static int ans = 0;
	static void rev(int n){
		if (n == 0){
			return;
		}
		int rem = n%10;
		ans = ans*10 + rem;
		rev(n/10);
	}


	// sometimes you might need some additional in the argument
	// in that case, make another function
	static int rev2(int n){
		int digits = (int)(Math.log10(n) + 1);
		return helper(n, digits);
	}

	static int helper(int n, int digits){
		if (n%10 == n){
			return n;
		}

		int rem = n % 10;
		return rem * (int)(Math.pow(10,digits - 1)) + helper(n/10, digits -1);
	}



	static boolean palindrom(int n){
		return n == rev2(n);
	}

}
