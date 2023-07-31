package com.uis.java8_features;

interface MethodRef{
	public abstract void add(int x, int y);
}

public class Test_MethodReference 
{
	public void m1()
	{
		for(int i=1; i<=10; i++) System.out.println("Child Thread "+i);
	}
	
	public static void sum(int a, int b) {
		System.out.println("The sum is : "+(a+b));
	}
	
	
	public static void main(String[] args) {
		
//		Runnable r = new Test_MethodReference()::m1;
//		Thread t = new Thread(r);
//		t.start();
//				
//		for(int i=1; i<=10; i++) System.out.println("Main Thread "+i);
		
		MethodRef m = (x,y)->System.out.println("The sum is : "+(x+y));
		m.add(10, 20);
		
		MethodRef m1 = Test_MethodReference::sum;
		m1.add(100, 200);
		
	}

}
