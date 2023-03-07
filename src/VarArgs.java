import java.util.Arrays;

public class VarArgs {
	public static void main(String[] args) {
		fun();                       //empty can also pass
      fun(4,45,34,2,6,2,3,6,7);  //any no. can pass

		multipule(5,3,"kunal","harry","raman");
//		multipule(5,"kunal","harry", 3);      //error

	}
	static void fun(int...v){
		System.out.println(Arrays.toString(v));
	}

	static void multipule(int a, int b, String...v){

	}

}
