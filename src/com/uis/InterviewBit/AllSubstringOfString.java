package com.uis.InterviewBit;

public class AllSubstringOfString {

	public static void main(String[] args) {
		String str = "Java";
		printSubString(str);
	}
	
	public static void printSubString(String s)
	{
		for(int i=0; i<s.length(); i++)
		{
			for(int j=i+1; j<=s.length(); j++) {
				System.out.println(s.substring(i,j));
			}
		}
	}
}
