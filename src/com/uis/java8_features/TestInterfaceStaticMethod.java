package com.uis.java8_features;

interface Static{
	public static void m1() {
		System.out.println("static interface");
	}
}

public class TestInterfaceStaticMethod
{
	public static void main(String[] args) {

		Static.m1();
	//	m1();
	//	TestInterfaceStaticMethod t = new TestInterfaceStaticMethod();
		//t.m1();
	}

}
