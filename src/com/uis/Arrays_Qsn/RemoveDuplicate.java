package com.uis.Arrays_Qsn;

public class RemoveDuplicate {

	public static void main(String[] args)
	{
		int[] arr = new int[] {20,20,30,40,50,50,50};
		
		int length = arr.length;
		
		for(int i=0; i<length; i++)
		{
			for(int j=(i+1); j<length; j++)
			{
				if(arr[i] == arr[j]) {
					arr[j] = arr[length-1];
					length--;
					j--;
				}
			}
		}
		
		int[] brr = new int[length];
		for(int i=0; i<brr.length; i++) {
			brr[i] = arr[i];
		}
		arr= null;
		for(int x : brr) {
			System.out.print(x+" ");
		}
		
		
		int[] xrr = {2,2,5,5,7,7};
		int count = 1;
		System.out.println();
		for(int i=0; i<xrr.length; i++) {
			for(int j=(i+1); j<xrr.length; j++)
			{
				if(xrr[i]==xrr[j]) {
					count++;
				}else {
					break;
				}
			}
			if(count>1) {
				System.out.println("Element="+xrr[i]+" occurs at "+count+" times");
			}
			count=1;
		}
	}

}
