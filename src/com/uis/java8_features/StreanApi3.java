package com.uis.java8_features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreanApi3 {

	public static void main(String[] args) {
		List<Integer> jd = Arrays.asList(7, 2, 3, 1, 5, 6, 8);
		
		// 1st method
/*		Predicate<Integer> predicate = new Predicate<Integer>() {
			
			public boolean test(Integer t) {
				return t%2==1;
			}
		};
		
		jd.stream()
			.filter(predicate)
			.sorted()
			.map(i -> i*2)
			.forEach(i -> System.out.print(i+" "));
*/		
		//2nd method
/*		Predicate<Integer> predicate = (Integer t) -> {
			return t%2==1;
		};
	
		jd.stream()
			.filter(predicate)
			.sorted()
			.map(i -> i*2)
			.forEach(i -> System.out.print(i+" "));
*/	
		// 3rd method
		Predicate<Integer> predicate = t -> t%2==1;
	
		jd.stream()
			.filter(predicate)
			.sorted()
			.map(i -> i*2)
			.forEach(i -> System.out.print(i+" "));
		System.out.println();

		//4th method final for filter()
		jd.stream()
		.filter(t -> t%2==1) //*****
		.sorted()
		.map(i -> i*2)
		.forEach(i -> System.out.print(i+" "));
	}

}
