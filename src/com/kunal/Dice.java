package com.kunal;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.ArrayList;

public class Dice {
	public static void main(String[] args) {
//		dice("",4);
//
//		ArrayList<String> list = diceList("", 4);
//		System.out.println(list);

		diceFace("", 4, 8);
		ArrayList<String> ans =  diceListFace("", 7, 8);
		System.out.println(ans);
	}





	static void dice(String p, int target){
		if (target == 0){
			System.out.println(p);
			return;
		}

		for (int i = 1; i <= 6 && i <= target; i++){
			dice(p+i, target - i);
		}
	}


	static ArrayList<String> diceList(String p, int target){
		if (target == 0){
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}

		ArrayList<String> ans = new ArrayList<>();
		for (int i = 1; i <= 6 && i <= target; i++){
			ans.addAll(diceList(p+i, target - i));
		}

		return ans;
	}






	// dice face

	static void diceFace(String p, int target, int face){
		if (target == 0){
			System.out.println(p);
			return;
		}

		for (int i = 1; i <= face && i <= target; i++){
			diceFace(p+i, target - i, face);
		}
	}



	static ArrayList<String> diceListFace(String p, int target, int face){
		if (target == 0){
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}

		ArrayList<String> ans = new ArrayList<>();
		for (int i = 1; i <= 6 && i <= target; i++){
			ans.addAll(diceListFace(p+i, target - i, face));
		}

		return ans;
	}



}
