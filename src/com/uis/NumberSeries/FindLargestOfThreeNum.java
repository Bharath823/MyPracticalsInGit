package com.uis.NumberSeries;

public class FindLargestOfThreeNum {

	public static void main(String[] args) {
		int a=100;
		int b=400;
		int c=300;
		
		//using Ternary Operator
		int max = (a>b) ? (a>c ? a:c) : (b>c ? b:c); //pwd->
		System.out.println("Max = "+max);
		
		int min = (a<b) ? (a<c ? a:c) : (b<c ? b:c);
		System.out.println("Min = "+min);
/*
 		// using if else condition
		if(a<b && a<c) {
			System.out.println("Largest number = "+a);
		}
		else if(b<a && b<c) {
			System.out.println("Largest number = "+b);
		}else {
			System.out.println("Largest number = "+c);
		}
*/
	}

}
