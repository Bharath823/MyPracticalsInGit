package com.uis.codeEvaluvation;

public class RecursiveMethodFor_Factorial {

	public static void main(String[] args) {
		int num = 4;
		System.out.println(factorial(num));
	}
	
	public static int factorial(int num)
	{
		if(num==0) 
			return 1;
		else
			return num*factorial(num-1);
			
	}

}
