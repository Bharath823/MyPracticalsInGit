package com.uis.Arrays_Qsn;

public class Sort_Max_Min {

	public static void main(String[] args) 
	{
		int[] arr = new int[] {10,20,30,40,50,60,70,80,90,100};
		
		int min=0, max= arr.length-1;
		
		int[] temp = new int[arr.length];
		
		boolean flag = true;
		
		for(int i=0; i<arr.length; i++)
		{
			if(flag) {
				temp[i] = arr[max--];
			}
			else {
				temp[i] = arr[min++];
			}
			flag = !flag;
		}
		
		for(int x : temp)
		{
			System.out.print(x+" ");
		}
		
		
	}

}
