package com.kunal;

public class helloRecursion {
	public static void main(String[] args) {
		// function hello word 5 times
		message();

	}

	static void message(){
		System.out.println("hello word");
		message1();
	}
	static void message1(){
		System.out.println("hello word");
		message2();
	}
	static void message2(){
		System.out.println("hello word");
		message3();
	}
	static void message3(){
		System.out.println("hello word");
		message4();
	}
	static void message4(){
		System.out.println("hello word");
	}


}
