package com.kunal;


public class Patterns {
	public static void main(String[] args) {

		System.out.println("1");
		pattern1(4);

		System.out.println("2");
		pattern2(4);

		System.out.println("3");
		pattern3(4);

		System.out.println("4");
		pattern4(4);

		System.out.println("5");
		pattern5(5);

		System.out.println("5");
		pattern_5(5);

		System.out.println("9");
		pattern9(5);

		System.out.println("28");
		pattern28(5);

		System.out.println("30");
		pattern30(5);

		System.out.println("12");
		pattern12(5);

//		System.out.println("17");
//		pattern17(5);
//
//		System.out.println("31");
//		pattern31(4);
//
//		System.out.println("31");
//		pattern_31(4);




	}


	static void pattern1(int n){
		for (int row = 1; row <= n; row++) {
			// for every row, run the col
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			// when one row is printed, we need to add a newline
			System.out.println();
		}
	}

	static void pattern2(int n){
		for (int row = 1; row <= n; row++) {
			// for every row, run the col
			for (int col = 1; col <= n; col++) {
				System.out.print("* ");
			}
			// when one row is printed, we need to add a newline
			System.out.println();
		}
	}


	static void pattern3(int n){
		for (int row = n; row >= 1; row--) {
			// for every row, run the col
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			// when one row is printed, we need to add a newline
			System.out.println();
		}
	}



	static void pattern4(int n){
		for (int row = 1; row <= n; row++) {
			// for every row, run the col
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			// when one row is printed, we need to add a newline
			System.out.println();
		}
	}


//	static void pattern5(int n){
//		for (int row = 0; row <= n; row++) {
//			for (int i = 0; i <= row; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int row = n; row >1; row--) {
//			for (int j = 1; j < row; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//	}



	static void pattern5(int n){
		for (int row = 0; row < n*2; row++) {
			int totalColsInRow = row > n ? n*2 - row : row;
			for (int col = 0; col < totalColsInRow; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}


	static void pattern_5(int n){
		for (int row = 0; row < n*2; row++) {
			int totalColsInRow;
			if(row > n){
				totalColsInRow = 2*n -row;
			}else {
				totalColsInRow = row;
			}
			for (int col = 0; col < totalColsInRow; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}


	static void pattern9(int n){
		for (int row = 0; row < n; row++) {
			int space;
			for (int i = 0; i < row; i++) {
				System.out.print(" ");
			}

			for (int col = 2*n - 1; col > 2*row; col--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}



	static void pattern12(int n){
		for (int row = 0; row < 2 * n; row++) {
			int colInRow = row > n ? 2*n-row : row;

			for (int i = 0; i < colInRow; i++) {
				System.out.print(" ");
			}

			for (int col = n - colInRow; col >0; col--) {
				System.out.print("* ");
			}
			System.out.println();
		}


	}





	static void pattern28(int n){
		for (int row = 0; row < n*2; row++) {
			int totalColsInRow = row > n ? n*2 - row : row;

			int space = n - totalColsInRow;
			for (int i = 0; i < space; i++) {
				System.out.print(" ");
			}

			for (int col = 0; col < totalColsInRow; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}


	static void pattern30(int n){
		for (int row = 1; row <= n; row++) {

			int space = n - row;
			for (int i = 0; i < space; i++) {
				System.out.print(" ");
			}
			for (int col = row; col >=1 ; col--) {
				System.out.print(col);
			}
			for (int col = 2; col <= row; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}



	static void pattern17(int n){
		for (int row = 1; row <= 2*n; row++) {
			int totalColInRow = row > n ?  2*n - row: row;
			int space = n - totalColInRow;
			for (int i = 0; i < space; i++) {
				System.out.print(" ");
			}
			for (int col = totalColInRow; col >=1 ; col--) {
				System.out.print(col);
			}
			for (int col = 2; col <= totalColInRow; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}



	static void pattern31(int n){
		n = 2*n;
		for (int row = 0; row <= n; row++) {
			for (int col = 0; col <= n; col++) {
				int atEveryIndex = Math.min(Math.min(row, col),Math.min(n - row, n - col));
				System.out.print(atEveryIndex + " ");
			}
			System.out.println();
		}
	}


	static void pattern_31(int n){
		int orignalN = n+1;
		n = 2*n;
		for (int row = 1; row < n; row++) {
			for (int col = 1; col < n; col++) {
				int atEveryIndex = orignalN - Math.min(Math.min(row, col),Math.min(n - row, n - col));
				System.out.print(atEveryIndex + " ");
			}
			System.out.println();
		}
	}










}
