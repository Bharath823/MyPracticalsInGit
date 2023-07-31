package com.uis.codeEvaluvation;

public class UniqueArray {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int[] arr2 = {0,2,5,7,10};
		
		int[] result =  uniqueArray(arr1, arr2);
		
		for(int x : result) {
			System.out.print(x+" ");
		}
		
	}
	
	public static int[] uniqueArray(int[] x1, int[] x2)
	{
		int count=0;
		if(x1.length > x2.length) {
			for(int i=0; i<x1.length; i++) 
			{
				boolean flag = true;
				for(int j=0; j<x2.length; j++)
				{
					if(x1[i] == x2[j]) {
						flag = false;
						break;
					}
				}
				if(flag) {
					count++;
				}
			}
		}
		
		int[] uniqueArray = new int[count];
		
		int un = 0;
		for(int i=0; i<x1.length; i++) 
		{
			boolean flag = true;
			for(int j=0; j<x2.length; j++) 
			{
				if(x1[i] == x2[j]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				uniqueArray[un++] = x1[i];
			}
		}
		return uniqueArray;
	}
}
