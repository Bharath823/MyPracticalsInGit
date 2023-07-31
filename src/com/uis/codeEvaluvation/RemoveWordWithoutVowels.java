package com.uis.codeEvaluvation;

import java.util.ArrayList;
import java.util.List;

public class RemoveWordWithoutVowels {

	public static void main(String[] args) {
		String[] arr = {"I","am","up","quickly","App","xx","mnmmm"};
		System.out.println(addOnlyVowel(arr));
	}
	
	public static List<String> addOnlyVowel(String[] str)
	{
		List<String> list = new ArrayList<>();
		
		for(int i=0; i<str.length; i++)
		{
			boolean flag = false;
			str[i] = str[i].toLowerCase();
			char[] crr = str[i].toCharArray();
			for(int j=0; j<crr.length; j++)
			{
				if(crr[j]=='a' || crr[j]=='e' || crr[j]=='i' || crr[j]=='o'|| crr[j]=='u') {
					flag= true;
					break;
				}
			}
			if(flag) {
				list.add(str[i]);
			}
		}
		return list;
	}

}
