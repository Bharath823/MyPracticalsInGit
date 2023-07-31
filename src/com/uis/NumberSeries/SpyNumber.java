package com.uis.NumberSeries;

public class SpyNumber {

	public static void main(String[] args) {
		int num = 1124;
		
		int sum =0,product=1, temp;
		temp = num;
		while(temp>0)
		{
			int rem = temp %10;
			sum += rem;
			product = product*rem;
			temp /=10;
		}
		System.out.println("sum = "+sum);
		System.out.println("Product = "+product);
		
		if(sum==product)
			System.out.println("Spy number");
		else
			System.out.println("Not spy number");
	}

}
