package com.uis.codeEvaluvation;

import java.util.Arrays;

public class BiggestElementInArray_Recursion {
	public static void main(String[] args) {
		int[] arr = {1,9,2,8,3,10,4,7,6,5};
		int num = arr.length-1;
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Biggest Element = "+biggestElement(arr, num));
		
	}
	
	public static int biggestElement(int[] arr, int index)
	{
		if(index == 0) {
			return arr[0];
		}
		int maxsofar = biggestElement(arr, index -1);
		return Math.max(maxsofar, arr[index]);
		
	}
}
