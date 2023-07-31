package com.uis.java8_features;

import java.util.Arrays;
import java.util.List;

public class UsingMethodReference {

	public static void main(String[] args) {
		List<String> values = Arrays.asList("Akhil","Nikil","Vakil");
		
		values.forEach(System.out::println); // 
		System.out.println();
		values.forEach(s -> System.out.println(s));
	}

}
