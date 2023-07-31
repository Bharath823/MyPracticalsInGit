package com.uis.InterviewBit;

import java.util.Arrays;
import java.util.HashSet;

public class UnionOfMultipleArrays {

	public static void main(String[] args) {
		int[] i1 = {2,3,4,7,1}; 
		int[] i2 = {4,1,3,5}; 
		int[] i3 = {8,4,6,2,1}; 
		int[] i4 = {7,9,4,1}; 
		
		union(i1,i2,i3,i4);
	}
	
	public static void union(int[] ... inputArrays)
	{
		System.out.println("Arrays are : ");
		for(int i=0; i<inputArrays.length; i++) {
			System.out.println(Arrays.toString(inputArrays[i]));
		}
		
		HashSet<Integer> union = new HashSet<Integer>();
		
		for(int[] array : inputArrays) {
			
			for(int i : array) {
				union.add(i);
			}
		}
		
		System.out.println("========================");
		System.out.println("Union of All Arrays");
		System.out.println("========================");
		System.out.println(union);
	}

}
