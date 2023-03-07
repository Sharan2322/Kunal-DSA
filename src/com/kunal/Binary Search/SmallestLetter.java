package com.kunal;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
// smallest letter grater then target

public class SmallestLetter {
	public static void main(String[] args) {

		char[] letters = {'c','d', 'f','j'};
		System.out.println(nextGreatestLetter(letters,'d'));

	}

	static char nextGreatestLetter(char[] letters, char target) {

		int start = 0;
		int end = letters.length - 1;
		while(start <= end){
//			int mid = (start+end)/2;  // might be possible that it exceeds the range of integer in java
			int mid = start +(end - start)/2;
			if (target < letters[mid]) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}

		}
		return letters[start % letters.length];
	}

	}

