package com.uis.NumberSeries;

public class FibonacciSeries {

	public static void main(String[] args)
	{
//		Scanner sc = new Scanner("System.in");
//		System.out.println("Enter the number");
//		int num = sc.nextInt();
//		sc.nextLine();
		int num = 6;
		getFibbonacciSeries(num);
		//sc.close();
	}
	
	public static void getFibbonacciSeries(int xnum)
	{
		int sum;
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		
		for(int i=3; i<=xnum; i++) 
		{
			sum = a+b;
			System.out.print(" "+sum);
			a = b;
			b = sum;
		}
	}

}
