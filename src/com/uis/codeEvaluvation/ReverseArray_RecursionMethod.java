package com.uis.codeEvaluvation;

import java.util.Arrays;

public class ReverseArray_RecursionMethod {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Original Array = "+Arrays.toString(arr));
		System.out.println("\n"+"===============================");
		
		int start=0, end = arr.length-1;
		reverseArray(arr, start, end);
		
		System.out.println("\n"+"===============================");
		System.out.println("Reversed array = "+Arrays.toString(arr));
	}
	
	public static void reverseArray(int[] arr, int start, int end)
	{
		if(start>=end) {
			return;
		}
		
		//swap
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		System.out.println(Arrays.toString(arr));
		
		reverseArray(arr, start +1, end -1);
	}
}
