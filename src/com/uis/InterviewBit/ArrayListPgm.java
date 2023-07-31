package com.uis.InterviewBit;

import java.util.ArrayList;

public class ArrayListPgm {

	public static void main(String[] args) {
		// How do you increase the current capacity of an ArrayList?
		
		ArrayList<String> list = new ArrayList<String>();
		 
        //Now 'list' can hold 10 elements (Default Initial Capacity)
 
        list.ensureCapacity(20);
 
        //Now 'list' can hold 20 elements.
        System.out.println("size = "+list.size());
        
        
        //How do you decrease the current capacity of an ArrayList to the current size?
        
        list = new ArrayList<String>();
        
        //Now 'list' can hold 10 elements (Default Initial Capacity)
 
        list.ensureCapacity(20);
 
        //Now 'list' can hold 20 elements.
 
        list.add("ONE");
 
        list.add("TWO");
 
        list.add("THREE");
 
        list.add("FOUR");
 
        //reducing the current capacity to current size of an ArrayList.
 
        list.trimToSize();//return type void
        System.out.println(list);
        System.out.println("size = "+list.size());
	}

}
