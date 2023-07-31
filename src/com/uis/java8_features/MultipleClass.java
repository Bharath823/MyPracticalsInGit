package com.uis.java8_features;

interface C1
{
	default void m1() {
		System.out.println("C1 Inteface");
	}
}

class C2
{
	public void m1() {
		System.out.println("C2 class");
	}
}

public class MultipleClass extends C2 implements C1{

	public static void main(String[] args) {
		MultipleClass m = new MultipleClass();
		m.m1();
	}

}
