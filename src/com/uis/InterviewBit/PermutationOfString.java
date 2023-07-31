package com.uis.InterviewBit;

public class PermutationOfString {

	public static void main(String[] args) {
		String str = "JSP";
		StringPermutation(str);
		
		
		System.out.println("\n"+"Floyd's Triangle");
		int n=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(n++ +" ");
			}
			System.out.println();
		}
	}
	
	public static void StringPermutation(String input)
	{
		StringPermutation("",input);
	}
	
	public static void StringPermutation(String permutation, String input)
	{
		if(input.length()==0) {
			System.out.println(permutation);
		}
		else
		{
			for(int i=0;i<input.length(); i++)
			{
				StringPermutation(permutation+input.charAt(i),input.substring(0,i)+input.substring(i+1, input.length()));
			}
		}
		
	}

}
