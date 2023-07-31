package com.uis.InterviewBit;

public class FindPercentageUpper_Lower_Digits_Special {

	public static void main(String[] args) {
		String input = "Tiger Runs @ The Speed Of 100 km/hour.";
		
		int upper=0, lower=0, digits=0, special=0;
		int count=input.length();
		
		char[] crr = input.toCharArray();
		for(int i=0; i<crr.length; i++)
		{
			char ch = input.charAt(i);
			
			if((ch>='A'&&ch<='Z') || Character.isUpperCase(ch)) {
				upper++;
			}
			else if((ch>='a' && ch<='z') || Character.isLowerCase(ch)) {
				lower++;
			}
			else if(ch==32 || (ch>=33&&ch<=47) || (ch>=58&&ch<=64) || (ch>=91&&ch<=96) || (ch>=123&&ch<=126) ) {
				special++;
			}
			else if(ch>=48&&ch<=58 || Character.isDigit(ch)) {
				digits++;
			}
		}
		
		System.out.println("Count="+count);
		System.out.println("Special characters = "+special+" and "+(special*100)/count+"%");
		System.out.println("Uppercase = "+upper+" and "+(upper*100)/count+"%");
		System.out.println("LowerCase = "+lower+" and "+(lower*100)/count+"%");
		System.out.println("Digits = "+digits+" and "+(digits*100)/count+"%");
		
	}

}
