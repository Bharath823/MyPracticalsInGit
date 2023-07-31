package com.uis.InterviewBit;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		sc.close();
		
		HashSet unique = new HashSet<>();
		
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(unique.contains(ch)) {
				unique.remove(ch);
			}else {
				unique.add(ch);
			}
		}
		
		if(unique.size()==0) {
			System.out.println("No unique char..");
		}
		
		System.out.println("Unique characters");
		for(Object o : unique) {
			System.out.print(o+" ");
		}
	}

}
