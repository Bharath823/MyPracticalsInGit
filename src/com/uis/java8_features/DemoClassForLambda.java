package com.uis.java8_features;

import java.util.function.*;

public class DemoClassForLambda {

	public static void main(String[] args) {

		System.out.println("square of 4 : "+square(4));
		
		//return square of given number
		Function<Integer,Integer> fun = i -> i*i; //lambda function
		
		System.out.println("square of 60 : "+fun.apply(60));
		
		//check given number is even or not
		Predicate<Integer> pd = i -> i%2==0;
		System.out.println("4 is even : "+pd.test(4));
		System.out.println("5 is even : "+pd.test(5));
	}

	public static int square(int x)
	{
		return x*x;
	}
}

@FunctionalInterface 
interface AX
{
	void m1();
	
	default void m2() {
		
	}
	
	static void m3() {
		
	}
}

//@FunctionalInterface
interface B extends AX
{
	void m12();
}
