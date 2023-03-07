package com.kunal;

public class CountZeros_Rec {
	public static void main(String[] args) {
		System.out.println(count(204010005));

	}

	static int count(int n){
		return halper(n, 0);
	}

	// special pattern, how to pass a number to above calls
	static int halper(int n, int c){
		if (n == 0){
			return c;
		}
		int rem = n%10;
		if (rem == 0){
			return halper(n/10, c+1);
		}
		return halper(n/10, c);
	}
}
