package com.uis.Arrays_Qsn;

public class Sort_Even_Odd {

	public static void main(String[] args) {
		int[] arr = {1,3,2,7,5,6,4};
		
		int left = 0, right = arr.length-1;
		
		for(int i=0; i<arr.length; i++)
		{
			while(arr[left] % 2==0)
			{
				left++;
			}
			
			while(arr[right] % 2==1)
			{
				right--;
			}
			
			if(left<right) {
				arr[left] = arr[left] ^ arr[right];
				arr[right] = arr[left] ^ arr[right];
				arr[left] = arr[left] ^ arr[right];
			}
		}
		
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}

}
