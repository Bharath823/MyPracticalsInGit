package com.uis.NumberSeries;

public class PrintPrimeNumber {

	public static void main(String[] args) {
		int num = 99;
		System.out.println("Prime numbers are : ");
		for(int i=1; i<=num; i++)
		{
			if(isPrime(i)==1) {
				System.out.print(i+" ");
			}
		}

	}
		public static int isPrime(int n)
		{
			if(n<0)
				return -1;
			else if(n==0 || n==1)
				return 0;
			else if(n==2)
				return 1;
			else {
				for(int i=3; i<=n/2; i++)
				{
					if(n%i==0)
						return 0;
				}
			}
			return 1;
		}
	

}
