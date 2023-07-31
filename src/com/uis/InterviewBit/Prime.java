package com.uis.InterviewBit;

public class Prime {

	public static void main(String[] args) 
	{
		int num = 51, temp;
		
		boolean isPrime=true;
		
		if(num<=0 || num==1) {
			System.out.println("Not a Prime");
			System.exit(0);
		}
		else if(num==2) {
			System.out.println("Prime");
			System.exit(0);
		}
		else {
			for(int i=2; i<=num/2; i++)
			{
				temp = num%i;
				if(temp==0) {
					isPrime=false;
				}
			}
		}
		
		if(isPrime) {
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not a Prime");
		}
	}

}
