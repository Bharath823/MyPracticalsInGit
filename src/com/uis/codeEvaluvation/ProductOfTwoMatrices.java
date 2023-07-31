package com.uis.codeEvaluvation;

import java.util.Arrays;

public class ProductOfTwoMatrices {

	public static void main(String[] args) {
		int[][] arr = {	{2,3,4},
						{2,2,2},
						{3,2,1}
					  };
		int[][] brr = {	{3,4,5},
						{3,3,3},
						{1,2,3}
					 };
		
	//	System.out.println(Arrays.deepToString(productOfMatrices(arr, brr)));
		
		int[][] resultarray = productOfMatrices(arr, brr);
		for(int i=0; i<resultarray.length; i++) {
			for(int j=0; j<resultarray[i].length; j++) {
				System.out.print(resultarray[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static int[][] productOfMatrices(int[][] xrr,int[][] yrr)
	{
		int[][] newarr = new int[xrr.length][xrr[0].length];
		
		for(int i=0; i<xrr.length; i++)
		{
			for(int j=0; j<yrr.length; j++)
			{
				newarr[i][j] = (xrr[i][j] * yrr[j][i]);
			}
		}
		return newarr;
	}
}
