package com.uis.Arrays_Qsn;

public class Arrays {

	public static void main(String[] args) 
	{
		int[][] arr = {{11,2,4},
						{4,5,6},
						{10,8,13}};
		
		int diagonal_1=0, diagonal_2=0;
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(i==j) {
					diagonal_1 += arr[i][j];
				}
				if(i+j==2)
				{
					diagonal_2 +=  arr[i][j];
				}
			}
		}
		System.out.println(diagonal_1);
		System.out.println(diagonal_2);
		System.out.println("Sum of Diagonal = "+(diagonal_1-diagonal_2));
	}

}
