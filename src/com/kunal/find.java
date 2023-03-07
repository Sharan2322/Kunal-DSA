package com.kunal;

import java.util.ArrayList;

public class find {
	public static void main(String[] args) {

		int[] arr = {2, 3, 4, 1, 4, 5};
//		System.out.println(Find(arr, 4, 0));
//		System.out.println(Findindex(arr, 4, 0));
//		System.out.println(FindindexLast(arr, 4, arr.length-1));
//		FindAllIndex(arr, 4, 0);
//		System.out.println(list);
//
//		System.out.println(FindAllIndex_2(arr, 4, 0, new ArrayList<>()));
//
//		ArrayList<Integer> list = new ArrayList<>();
//		ArrayList<Integer> ans = FindAllIndex_2(arr, 4, 0, list);
//		System.out.println(ans);
//		System.out.println(list);

		System.out.println(FindAllIndex_3(arr, 4, 0));

	}

	static boolean Find(int[] arr, int target, int index){
		if (index == arr.length){
			return  false;
		}
		return arr[index] == target || Find(arr, target, index +1);
	}


	static int Findindex(int[] arr, int target, int index) {
		if (index == arr.length) {
			return -1;
		}
		if (arr[index] == target) {
			return index;
		} else {
			return Findindex(arr, target, index + 1);
		}
	}



	static int FindindexLast(int[] arr, int target, int index) {
		if (index == -1) {
			return -1;
		}
		if (arr[index] == target) {
			return index;
		} else {
			return Findindex(arr, target, index - 1);
		}
	}


	static ArrayList<Integer> list = new ArrayList<>();
	static void FindAllIndex(int[] arr, int target, int index){
		if (index == arr.length){
			return;
		}
		if(arr[index] == target) {
			list.add(index);
		} FindAllIndex(arr, target, index + 1);

	}



	static ArrayList<Integer> FindAllIndex_2(int[] arr, int target, int index, ArrayList<Integer> list){
		if (index == arr.length){
			return list;
		}
		if(arr[index] == target) {
			list.add(index);
		}
		return FindAllIndex_2(arr, target, index + 1, list);

	}



	//don't use this
	static ArrayList<Integer> FindAllIndex_3(int[] arr, int target, int index){
			ArrayList<Integer> list = new ArrayList<>();
			if (index == arr.length){
			return list;
		}
		if(arr[index] == target) {
			list.add(index);
		}
		ArrayList<Integer> ansFromBelowCalls = FindAllIndex_3(arr, target, index + 1);

			list.addAll(ansFromBelowCalls);
			return list;
	}




}
