package com.uis.MockTest;

class B{
	public static int x =10;
	public static void m1() {
		System.out.println("m1() in B : "+x);
	}
}
public class A extends B
{
	public static int x =20;
	
//	public static void m1() {
//		System.out.println("m1() in A : "+x);
//	}
	
//	public static void main(String[] args) {
//		m1();
//	}
}
