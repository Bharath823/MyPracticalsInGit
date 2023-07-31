package com.uis.codeEvaluvation;

public class CountDigits_Recursive {

	public static void main(String[] args) {
		int num = 12365;
		int count=0;
		System.out.println("digits = "+digits(num, count));
		
	}
	
	public static int digits(int num,int count)
	{
		if(num==0) {
			return count;
		}
		return digits(num/10, count +1);
	}

}
