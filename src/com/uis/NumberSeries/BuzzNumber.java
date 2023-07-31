package com.uis.NumberSeries;

public class BuzzNumber {

	public static void main(String[] args) {
		int num = 1027;
	
	// counting number of Digits in an Integer
		int count=0,temp;
		temp = num;
		while(temp>0) {
			count++;
			temp /=10;
		}
		System.out.println("Num of Digits in num "+num+ " is "+count);
		
	//	reverse a number
		int reverse =0;
		while(num>0) {
			int x = num%10;
			reverse = (reverse*10)+x;
			num /= 10;
		}
		System.out.println("reverse num = "+reverse);
	
	//	Buzz Number
		if(num % 7==0 || num%10==7) {
			System.out.println(num+" is Buzz Number");
		}else {
			System.out.println("Not Buzz Number");
		}
	}

}
