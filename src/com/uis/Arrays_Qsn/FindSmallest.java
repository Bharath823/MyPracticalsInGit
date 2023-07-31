package com.uis.Arrays_Qsn;

public class FindSmallest {

	public static void main(String[] args)
	{
		int[] arr = new int[] {10,10,30,40,50,60,70,80,90,100};
		
		int count = 1;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=(i+1); j<arr.length; j++)
			{
				if(arr[i] != arr[j]) {
					count++;
					
					if(count==4) {
						System.out.println("Second smallest = "+arr[count-1]);
					}
					
				}else {
					break;
				}
			}
			
			if(count>1) {
				System.out.println();
				break;
			}
			
		}
	}

}
