package com.uis.MellowInfo;

import java.util.Scanner;

public class TressureHunt {

	public static void main(String[] args) 
	{
	//	ArrayList<Integer> al = new ArrayList<Integer>();
	//	al.add(32,23);
		
		 int[][] map = new int[5][5];
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter elements");
	        for (int i = 0; i < 5; i++) 
	        {
	            for (int j = 0; j < 5; j++) 
	            {
	                map[i][j] = scanner.nextInt();
	            }
	        }
	        scanner.close();
	        // Start at the upper left corner
	        int row = 0;
	        int col = 0;
	        
	        // Follow the clues until the treasure is found
	        while (true)
	        {
	            int clue = map[row][col];
	            System.out.printf("(%d, %d) -> ", row+1, col+1);
	            if (clue == (row+1)*10 + col+1) 
	            {
	                System.out.println("Treasure found at (" + (row+1) + ", " + (col+1) + ")!");
	                break;
	            }
	            
	            row = clue / 10 - 1;
	            col = clue % 10 - 1;
	        }
	}
}
