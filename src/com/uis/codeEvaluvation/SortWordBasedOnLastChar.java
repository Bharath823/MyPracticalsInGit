package com.uis.codeEvaluvation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWordBasedOnLastChar {

	public static void main(String[] args) {
		String[] str = {"Hai","hello","files","Print","boOk","verY"};
		System.out.println("Original Array = "+Arrays.toString(str));
		sortWordByLastChar(str);
	}
	
	public static void sortWordByLastChar(String[] str)
	{
		List<String> list =  new ArrayList<>( Arrays.asList(str));
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				String s1 = o1.charAt(o1.length()-1)+"";
				String s2 = o2.charAt(o2.length()-1)+"";
				return s1.compareTo(s2);
			}
			
		});
		System.out.println("\n"+"After Sorting based on last char of Word are : ");
		System.out.println(list);
	}

}
