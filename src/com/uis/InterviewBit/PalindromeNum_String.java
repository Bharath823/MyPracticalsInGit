package com.uis.InterviewBit;

public class PalindromeNum_String {

	public static void main(String[] args) {
		String num= "ara";
		
		String reverse = "";
		
		for(int i=num.length()-1; i>=0; i--)
		{
			reverse = reverse + num.charAt(i);
		}
		
		if(num.equals(reverse)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
