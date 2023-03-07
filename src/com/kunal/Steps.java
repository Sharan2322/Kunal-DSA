package com.kunal;

public class Steps {

	public int numberOfSteps(int num) {
		return halper(num, 0);
	}

	private int halper(int num, int steps){
		if (num == 0){
			return steps;
		}

		if (num%2 == 0){
			return halper(num/2, steps+1);
		}
		return halper(num-1,steps+1);
	}


}
