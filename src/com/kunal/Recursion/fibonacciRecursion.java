package com.kunal;

public class fibonacciRecursion {
	public static void main(String[] args) {
//		int ans = fibo(50);
//		System.out.println(ans);

		for (int i = 0; i < 11; i++) {
			System.out.println(fiboFormula(i));
		}

		System.out.println(fiboFormula(50));


	}

	static int fiboFormula(int n){
		return (int) (( Math.pow(((1 + Math.sqrt(5))/2), n) - ( Math.pow(((1 - Math.sqrt(5))/2), n)))/ Math.sqrt(5));

//		return (int) (( Math.pow(((1 + Math.sqrt(5))/2), n))/ Math.sqrt(5));

	}


	static int fibo(int n){

		// base condition
		if (n < 2){
			return n;
		}

		// this is not tail recursion
		return fibo(n-1) + fibo(n-2);
	}

}
