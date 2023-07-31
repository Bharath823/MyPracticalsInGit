package com.uis.InterviewBit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SynchronizedArrayList_Set_Map {

	public static void main(String[] args) {
		System.out.println("Synchronized ArrayList");
		ArrayList<String> list = new ArrayList<>();
		
		list.add("JAVA");
		list.add("J2EE");
		list.add("JDBC");
		list.add("SQL");
		list.add("Python");
		list.add("Mango DB");
		
		List<String> synchronizedlist = Collections.synchronizedList(list);
		
		synchronized(synchronizedlist)
		{
			Iterator<String> itr = synchronizedlist.iterator();
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
		
		System.out.println("\n"+"Synchronized HashSet");
		
		HashSet<String> set = new HashSet<String>();
        
        //Adding elements to set
         
        set.add("JAVA");
         
        set.add("STRUTS");
         
        set.add("JSP");
         
        set.add("SERVLETS");
         
        set.add("JSF");
         
        //Getting synchronized set
         
        Set<String> synchronizedSet = Collections.synchronizedSet(set);
         
        //you must use synchronized block while iterating over synchronizedSet
         
        synchronized (synchronizedSet) 
        {
            Iterator<String> it = synchronizedSet.iterator();
             
            while (it.hasNext()) 
            {
                System.out.println(it.next());
            }
        }
        
        System.out.println("\n"+"Synchronized Map");
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        //Adding elements to map
         
        map.put("ONE", 1);
         
        map.put("TWO", 2);
         
        map.put("THREE", 3);
         
        map.put("FOUR", 4);
         
        map.put("FIVE", 5);
         
        //Getting synchronized map
         
        Map<String, Integer> synchronizedMap = Collections.synchronizedMap(map);
         
        Set<String> keySet = synchronizedMap.keySet();
         
        System.out.println("Keys.............");
         
        //While iterating over synchronizedMap, you must use synchronized block.
         
        synchronized (synchronizedMap) 
        {
            Iterator<String> it = keySet.iterator();
             
            while (it.hasNext()) 
            {
                System.out.println(it.next());
            }
        }
         
        Collection<Integer> values = synchronizedMap.values();
         
        System.out.println("Values.............");
         
        //While iterating over synchronizedMap, you must use synchronized block.
         
        synchronized (synchronizedMap) 
        {
            Iterator<Integer> it = values.iterator();
             
            while (it.hasNext()) 
            {
                System.out.println(it.next());
            }
        }
	}

}
