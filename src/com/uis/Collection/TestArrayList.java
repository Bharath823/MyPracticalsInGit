package com.uis.Collection;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<Object> l = new ArrayList<Object>();
		l.add("A");
		l.add("B");
		l.add(1);
		l.add("C");
		l.add("D");
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);
		
		l.add(2, 2);
		System.out.println(l);
		
		l.add(3);
		System.out.println(l);
	}

}
