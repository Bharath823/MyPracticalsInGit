package com.uis.InterviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Array_To_ArrayList_Convertion {

	public static void main(String[] args) {
		
// Converting ArrayList To Array
		ArrayList<String> arraylist = new ArrayList<>();
		arraylist.add("Mava");
		arraylist.add("Bava");
		arraylist.add("Python");
		arraylist.add("Script");
		arraylist.add("C++");
		
		String[] srr = new String[arraylist.size()];
		
		arraylist.toArray(srr);//*****
		
		for(String s : arraylist) {
			System.out.println(s);
		}
		
// Converting Array To ArrayList	
		String[] array = new String[] {"Red","Blue","Java","Jsp","Spring","Boot"};
		
		// Method 1
		ArrayList<String> alist = new ArrayList<>(Arrays.asList(array));
		System.out.println("\n"+alist);
		System.out.println("------------------------------------------"+"\n");
		
		// Method 2
		alist = new ArrayList<>();
		alist.addAll(Arrays.asList(array));
		System.out.println(alist);
		System.out.println("------------------------------------------"+"\n");
		
		// Method 3
		alist = new ArrayList<>();
		Collections.addAll(alist, array);
		System.out.println(alist);
		System.out.println("------------------------------------------"+"\n");
		
		// Method 4
		List<Object> l = Arrays.stream(array).collect(Collectors.toList());
		System.out.println(l);
	}

}
