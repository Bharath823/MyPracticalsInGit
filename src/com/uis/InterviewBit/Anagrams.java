package com.uis.InterviewBit;

import java.util.HashMap;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1");
		String str1 = sc.nextLine();
		
		System.out.println("Enter String 2");
		String str2 = sc.nextLine();
		sc.close();
		
		if(isAnagram(str1, str2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}
	
	public static boolean isAnagram(String s1, String s2)
	{
		if(s1.length() != s2.length()) {
			return false;
		}
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<s1.length();i++) {
            int ofreq = map.getOrDefault(s1.charAt(i),0);
            map.put(s1.charAt(i),ofreq+1);
        }
        
        for(int i=0;i<s2.length();i++) {
            if(!map.containsKey(s2.charAt(i)) || map.get(s2.charAt(i)) == 0) {
                return false;
            } else {
                int ofreq = map.get(s2.charAt(i));
                map.put(s2.charAt(i),ofreq-1);
            }
        }
		return true;
	}

}
