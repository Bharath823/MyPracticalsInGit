package com.uis.MockTest;

import java.util.Scanner;

public class Test2
{
	 public static void main(String[] args) 
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Roman Number");
		 
		 String roman = sc.nextLine();
		 
		 
		 roman = roman.toUpperCase();
		 if( roman.contains("I") || roman.contains("V") || roman.contains("X") || roman.contains("L")|| roman.contains("C") || roman.contains("D") || roman.contains("M"))
		{
	     int decimal = romanToDecimal(roman);
	     System.out.println("The decimal equivalent of " + roman + " is " + decimal);
		}
		else {
			System.out.println("Invalid Input");
		}
	 }
	
	
	    public static int romanToDecimal(String roman) 
	    {
	        int decimal = 0;
	        int prev = 0;
	        for (int i = roman.length() - 1; i >= 0; i--)
	        {
	            int current = romanCharValue(roman.charAt(i));
	            if (current < prev) 
	            {
	                decimal = decimal-current;
	            }
	            else {
	                decimal = decimal+current;
	            }
	            prev = current;
	        }
	        return decimal;
	    }

	    public static int romanCharValue(char ch) 
	    {
	        switch (ch) {
	            case 'I':
	                return 1;
	            case 'V':
	                return 5;
	            case 'X':
	                return 10;
	            case 'L':
	                return 50;
	            case 'C':
	                return 100;
	            case 'D':
	                return 500;
	            case 'M':
	                return 1000;
	            default:
	                return 0;
	        }
	    }
}


