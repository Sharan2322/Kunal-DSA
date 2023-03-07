package com.kunal;

public class Search2D_matrix {
	public static void main(String[] args) {

		int[][] arr = {
				{1, 3, 5, 7},
				{10, 11, 16, 20},
				{23, 30, 34, 60}
		};

		int[][] arr2 = {
				{1,3}
		};

		System.out.println(searchMatrix(arr2,3));
		System.out.println(searchMatrix(arr,7));
		System.out.println(searchMatrix2(arr,3));
		System.out.println(searchMatrix3(arr,3));
	}

	static boolean searchMatrix(int[][] matrix, int target) {

		int r = 0;
		int c = matrix.length - 1;

		while (r < matrix.length && c >= 0) {
			if (matrix[r][c] == target) {
				return true;
			}
			if (matrix[r][c] < target) {
				r++;
			} else {
				c--;
			}
		}
		return false;
	}



	static boolean searchMatrix2(int[][] matrix, int target) {
		if (matrix.equals(null) || matrix[0].equals(null)) return false;
		int m = matrix.length, n = matrix[0].length;
		int left = 0, right = m * n - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			int row = mid / n, col = mid % n;
			if (matrix[row][col] == target) return true;
			if (matrix[row][col] < target) left = mid + 1;
			else right = mid - 1;
		}
		return false;
	}
	static boolean searchMatrix3(int[][] matrix, int target){
		if (matrix.equals(null) || matrix[0].equals(null)){
			return false;
		}
		int m = matrix.length, n = matrix[0].length;
		int s = 0, e = m * n - 1;
		while (s <= e){
			int mid = s + (e - s)/2;
			int r = mid / n;
			int c = mid % n;

			if (matrix[r][c] == target){
				return true;
			}
			if (matrix[r][c] < target){
				s = mid + 1;
			}else {
				e = mid - 1;
			}
		}
		return false;
	}


}

