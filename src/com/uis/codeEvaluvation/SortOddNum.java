package com.uis.codeEvaluvation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortOddNum {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 8, 3, 1, 6, 9, 4, 7 };//{1,2,3,4,5,6,7,8,9,10};
		//sortOdd(arr);
		System.out.println("Original array = "+Arrays.toString(arr));
		
		System.out.println();
		sortOnlyOddNumbers(arr);
		
		System.out.println("\n");
		sortOnlyEven(arr);
	}
	
	public static void sortOdd(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=(i+1); j<arr.length; j++)
			{
				if(arr[j] %2 ==1) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
// sort odd numbers ascending order which are present in odd indexes	
	public static void sortOnlyOddNumbers(int[] arr)
	{
		List<Integer> oddNumberlist = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2 !=0)
			{
				oddNumberlist.add(arr[i]);
			}
		}
		
		Collections.sort(oddNumberlist);
		System.out.println(oddNumberlist);
		
		int oddIndex = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] %2 !=0)
			{
				arr[i] = oddNumberlist.get(oddIndex);
				oddIndex++;
			}
		}
		
		System.out.print("Sorted odds = ");
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}

//	 sort odd numbers ascending order which are present in odd indexes
	public static void sortOnlyEven(int[] arr)
	{
		List<Integer> evenlist = new ArrayList<>();
		
		for(int val : arr) {
			if(val % 2 ==0) {
				evenlist.add(val);
			}
		}
		
		// sort even elements only
		Collections.sort(evenlist);
		System.out.println("Sorted evens = "+evenlist);
		
		int evens=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0) {
				arr[i] = evenlist.get(evens);
				evens++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
}
//given array of int as input. wam to sort all odd numbers in ascending order
