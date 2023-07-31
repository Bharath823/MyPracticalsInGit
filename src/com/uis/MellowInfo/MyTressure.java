package com.uis.MellowInfo;

public class MyTressure {

	public static void main(String[] args) {
		int[][] arr = {{34,21,32,41,25},
					   {14,42,43,14,31},
					   {54,45,52,42,23},
					   {33,15,51,31,35},
					   {21,52,33,13,23}};
		
		int row=0, col=0;
		
		int clue=0;
		
		while(true)
		{
			
			clue =  arr[row][col];
			
			if(clue==(row+1)*10+(col+1))
			{
				System.out.println("Element found "+arr[row][col]);
				break;
			}
			
			row = clue/10-1;
			col = clue%10-1;
		}
		
		for(int i=0; i<arr.length;)
		{
			for(int j=0; j<arr.length;)
			{
				int box = arr[i][j];
				
				if(box == (i+1)*10 +(j+1)) {
					System.out.println("Element found->"+arr[i][j]);
					System.exit(0);
				}
				i= box/10-1;
				j= box%10-1;	
			}
		}
	}

}
