package com.uis.java8_features;

import java.util.function.IntPredicate;

public class TestIntPredicate
{
	public static void main(String[] args)
	{
		int[] arr = {0,5,10,15,20,25,30};
		
		IntPredicate p = i-> i%2==0;
		
		for(int x : arr){
			if(p.test(x)){
				System.out.print(x+" ");
			}
		}
	}
}
