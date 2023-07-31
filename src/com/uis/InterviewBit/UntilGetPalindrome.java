package com.uis.InterviewBit;

public class UntilGetPalindrome {

	public static void main(String[] args) {
		int input = 7325,temp;
		temp = input;
		
		while(true) 
		{
			int reverse = reverseNumber(temp);
		
			int sum = (temp+reverse);
			System.out.println(temp+" + "+reverse+" = "+sum);
			if(Integer.toString(sum).equals(reverseNumber(sum)+"")) {
				System.out.println("Palindrome "+sum);
				System.exit(0);
			}
			else
			{
				temp=sum;
			}
		}
	}
	
	public static int reverseNumber(int n)
	{
		int reverse=0;
		
		while(n>0)
		{
			int rem = n%10;
			reverse = reverse*10 + rem;
			n/=10;
		}
		return reverse;
	}

}
