package com.uis.NumberSeries;

public class HCM {

	public static void main(String[] args) {
		int a=18, b=24;
		
		int hcm = (a<b)?a:b;//taking lowest value
		
		for(int i=hcm; i>0; i--)
		{
			if((a%i==0) && (b%i==0)) {
				System.out.println("Highest Common factor = "+i);
				break;
			}
		}
		
		for(int i=1; i<=a || i<=b; i++)
		{
			if(a%i==0 && b%i==0)
			{
				hcm=i;
			}
		}
		System.out.println("Hcm of "+a+" & "+b+" is "+hcm);
		
		int x = 0;
		int lcm = (a>b) ? a:b;//taking highest value
		for(int i=lcm; i<=(a*b); i+=lcm)
		{
			if(i%a==0 && i%b==0) {
				x=i;
				break;
			}
		}
		System.out.println("Lcm of "+a+" & "+b+" is "+x);
		
	// 	Find Factorial of a Number
		int num2 = 5,factorial=1;
		int temp = num2;
		for(int i=1;i<=temp;i++)
		{
			factorial= (factorial*i);
		}
		
		System.out.println("Factorial of "+num2+" is "+factorial);
		
	//	Find Factorial of a Number (Using Recursion)
		int num3=5;
		System.out.println("Factorial using recursion");
		System.out.println(getFactorial(num3));
		
	}
	public static int getFactorial(int fnum)
	{
		if(fnum>0) {
			return fnum * getFactorial(fnum-1);
		}else {
			return 1;
		}
	}

}
