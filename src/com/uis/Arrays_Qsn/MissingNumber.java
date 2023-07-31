package com.uis.Arrays_Qsn;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = {2,1,4,3,5,8,7};
		int n = arr.length+1;
		
		int num = n*(n+1)/2;
		int sum=0;
		
		for(int i=0; i<arr.length; i++)
		{
			sum += arr[i];
		}
		
		System.out.println("Missing num = "+(num-sum));
	}

}
