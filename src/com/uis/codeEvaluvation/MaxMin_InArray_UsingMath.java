package com.uis.codeEvaluvation;

import java.lang.annotation.Native;
import java.util.Arrays;

public class MaxMin_InArray_UsingMath {

	public static void main(String[] args) {
		int[] arr = {1,3,5,2,9,8,7};
		System.out.println("Original Array");
		System.out.println(Arrays.toString(arr)+"\n");
		
		max_min(arr);
		max_SecMax(arr);
		max_SecMax_Ternary();
		fourthMax_Min(arr);
	}
	
	public static void max_min(int[] arr)
	{
		int max=arr[0], min=arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		System.out.println("min="+min +" max="+max+"\n");
	}

	public static void max_SecMax(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		int secmax = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				secmax = max;
				max = arr[i];
			}
			else if(max > arr[i] && secmax < arr[i]) {
				secmax = arr[i];
			}
		}
		System.out.println("max="+max +" secmax="+secmax+"\n");
	}
	
	public static void max_SecMax_Ternary()
	{
		int x=5, y=10, z =1;
		int larg = (x > y) ? (x > z ? x : z) : (y>z ? y : z);
		
		int min = (x<y) ? (x<z ? x:z) : (y<z ? y:z);
		
		System.out.println("max="+larg +" min="+min +"\n"); 
	}
	
	public static void fourthMax_Min(int[] arr)
	{
		int count =0;
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i] != arr[i+1]) count++;
			
			if(count==3) { System.out.println("fourthMin="+arr[i]+"\n"); break;}
		}
		
	}
}
// we'll say that value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. Return true if the given value is even where in the array.

interface check
{
	void m1();
	String m1(int x);
}

interface c2 extends check
{
	
}

interface c3 extends check,c2
{
	
}