package com.kunal;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExamples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>(10);

//		list.add(1);
//		list.add(2);
//		list.add(7);
//		list.add(4);
//		list.add(36);
//		list.add(35);
//		list.add(6);
//
//		list.set(0,99);
//		System.out.println(list);
//		System.out.println(list.contains(4));
//		System.out.println(list.remove(2));


		//input
		for (int i = 0; i<5; i++){
			list.add(sc.nextInt());
		}

		//output
		for (int i = 0; i<5; i++){
			System.out.println(list.get(i));
		}



	}
}
