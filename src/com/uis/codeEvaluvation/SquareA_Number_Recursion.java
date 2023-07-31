package com.uis.codeEvaluvation;

public class SquareA_Number_Recursion {

	public static void main(String[] args) {
		int num = 2;
		int count =1;
		
		System.out.println(square(num, count));
	}
	
	public static int square(int num, int count) {
		
		if(count==2) {
			System.out.println("count = "+count);
			return num;
		}
		return num*square(num, count+1);
	}

}
