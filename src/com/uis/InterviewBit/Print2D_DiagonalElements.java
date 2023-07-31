package com.uis.InterviewBit;

public class Print2D_DiagonalElements {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4,5},
						{6,7,8,9,10},
						{11,12,13,14,15},
						{16,17,18,19,20},
						{21,22,23,24,25}
					  };
		
		int l = arr[0].length;
		
		for(int gap=0; gap<l; gap++)
		{
			for(int i=0, j=gap; i<arr.length && j<arr[0].length;i++,j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
