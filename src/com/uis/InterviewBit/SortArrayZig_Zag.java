package com.uis.InterviewBit;

public class SortArrayZig_Zag {

	public static void main(String[] args) {
		int[] arr = {9,8,6,3,4,7,2};
		
		waveSort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
		
		public static void waveSort(int[] arr) 
		{
			for(int i=0;i<arr.length;i=i+2) 
			{
				if(i>0 && arr[i-1] > arr[i]) {
					swap(arr,i-1,i);
				}

				if(i<arr.length-1 && arr[i+1] > arr[i]) {
					swap(arr,i,i+1);
				}
			}
		}
		
		public static void swap(int[] arr, int i, int j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
}
