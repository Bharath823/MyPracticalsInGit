package com.uis.Arrays_Qsn;

public class Max_Min {

	public static void main(String[] args) {
		int[] arr = {53,32,19,79,25,5,47};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=(i+1); j<arr.length; j++)
			{
				if(arr[i]>max) {
					max= arr[i];
				}
				else if(arr[i]<min) {
					min= arr[i];
				}
			}
		}
		System.out.println("max = "+max);
		System.out.println("min = "+min);
	}

}
