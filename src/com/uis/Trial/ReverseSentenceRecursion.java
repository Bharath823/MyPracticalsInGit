package com.uis.Trial;

public class ReverseSentenceRecursion 
{
	//recursive function to reverse a string  
	public void reverseString(String string)   
	{   
		if ((string==null)||(string.length() <= 1)) { 
			System.out.println(string); 
		}
		else  
		{   
		System.out.print(string.charAt(string.length()-1));   
		reverseString(string.substring(0,string.length()-1));   
		}   
	} 
	
	final synchronized strictfp public static void main(String... abc)   
	{   
		//string to be reversed  
		String str = "The purpose of our lives is to be happy.";   
		ReverseSentenceRecursion rs = new ReverseSentenceRecursion();  
		//invoking the recursive function and passing the string to be reversed   
		rs.reverseString(str);  
	
		
	}      
}
