package com.uis.InterviewBit;

import java.util.Scanner;

public class NumberToString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int number = sc.nextInt();
		sc.close();
		
		String numberInWords = convertToString(number);
		System.out.println(number +" = "+numberInWords);
	}
	
		static String[] units = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine",
								"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		
		static String[] tens = {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		
//		String[] hundreds = {"","One Hundred","Two Hundred","Three Hundred","Four Hundred","Five Hundred","Six Hundred","Seven Hundred","Eight Hundred","Nine Hundred"};
		
	
	public static String convertToString(int number)
	{
		if(number==0) {
			return "Zero";
		}
		return convert(number);
	}
	
	public static String convert(int number)
	{
		StringBuilder sb = new StringBuilder();
		
		if(number >=1000) {
			sb.append(convert(number / 1000)).append(" Thousand ");
			number %= 1000;
		}
		
		 if (number >= 100) {
	            sb.append(convert(number / 100)).append(" Hundred ");
	            number %= 100;
	        }
	        if (number > 0) {
	            if (number < 20) {
	                sb.append(units[number]);
	            } 
	            else {
	                sb.append(tens[number / 10]);
	                if (number % 10 > 0) {
	                    sb.append(" ").append(units[number % 10]);
	                }
	            }
	        }
	        return sb.toString().trim();
	}

}
