package com.uis.NumberSeries;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=2;
		boolean flag=true;
		System.out.println("Prime numbers are :");
		
		if(num==0 || num==1) {
			System.out.println("Not a prime number");
		}else
			if(num==2) {
				System.out.println("Number is prime");
				System.exit(0);
		}
		else {
			for(int i=2; i<=num/2; i++) 
			{
				if(num%i==0) 
				{
					flag= false;
					break;
				}
			}
		}
		if(flag)
			System.out.println("Number is prime");
		else
			System.out.println("Not a prime number");
	}

}
