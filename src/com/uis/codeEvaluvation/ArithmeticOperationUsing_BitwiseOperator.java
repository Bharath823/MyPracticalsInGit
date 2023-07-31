package com.uis.codeEvaluvation;

public class ArithmeticOperationUsing_BitwiseOperator {

	public static void main(String[] args) {
	//	add two integers without using + operator	
		System.out.println(add(1,1));
		
	//	multiplying two integers using bitwise operator
		System.out.println(multiply(5, 7));
		
	//	divide two positive integers without using / or % operator
		System.out.println(divide(20, 4));
		
	}

//	add two integers without using + operator	
	public static int add(int a, int b) {
		
		while(b !=0 ) {
			int carry = a & b; // taking carry using AND
			a = a ^ b; // adding ints using exor 
			b = carry << 1; // shifts to carry to 1 bit to calculate sum
		}
		return a;
	}
	
//	multiplying two integers using bitwise operator
	public static int multiply(int a, int b) {
		int result = 0;
		while(b != 0) 
		{
			if((b&1)!=0) {
				result += a;
			}
			a = a<<1;
			b = b>>1;
		}
		return result;
	}
	
//	divide two positive integers without using / or % operator
	public static int divide(int dividend, int divisor) {
		//Handle special cases
		
		if(divisor==0) {
			throw new ArithmeticException("Division By zero");
		}
		
		if(dividend==0 || dividend<divisor) {
			return 0;
		}
		
		int quotient=0;
		while(dividend >= divisor) {
			dividend -= divisor;
			quotient++;		
		}
		
		return quotient;
	}
}
