package com.uis.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapLoopOver {

	public static void main(String[] args) 
	{
		Map<Integer,String> map = new HashMap<>();
		
		map.put(3, "Bharath");
		map.put(2, "Sharath");
		map.put(4, "Thiru");
		map.put(1, "Keeru");
		
		System.out.println(map+"\n");
		
		System.out.println("size = "+map.size());
		
		Iterator itr = map.entrySet().iterator();
		
		System.out.println("\n"+ "Using While Loop");
		
		while(itr.hasNext())
		{
			Map.Entry e = (Map.Entry) itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		System.out.println("\n"+ "Using For Loop");
		
		for(Map.Entry<Integer,String> e : map.entrySet())
		{
			System.out.println(e.getKey()+"->"+e.getValue());
		}
	}

}
