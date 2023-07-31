package com.uis.codeEvaluvation;

public class SumOf_Nnumber_Recursive {

	public static void main(String[] args) {
		System.out.println(sumofNnumber(5));
	}
	
	public static int sumofNnumber(int num)
	{
		if(num==0)
			return 0;
		else
			return num+sumofNnumber(num-1);
	}
}
