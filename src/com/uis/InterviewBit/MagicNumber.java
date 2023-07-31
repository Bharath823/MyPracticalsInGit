package com.uis.InterviewBit;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number greater than 9");	// 1252, 1748
		
		int num = sc.nextInt();
		sc.close();
		if(isMagicNumber(num)==1) {
			System.out.println(num+" Magic Number");
		}else {
			System.out.println(num+" Not Magic Number");
		}
		
	}

	static int isMagicNumber(int num)
	{
		if(num < 0)
			return 0;
		
		if(num ==0 || num <9)
			return 0;
			
		int result = num;
		while(result > 9)
		{
			result = add(result);
		}
		return result;
	}
	
	static int add(int num1) {
		int sum=0;
		while(num1 >0) {
			int rem = num1 % 10;
			sum += rem;
			num1 /= 10;
		}
		return sum;
	}
}
