//A List of strings is given as input. Rearrange the strings in such a way that the last letter of the first word is the 
//start letter of the second word and second word last letter should be the first letter of the third and so on. 
//The first word is fixed

package com.uis.codeEvaluvation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RearrangeOrderOfString {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("list");
		list.add("word");
		list.add("that");
		list.add("dummy");
		list.add("fix");
		list.add("year");
		
		System.out.println("Original List = "+list);
		
		rearrangeOrder(list);
		
//		Collections.sort(list, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				o1 = ""+o1.charAt(o1.length()-1);
//				o2 = ""+o2.charAt(0);
//				
//				return o1.compareTo(o2);
//			}
//		});
		
		System.out.println(list);
	}
	
	public static void rearrangeOrder(List<String> list)
	{
		String[] str = (String[]) list.toArray();
		
	//	char c1 = str[0].charAt(str[0].length()-1);
		
		for(int i=1; i<str.length; i++)
		{
			
			int count=1;
			boolean flag = true;
			char c = str[0].charAt(str[0].length()-1);
			while(flag && count < str.length) {
				
				if(c == str[count].charAt(0)) {
					str[i] = str[count];
					flag = false;
					break;
				}
				count++;
			}
			
			char c1 = str[i].charAt(str[i].length()-1);
			for(int j=(i+1); j<str.length; j++) {
				char c2 = str[j].charAt(0);
				
				if(c1==c2) {
					
				}
			}
		}
	}

}
