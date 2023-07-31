package com.uis.InterviewBit;

public class StairCaseSearch {

	public static void main(String[] args) {
		int[][] arr = {{1,4,7,11,15},
						{2,5,8,12,19},
						{3,6,9,16,22},
						{10,13,14,17,24},
						{18,21,23,26,30}};
		
		int target = 21;
		
		int i=0;
		int j=arr.length-1;
		
		while(i<arr.length && j>=0)
		{
			if(arr[i][j]==target) {
				System.out.println("true");
				break;
			}
			else if(arr[i][j]<target) {
				i++;
			}else {
				j--;
			}
		}
	}

}
