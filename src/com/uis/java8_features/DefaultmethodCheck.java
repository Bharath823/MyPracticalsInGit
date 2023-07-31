package com.uis.java8_features;

interface New1
{
	default void m1() {
		System.out.println("default New1 method");
	}
}

interface New2
{
	default void m1() {
		System.out.println("default New2 method");
	}
}

public class DefaultmethodCheck implements New1 ,New2 
{

	@Override
	public void m1() {
		//System.out.println("Overridden default method");
		//New1.super.m1();
		New2.super.m1();
	}

	public static void main(String[] args) {
		
		DefaultmethodCheck d = new DefaultmethodCheck();
		d.m1();
	}

}
