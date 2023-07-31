/*
 * 
In This Question A value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. 
Return true if the given value is everywhere in the array.

isEverywhere({1, 2, 1, 3}, 1) → true,coz 1 is present in(1,2) and (1,3) isEverywhere({1, 2, 1, 3}, 2) → false,
coz 2 is in (1,2) but not in (1,3) isEverywhere({1, 2, 1, 3, 4}, 1) → false,
coz 1 is present in 2 pairs (1,2) and (1,3) but 4 is not having a pair of 1
 */

package com.uis.codeEvaluvation;

public class IsEveryWhere_Array {

	public static void main(String[] args) {
		
		System.out.println(isEveryWhere(new int[]{1, 2, 1, 3, 4}, 1));
	}

	public static boolean isEveryWhere(int[] arr, int num)
	{
		boolean flag = true;
		
		for(int i=0; i<arr.length; i+=2)
		{
			if(num != arr[i]) {
				return flag=false;
			}
		}
		return flag;
	}
}

// A List of strings is given as input. Rearrange the strings in such a way that the last letter of the first word is the start letter of the second word and second word last letter should be the first letter of the third and so on. The first word is fixed
