package com.uis.codeEvaluvation;

public class PrintLowCaseWords {

	public static void main(String[] args) 
	{
		String[] str = {"Hai","hello","files","Print","boOk","verY"};
		returnLowCaseWord(str);
	}
	
	public static void returnLowCaseWord(String[] str)
	{
		System.out.println("Smaller case word are : ");
		for(int i=0; i<str.length; i++)
		{
			boolean flag = true;
			char[] crr = str[i].toCharArray();
			for(int j=0; j<crr.length; j++)
			{
				if(!(Character.isLowerCase(crr[j]))) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.print(str[i]+" ");
			}
		}
	}

}
