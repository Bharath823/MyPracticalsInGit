package com.uis.InterviewBit;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayTripletPgm {

	public static void main(String[] args) {
		getArrayTriplets(new int[]{21, 13, 47, 61, 34, 40, 55, 71, 87});
        
       System.out.println("===========================================");
        
       getArrayTriplets(new int[] {-1, 3, -2, 1, -4, 0, 5, 2, -3});
        
       System.out.println("===========================================");
       
	}
	
	public static void getArrayTriplets(int[] inputarray)
	{
		System.out.println("Input Array is : "+Arrays.toString(inputarray)+"\n");
		
		HashSet<Integer> element = new HashSet<>();
		
		for(int i=0; i<inputarray.length; i++) {
			element.add(inputarray[i]);
		}
		
		for(int i=0; i<inputarray.length-1; i++)
		{
			for(int j=i+1; j<inputarray.length; j++)
			{
				if(element.contains(inputarray[i]+inputarray[j])) {
					System.out.println("["+inputarray[i]+","+inputarray[j]+","+(inputarray[i]+inputarray[j])+"]");
				}
			}
		}
	}

}
