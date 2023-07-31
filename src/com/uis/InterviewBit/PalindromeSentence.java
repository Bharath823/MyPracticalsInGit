/*
 * A sentence is said to be a palindrome if we convert all its alphabets to lowercase, 
 * include the numerics but exclude all the spaces, whitespaces, and other special characters and it reads the same from left to right and right to left.
 */

package com.uis.InterviewBit;

import java.util.Scanner;

public class PalindromeSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		sc.close();
		
		if(isPalindrome(str)) {
			System.out.println("Paindrome ");
		}else {
			System.out.println("Not Paindrome");
		}
	}
	
	public static boolean isPalindrome(String s)
	{
		String result="";
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>'0' && ch<='9'))
			{
				if((ch>='A' && ch<='Z') ) {
					result += (char)(ch+32);
				}else {
					result += ch;
				}
			}else {
				continue;
			}
		}
		
		if(isSentencePalindrome(result)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isSentencePalindrome(String sen)
	{
		int low = 0;
		int high = sen.length()-1;
		
		while(low<high) 
		{
			char c1 = sen.charAt(low);
			char c2 = sen.charAt(high);
			
			if(c1 != c2) {
				return false;
			}
			low++; high--;
		}
		return true;
	}

}
