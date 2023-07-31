package com.uis.NumberSeries;

public class CheckLeapYear {

	public static void main(String[] args) {
//	WAP to Check Leap Year		
		int year = 1996;
		
		if(year%4==0 && (year%400==0 || year%100 !=0))
		{
			System.out.println("Leap Year");
		}
		else
			System.out.println("Not Leap Year");
		
		
//	Check Whether a Character is an English Alphabet (upper & lower case) or Not	
		char ch = '0';
		
		if(Character.isLetter(ch)) 
		{
			if(Character.isUpperCase(ch))
				System.out.println("UpperCase");
			else
				System.out.println("LowerCase");
					
		}else
			System.out.println("not character");
		
//	WAP to find Sum of N Natural Numbers
		int num1 = 5;
		
		int sum =0;
		for(int i=0; i<=num1; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
	}

}
