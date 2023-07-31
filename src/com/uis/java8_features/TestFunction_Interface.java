package com.uis.java8_features;

import java.util.function.*;
public class TestFunction_Interface {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f = i->i*i;
		
		System.out.println(f.apply(4)+"\n");
		
	//	take input string return int
		Function<String,Integer> f2 = s->s.length();
		System.out.println(f2.apply("bharath")+"\n");
		
	//	take input string return String	
		Function<String,String> f3 = s->s.toUpperCase();
		System.out.println(f3.apply("bharath"));
	}

}
