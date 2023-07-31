package com.uis.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Methods {

	public static void main(String[] args) {
		Map m = new HashMap();
		
		m.put("B", 2);
		m.put("C", 3);
		m.put("A", 1);
		m.put("a", 11);
		m.put("D", 4);
		m.put("b", 12);
		System.out.println(m+"\n");
		
		Set s = m.keySet();
		System.out.println(s+"\n");
		
		Collection c = m.values();
		System.out.println(c+"\n");
		
		Set s1 = m.entrySet();
		System.out.println(s1+"\n");
		
		Iterator it = s1.iterator();
		
		while(it.hasNext())
		{
			Map.Entry e = (Map.Entry) it.next();
			
			System.out.println(e.getKey()+"="+e.getValue());
			if(e.getKey().equals("a")) {
				e.setValue("X");
			}
		}
		System.out.println("\n"+m);
	}

}
