package com.uis.InterviewBit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Convert_HashMap_To_ArrayList {

	public static void main(String[] args) {
		HashMap<String,Integer> hmap = new HashMap<>();
		hmap.put("Red", 5);
		hmap.put("Blue", 20);
		hmap.put("Yellow", 15);
		hmap.put("White", 25);
		hmap.put("Greeb", 10);
		
		//converting keys to ArrayList
		System.out.println("converting keys to ArrayList"+"\n");
		Set set = hmap.keySet();
		ArrayList<String> alist = new ArrayList<>(set);
		System.out.println(alist+"\n"+"-------------------------------------------");
		
		//converting values to ArrayList
		System.out.println("\n"+"converting values to ArrayList"+"\n");
		ArrayList<Integer> alist2 = new ArrayList<Integer>(hmap.values());
		System.out.println(alist2);
		
		
		//converting key-value to ArrayList
		System.out.println("\n"+"converting key-value to ArrayList"+"\n");
		Set<Entry<String,Integer>> key_val_set = hmap.entrySet();
		ArrayList<Entry<String,Integer>> listkey_value = new ArrayList<Entry<String,Integer>>(key_val_set);
		
		for(Entry<String,Integer> s : listkey_value)
			System.out.println(s.getKey()+" : "+s.getValue());
	
	}

}
