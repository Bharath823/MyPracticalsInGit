package com.uis.NumberSeries;

public class KrishnaMurthyNumber {

	public static void main(String[] args) {
		int num = 145;
		checkKrish(num);
		
	}
	
	public static void checkKrish(int num)
	{
		int temp = num;
		int sum = 0;
		
		while(temp > 0)
		{
			int rem = temp % 10;
			int factorial = 1;
			
			for(int i=1; i<=rem; i++)
			{
				factorial = factorial * i;
			}
			sum += factorial;
			temp /=10;
		}
		if(num==sum)
			System.out.println(sum+" Krishnamurthy Number");
		else
			System.out.println("Not Krishnamurthy Number");
		
	}

}
