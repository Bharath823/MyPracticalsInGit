package com.uis.InterviewBit;

public class DecimalToBinary_Octal_Hexa {

	public static void main(String[] args) 
	{
		int input = 50;

		System.out.println("Binary Equivalent of "+input+" is "+toBinary(input));
		System.out.println("Octal Equivalent of "+1000+" is "+toOctal(1000));
		System.out.println("Octal Equivalent of "+2000+" is "+toHexaDecimal(2000));
	}

	public static String toBinary(int num)
	{
		if(num==0|| num<0) {
			return num+"";
		}
		else {
			int input=num;
			int rem=0;
			String binary= "";
			
			while(input>0)
			{
				rem = input%2;
				binary = rem+binary;
				input /= 2 ;
			}
			return binary;
		}
	}
	
	public static String toOctal(int num)
	{
		if(num==0|| num<0) {
			return num+"";
		}
		else {
			int input=num;
			int rem=0;
			String octal= "";
			
			while(input>0)
			{
				rem = input%8;
				octal = rem+octal;
				input /= 8 ;
			}
			return octal;
		}
	}
	
	public static String toHexaDecimal(int num)
	{
		if(num==0) {
			return num+"";
		}
		else {
			char[] hexadecimal = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			int input=num;
			int rem=0;
			String hexa= "";
			
			while(input>0)
			{
				rem = input%16;
				hexa = hexadecimal[rem] + hexa;
				input /= 16 ;
			}
			return hexa;
		}
	}
	
}
