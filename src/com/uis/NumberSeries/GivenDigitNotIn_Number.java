//Java Program To Find Largest Number Less Than Given Number And Without A Given DIgit :

package com.uis.NumberSeries;

public class GivenDigitNotIn_Number {

	public static void main(String[] args) 
	{
		System.out.println(getLessThanNumber(150,5));
		System.out.println(getLessThanNumber(149,1));
	}
	
	public static int getLessThanNumber(int num, int digit)
	{
		char c= Integer.toString(digit).charAt(0);
		
		for(int i=num; i>0; --i)
		{
			if(Integer.toString(i).indexOf(c)==-1) {
				return i;
			}
		}
		return -1;
	}

}
