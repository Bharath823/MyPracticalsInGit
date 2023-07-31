package com.uis.Arrays_Qsn;

import java.util.Arrays;

public class Trial {

	public static void main(String[] args)
	{
		int[] arr = {20,20,30,40,50,50,50}; // sort
	//	removeDuplicate(arr);
		
		occurenceOfDuplicate(arr);
		
	}
	
	public static void removeDuplicate(int[] arr)
	{
		int length = arr.length;
		
		for(int i=0; i<length; i++)
		{
			for(int j=i+1; j<length; j++)
			{
				if(arr[i] == arr[j]) {
					arr[j] = arr[arr.length-1];
					length--;
					j--;
				}
			}
		}
		
		int[] newarray = new int[length];
		for(int i=0; i<newarray.length; i++) {
			newarray[i] = arr[i];
		}
		arr = null;

		for(int x : newarray)
			System.out.print(x+" ");
	}
	
	public static void occurenceOfDuplicate(int[] arr)
	{
		int count = 1;
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=(i+1); j<arr.length; j++)
			{
				if(arr[i]==arr[j]) {
					count++;
				}else {
					break;
				}
			}
			if(count>1) {
				System.out.println(arr[i]+" occurs "+count+" times");
				i = i+(count-1);
			}
			count=1;
		}
	}

}
