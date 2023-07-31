package com.uis.NumberSeries;

public class PronicNumber {

	public static void main(String[] args) {
		int num = 10;
		for(int i=0; i<=num; i++)
		{
			int x = i*(i+1);
			System.out.print(x+" ");
		}
		System.out.println("");
		
		// Strontio number
		int num1 = 1111;
		
		if(num1>999 && num1<=9999) {
			checkStrontioNumber(num1);
		}else {
			System.out.println("Enter a four digit number..");
		}
	}
	
	public static void checkStrontioNumber(int x)
	{
		int product = x * 2;
		product /=10; 
		int r1 = product%10;
		product/=10;
		int r2 = product%10;
		System.out.println("r1="+r1);
		System.out.println("r2="+r2);
		if(r1==r2) {
			System.out.println("Strontio Number");
		}else {
			System.out.println("Not Strontio Number");
		}
	}

}
