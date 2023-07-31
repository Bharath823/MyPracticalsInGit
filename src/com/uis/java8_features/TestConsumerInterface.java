package com.uis.java8_features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//class ConsImpl implements Consumer<Integer>  //1st
//{
//	@Override
//	public void accept(Integer t) {
//		System.out.print(t+" ");
//	}
//	
//}

public class TestConsumerInterface {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>(Arrays.asList(2,1,5,4,8,7));
		
	/*	Consumer<Integer> consumer = new Consumer<Integer>() //1st  // instead of creating extra class so create Inner class
		{
			public void accept(Integer i) {
				System.out.print(i + " ");
			}
		};
		values.forEach(consumer);
	*/	
		
	/*	// 2nd 
		Consumer<Integer> consumer = (i) -> System.out.print(i+" "); // using Consumer Interface
		values.forEach(consumer); // forEach take one one Integer from values and pass into accept() and print value
	*/
		
		//3rd
		//using lambda expression
		values.forEach(i -> System.out.print(i+" "));
		
	}

}
