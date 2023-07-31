package com.uis.InterviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortArrayElementBasedOn_Frequency {

	public static void main(String[] args) {
		int[] array = {7,1,3,4,7,1,7,1,4,5,1,9,3};
		
		//sortElement(array);
		String s1 = "Hello";
		System.out.println(s1.intern());
		String s2 = s1.intern();

		System.out.println(s1 == s2);

	}
	
	public static void sortElement(int[] array)
	{
		
		Map<Integer,Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i<array.length; i++)
		{
			if(map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i])+1);
			}
			else {
				map.put(array[i], 1);
			}
		}
		
		List<Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
		
		Collections.sort(list, new Comparator <Entry<Integer,Integer>>(){

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				
				return o2.getValue().compareTo(o1.getValue());
			}
		}
		);
		System.out.println(list);
		
		System.out.println("Input Array : "+Arrays.toString(array)+"\n");
		
		System.out.println("Sorted Array Elements based on Frequency..");
		
		System.out.print("[ ");
		
		for(Entry<Integer,Integer> entry : list) {
			int frequency = entry.getValue();
			
			while(frequency >= 1) {
				System.out.print(entry.getKey()+" ");
				frequency--;
			}
		}
		
		System.out.print("]");
	}

}
