package com.uis.java8_features;

interface Calculator{
	//void switchOn();
	
	int sum(int i, int j);
}

public class CalculatorImpl {

	public static void main(String[] args) 
	{
		
	//	Calculator cal = () -> System.out.println("switchOn()..");
//		{
//			System.out.println("switchOn()..");
//		};
		//cal.switchOn();	
		
		
		//taking int as parameter ->m1 
		Calculator cal = (x,y) -> {
			System.out.println("sum(x+y)="+(x+y)); 
			return x+y;
		};
		System.out.println(cal.sum(10,20));
		
		cal = (x,y) ->  x-y; // no need of return statement
		System.out.println(cal.sum(20,10));
	}
}
