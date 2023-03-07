package com.kunal;

import java.util.*;

public class string {
	public static void main(String[] args) {
		String series = "";
		for (int i = 0; i < 26; i++) {
			char ch = (char)('a' + i);
			series = series + ch;
		}
		System.out.println(series);



		stringBuilder obj1 = new stringBuilder();
		obj1.SB();
	}
}


class stringBuilder{
	 void SB(){
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			char ch = (char)('a' + i);
			builder.append(ch);
		}
		System.out.println(builder.toString());

		builder.deleteCharAt(0);
		 System.out.println(builder.toString());


		 // 2
		 Palindrome obj2 = new Palindrome();
//		 String str = "abcdcba";
//		 String str = "asfhsg";
		 String str = "";
		 System.out.println(obj2.isPalindrome(str));

		 // 3
		 Methods obj3 = new Methods();
		 obj3.meth();

		 // 4
		 Operators obj4 = new Operators();
		 obj4.operat();


		 // 5
		 Placeholder obj5 = new Placeholder();
		 obj5.placeholder();


	 }
}


class Palindrome{
	boolean isPalindrome(String str){
		if (str == null || str.length() == 0){
			return true;
		}
		for (int i = 0; i < str.length(); i++) {
			int start = str.charAt(i);
			int end = str.charAt(str.length() -1 -i);

			if (start != end){
				return false;
			}
		}
		return true;
	}
		}


class Methods {
	void meth() {
		String name = "Kunal Kushwaha Hello World";
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(name.toLowerCase());
		System.out.println(name);
		System.out.println(name.indexOf('a'));
//		System.out.println("     Kunal   ".strip());
		System.out.println(Arrays.toString(name.split(" ")));
	}
}


class Operators {
	 void operat() {
		System.out.println('a' + 'b');
		System.out.println("a" + "b");
		System.out.println((char)('a' + 3));

		System.out.println("a" + 1);
		// this is same as after a few steps: "a" + "1"
		// integer will be converted to Integer that will call toString()

		System.out.println("Kunal" + new ArrayList<>());
		System.out.println("Kunal" + new Integer(56));
		String ans = new Integer(56) + "" + new ArrayList<>();
		System.out.println(ans);
		System.out.println("a" + 'b');
	}
}


class Placeholder {
	void placeholder (){
		float a = 453.1274f;
//        System.out.printf("Formatted number is %.2f", a);

//        System.out.printf("Pie: %.3f", Math.PI);

		System.out.printf("Hello my name is %s and I am %s", "Kunal", "Cool");

//		        %c - Character
//				%d - Decimal number (base 10)
//				%e - Exponential floating-point number
//				%f - Floating-point number
//				%i - Integer (base 10)
//				%o - Octal number (base 8)
//				%s - String
//				%u - Unsigned decimal (integer) number
//				%x - Hexadecimal number (base 16)
//				%t - Date/time
//				%n - Newline
	}
}

