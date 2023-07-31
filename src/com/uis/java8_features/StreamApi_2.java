package com.uis.java8_features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi_2 {

	public static void main(String[] args) {
		List<Integer> jd = Arrays.asList(7, 2, 3, 1, 5, 6, 8);

		Stream<Integer> stram = jd.stream();
		Stream<Integer> mapData = stram.map(n -> n*2);
		mapData.forEach(d -> System.out.print(d+" "));
		System.out.println();
		
		// above code we write it in one code 
		jd.stream() //it return stream<Integer>, so here creating stream object
				.map(n -> n*2) //it return stream<Integer>, taking one one element from stream<Integer> & perform operation then put it in Stream only
				.forEach(d -> System.out.print(d+" ")); // not return anything just printing
		
		// Long count = stram.count();
		// System.out.println("Count = "+count);
	/*
		Stream<Integer> sortedData = stram.sorted();
		sortedData.forEach(s -> System.out.print(s + " "));
		// Exception occur
		// stram.forEach(t -> System.out.println(t)); // stream has already been
		// operated upon or closed 
	*/
	}

}
