package com.uis.InterviewBit;

public class PalindromeMethod2 {

	public static void main(String[] args) {
		String input = "Was it a car or a cat I saw";
		
		if(isPalindrome(input)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}
	
	public static boolean isPalindrome(String input)
	{
		String cleared = input.replaceAll(" ", "").toLowerCase();;
		
		char[] crr = cleared.toCharArray();
		
		int forward = 0, backward = crr.length-1;
		
		while(forward<=backward)
		{
			if(crr[forward] != crr[backward]) {
				return false;
			}
			forward++;
			backward--;
		}
		return true;
	}

}
