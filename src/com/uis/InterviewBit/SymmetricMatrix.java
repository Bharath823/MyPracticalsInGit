package com.uis.InterviewBit;

public class SymmetricMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{7,5,1},{5,8,3},{1,3,4}};
		
		
		if(matrix.length != matrix[0].length) {
			System.out.println("given matrix not square");
		}
		else {
			boolean symmetric = true;
			for(int i=0; i<matrix.length; i++) 
			{
				for(int j=0; j<matrix.length; j++)
				{
					if(matrix[i][j] != matrix[j][i]) {
						symmetric = false;
						break;
					}
				}
			}
			
			if(symmetric) {
				System.out.println("The given matrix is symmetric...");
			}
			else {
				System.out.println("The given matrix is not symmetric...");
			}
		}
	}

}
