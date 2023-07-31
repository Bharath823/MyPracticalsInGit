package com.uis.InterviewBit;

import java.util.Arrays;
import java.util.HashSet;

public class U_IntersectionOfMultipleArrays {

	public static void main(String[] args) {
		Integer[] i1 = {2,3,4,7,1}; 
		Integer[] i2 = {4,1,3,5}; 
		Integer[] i3 = {8,4,6,2,1}; 
		Integer[] i4 = {7,9,4,1}; 
		
		intersection(i1,i2,i3,i4);
	}
	
	public static void intersection(Integer[] ... inputArrays)
	{
		System.out.println("Arrays are");
		//printing the Arrays
		for(Integer[] i : inputArrays) 
		{
			System.out.println(Arrays.toString(i));
		}
		
		HashSet<Integer> intersection = new HashSet<>(Arrays.asList(inputArrays[0]));
		
		System.out.println("\n"+"retainAll() elements ->");
		for(int i=1; i<inputArrays.length; i++) {
			HashSet<Integer> set = new HashSet<>(Arrays.asList(inputArrays[i]));
			intersection.retainAll(set);
			System.out.println(intersection);
		}
		
		System.out.println("==========================");
		
		System.out.println("Intersection of all Arrays");
		
		System.out.println("==========================");
		
		System.out.println(intersection);
	}
}
