//Write a java program to check if any number given as input
//is the sum of 2 prime numbers.

package com.uis.Arrays_Qsn;

public class Sum2Prime {

	public static void main(String[] args) {
		find(5);
	}
	
	// Method to get print the prime sum
		private static void find(int num)
		{
		for(int i = 2; i <= num/2; i++)
		{
			if(check_prime(i) == 0){
				if(check_prime(num-i) == 0)
					System.out.println(num + " = "+ (num-i) + " "+ i);
				}
			}
		}
	
	// Method to Check Prime Number
	private static int check_prime(int num)
	{
	int flag = 0;
	for(int i = 2; i<=num/2; i++)
	{
		if(num%i == 0)
		{
			flag = 1;
			return 1;
		}
	}
		if(flag == 0) {
			return 0;
		}
		return 1;
	}

}
