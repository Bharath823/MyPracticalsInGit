package com.uis.codeEvaluvation;

public class FibbonacciSeriesUsing_Recursion {

	public static void main(String[] args) {
		int num = 60;
		int first =0;
		int sec =1;
		fibbonacciRecursion(first,sec, num);
	}
	
	public static void fibbonacciRecursion(int num1,int num2,int size) {
		if(num1>=size) {
			return;
		}
		
		int temp = num1;
		num1 = num2;
		num2 = temp +num1;
		System.out.print(temp+" ");
		
		fibbonacciRecursion(num1 , num2 , size);
	}

}
