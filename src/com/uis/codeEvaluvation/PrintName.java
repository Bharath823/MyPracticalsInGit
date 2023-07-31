package com.uis.codeEvaluvation;

import java.util.ArrayList;
import java.util.List;

public class PrintName {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("vivek");
		list.add("akhil");
		list.add("shri");
		list.add("aviman");
		list.add("santhya");
		
		list.forEach(str -> { if (str.length() < 6) System.out.println(str); } );
		
		System.out.println();
		
		for(String s : list) if(s.length()<6) System.out.println(s); 
		
	}
}
