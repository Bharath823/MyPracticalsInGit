package com.uis.InterviewBit;

public class PrintMatrixIn_WaveOrder {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},
						{4,5,6},
						{7,8,9}};
		
		//interview bit approach
		for(int j=0; j<arr[0].length; j++) 
		{
			if(j%2==0)
			{
				for(int i=0; i<arr.length; i++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			else {
				for(int i=arr.length-1; i>=0; i--) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
		System.out.println("---------------------"+"\n");
		//my approach
		int j=0;
		for(int i=0; i<arr.length; i++)
		{
			while( j<arr.length && j>-1)
			{
				if(i==0) {
					System.out.print(arr[j][i]+" ");
					j++;
				}
				else if(i==1) {
					System.out.print(arr[j][i]+" ");
					j--;
				}else {
					System.out.print(arr[j][i]+" ");
					j++;
				}
			}
			System.out.println();
			if(j==3) {
				j -= 1;
			}
			else if(j==-1) {
				j += 1;
			}
		}
	}

}
