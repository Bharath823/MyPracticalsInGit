package com.uis.codeEvaluvation;

public class StringFront_Copies {

	public static void main(String[] args) {
		String str = "jav";
		
		System.out.println(front3(str));
	}
	
	public static String front3(String str)
	{
		if(str.length()<3) {
			return str;
		}
		
		String r = str.substring(0, 3);
		return r+r+r;
	}

}

