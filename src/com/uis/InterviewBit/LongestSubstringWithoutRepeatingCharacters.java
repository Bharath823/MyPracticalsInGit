package com.uis.InterviewBit;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) 
	{
		String input = "thelongestsubstring";//
		
		int longestlength = 0;
		
		char[] crr = input.toCharArray();
		
		for(int i=0; i<crr.length; i++)
		{
			int count =0;
			for(int j=i+1; j<crr.length; j++)
			{
				if(crr[i] ==crr[j]) {
					count=i;
					break;
				}
			}
			if(count>longestlength) {
				longestlength=count;
				
			}
		}
		System.out.println("LongestSubstring = "+input.substring(longestlength+1,input.length()));
		
		System.out.println("-------------------------"+"\n");
		
		longestSubstring("javaconceptoftheday");
        
        System.out.println("==========================");
         
        longestSubstring("thelongestsubstring");
	}
	
	public static void longestSubstring(String inputString)
	{
		char[] crr = inputString.toCharArray();
		
		Map<Character,Integer> charPosMap = new LinkedHashMap<>();
		
		String longestSubstring= null;
		int longestSubstringLength=0;
		
		for(int i=0; i<crr.length; i++)
		{
			char ch = inputString.charAt(i);
			if(!charPosMap.containsKey(ch))
			{
				charPosMap.put(ch, i);
			}
			else {
				i=charPosMap.get(ch);
				charPosMap.clear();
			}
			
			//Updating longestSubstring and longestSubstringLength
			
			if(charPosMap.size() > longestSubstringLength) {
				longestSubstringLength = charPosMap.size();
				longestSubstring = charPosMap.keySet().toString();
			}
		}
		
		System.out.println("Input String : "+inputString);
        
        System.out.println("The longest substring : "+longestSubstring);
         
        System.out.println("The longest Substring Length : "+longestSubstringLength);
	}

}
