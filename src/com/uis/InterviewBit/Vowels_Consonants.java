package com.uis.InterviewBit;

import java.util.Scanner;

public class Vowels_Consonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		sc.close();
		
		str= str.toLowerCase();
		int vowel=0, consonants=0;
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(isVowel(ch)) {
				vowel++;
			}
			else if(ch>='a' && ch<='z' && isVowel(ch)==false) {
				consonants++;
			}
		}
		System.out.println("Vowels = "+vowel);
		System.out.println("Consonants = "+consonants);
		System.out.println("other characters = "+(str.length()-vowel-consonants));

	}
	
	public static boolean isVowel(char c)
	{
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
			return true;
		}
		return false;
	}

}
