package com.uis.InterviewBit;

import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		String str1 = "((()))";
        String str2 = "[{()}]";
        String str3 = "({[})";
        String str4 = "(()((((()(";
        
        System.out.println(str1 + " is balanced: " + isBalanced(str1));
        System.out.println(str2 + " is balanced: " + isBalanced(str2));
        System.out.println(str3 + " is balanced: " + isBalanced(str3));
        System.out.println(str4 + " is balanced: " + isBalanced(str4));
	}
	
	public static boolean isBalanced(String s)
	{
		Stack<Character> stack = new Stack();
		
		for(char ch : s.toCharArray())
		{
			if(ch=='(' || ch=='{' || ch=='[') 
			{
				stack.push(ch);
			}
			else if(ch==')' || ch=='}' || ch==']') 
			{
				if(stack.isEmpty()) {
					return false;
				}
				
				char top = stack.pop();
				if((ch==')'&& top !='(')||(ch=='}'&& top !='{')||(ch==']'&& top !='[')){
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}
