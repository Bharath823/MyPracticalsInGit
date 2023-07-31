package com.uis.java8_features;

interface AB
{
	void show(int i);
}


public class LambdaDemo 
{
	public static void main(String[] args) 
	{
		AB obj;
//		obj = new AB() //Anonymous Inn so In this case 3 classes are created ->A.class, LambdaDemo.class, LambdaDemo$1.class
//		{
//			@Override
//			public void show() {
//				System.out.println("hello");
//			}
//		};
//		obj.show();
		
		// using lambda expression and it works only for functional interface & it may have default methods
		obj = i -> System.out.println("Using lambda expression "+i);
		
		obj.show(6);
	}

}
