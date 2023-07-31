package com.uis.InterviewBit;


public class SpiralMatrix_AntiClockWise {

	public static void main(String[] args) {
		
		int n=5;
		
		int[][] array = new int[n][n];
		
		int val=1, minCol=0, maxCol=n-1, minRow=0, maxRow=n-1;
		
		while(val <= n*n)
		{
			for(int i=minRow; i<=maxRow; i++)
			{
				array[i][minCol] = val;
				val++;
			}
			
			for(int i=minCol+1; i<=maxCol; i++)
			{
				array[maxRow][i] = val;
				val++;
			}
			
			for(int i=maxRow-1; i>=minRow; i--)
			{
				array[i][maxCol] = val;
				val++;
			}
			
			for(int i=maxCol-1; i>=minCol+1; i--) {
				array[minRow][i]=val;
				val++;
			}
			
			minCol++;
			minRow++;
			maxCol--;
			maxRow--;
			
		}
		
		System.out.println("Printing Array");
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array.length; j++)
			{
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
