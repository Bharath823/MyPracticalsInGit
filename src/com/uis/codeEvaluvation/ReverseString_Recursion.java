package com.uis.codeEvaluvation;

public class ReverseString_Recursion {

	public static void main(String[] args) {
		String s = "Java";
		
		System.out.println(reverseString(s));
	}
	
	public static String reverseString(String str)
	{
		if(str.isEmpty()) {
			return str;
		}
	// char lastchar = str.charAt(str.length()-1);	
	//	String remain = str.substring(0, str.length()-1);
	// return lastchar + reverseString(remain);
		return str.charAt(str.length()-1) + reverseString(str.substring(0, str.length()-1));
	}

}
