package com.uis.MellowInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreassureWithList {

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();
		list.addAll(Arrays.asList(
				Arrays.asList(34,21,32,41,25),
				Arrays.asList(14,42,43,14,31),
				Arrays.asList(54,45,52,42,23),
				Arrays.asList(33,15,51,31,35),
				Arrays.asList(21,52,33,13,23)
				));
		int size = list.size();
		
		int[][] array = new int[size][list.get(0).size()];
		
	// Iterate over the list and copy the values to the 2D array
		for (int i = 0; i < size; i++) 
		{
		  for (int j = 0; j < list.get(i).size(); j++) 
		  {
		    array[i][j] = list.get(i).get(j);
		  }
		}
		System.out.println("Array elements are ");
		System.out.println(Arrays.deepToString(array)+"\n");
		
		int i=0, j=0;
		int val=0;
		while(true) {
			val = array[i][j];
			
			if(val==(i+1)*10+(j+1)) {
				System.out.println("Element found = "+array[i][j]);
				System.out.println("Where val="+val);
				break;
			}
			i = val/10-1;
			j = val%10-1;
		}
	}

}
