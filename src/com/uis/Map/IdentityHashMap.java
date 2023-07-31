package com.uis.Map;

import java.util.HashMap;
import java.util.Map;

public class IdentityHashMap {

	public static void main(String[] args) {
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
		
		Map m = new HashMap();
		m.put(I1, "BC");
		m.put(I2, "BO");
		System.out.println(m+"\n");
		
		m = new java.util.IdentityHashMap<>();
		m.put(I1, "BC");
		m.put(I2, "BO");
		System.out.println(m+"\n");
	}

}
