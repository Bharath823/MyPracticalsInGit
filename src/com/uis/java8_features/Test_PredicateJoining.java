package com.uis.java8_features;

import java.util.function.Predicate;

public class Test_PredicateJoining {

	public static void main(String[] args) {
		int[] x = {0,5,10,15,20,25,30,35};
		
		Predicate<Integer> p1 = i -> i%2==0;
		Predicate<Integer> p2 = i -> i>10;
		
		//and(), or(), negate()  
		System.out.println("The numbers which are even and > 10 are : ");
		
		//and()
		for(int x1 : x) {
			if(p1.and(p2).test(x1)) {
				System.out.print(x1+" ");
			}
		}
		
		//or()
		System.out.println("\n"+"The numbers which are even or > 10  : ");
		//and()
		for(int x1 : x) {
			if(p1.or(p2).test(x1)) {
				System.out.print(x1+" ");
				}
			}
			
		System.out.println("\n"+"The numbers which are not even : ");
		//negate()
		for(int x1 : x) {
			if(p1.negate().test(x1)) {
				System.out.print(x1+" ");
				}
			}
	}

}
