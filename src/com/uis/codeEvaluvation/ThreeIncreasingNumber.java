package com.uis.codeEvaluvation;

public class ThreeIncreasingNumber {

	public static void main(String[] args) {
		int[] arr = {1,3,2,4,0,5,1,6}; //{1,3,2,4,5,6};
		
		boolean flag = false;
		int count = 1;
		for(int i=0; i<arr.length-2; i++) //i=2
		{
			for(int j=(i); j<arr.length-1; j++)//j=3
			{
				if(arr[j]<arr[j+1]) {
					count++;
					continue;
				}
				i= j;
				break;
			}
			if(count>=3) {
				flag = true;
				break;
			}
			count=1;
		}
		
		if(flag) {
			System.out.println("Array contain Increasing element");
		}else {
			System.out.println("No Increasing element");
		}
	}

}
