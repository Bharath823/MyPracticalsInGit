package com.uis.InterviewBit;

public class SaddlePointOfMatrix {

	public static void main(String[] args) {
		int[][] array = {{6,3,1},
						{9,7,8},
						{2,4,5}};
		
		
		for(int i=0; i<array.length; i++)
		{
			int rowMin = array[i][0];
			int colIndex = 0;
			boolean saddlePont = true;
			
	//	Finding the smallest element in ith row
			for(int j=1; j<array[0].length; j++)
			{
				if(array[i][j] < rowMin) {
					rowMin = array[i][j];
					colIndex = j;
				}
			}
			
	//	Checking rowMin is also the largest element in its column
			for(int j=0; j<array.length; j++) 
			{
				if(array[j][colIndex] >rowMin) {
					saddlePont = false;
				}
			}
			
			if (saddlePont) {
				System.out.println("Saddle Point is : "+rowMin);
			}
		}
	}

}
