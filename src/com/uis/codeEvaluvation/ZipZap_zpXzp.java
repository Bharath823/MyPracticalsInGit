package com.uis.codeEvaluvation;

import java.util.Scanner;

public interface ZipZap_zpXzp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1=null,s2=null;
		System.out.println("Enter a String 1");
		s1= sc.next();
		
		System.out.println("Enter a String 2");
		s2 = sc.next();
		
		sc.close();
		
		System.out.println("Input string s1="+s1 +" s2="+s2);
		System.out.println(check(s1,s2));
		
	}
	
	public static String check(String s1, String s2)
	{
		if(s1.length()<3 || s2.length()<3) {
			return "Invalid";
		}
		
		String result="";
		
		if(s1.charAt(0)=='z' && s1.charAt(s1.length()-1)=='p' && s2.charAt(0)=='z' && s2.charAt(s2.length()-1)=='p') {
			result += (char)(s1.charAt(0))+ (char)s1.charAt(s1.length()-1)+"X"+(char)(s2.charAt(0))+(char)(s2.charAt(s2.length()-1));
			System.out.println((char)(s1.charAt(0)+s1.charAt(s1.length()-1))+"X"+(char)(s2.charAt(0)+s2.charAt(s2.length()-1)));
		}
		return result;
	}
}
