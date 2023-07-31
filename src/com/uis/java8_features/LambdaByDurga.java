package com.uis.java8_features;

interface ABC
{
	public void m1();
}

public class LambdaByDurga {

	public static void main(String[] args) {
		ABC a1 = () -> System.out.println("Hello");
		
		a1.m1();
	}

}
