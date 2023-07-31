package com.uis.java8_features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaWithCollection {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(50);
		l.add(10);
		l.add(0);
		l.add(40);
		l.add(100);
		l.add(90);
		
		System.out.println(l);
		
		// using lambda for comparator
		
	//	method1
		Comparator<Integer> c = (o1,o2) -> {
			return (o1<o2)? -1 : (o1>o2)? 1:0;
		};
		
	//	method2	
		//A
	//	Comparator<Integer> c1 = (o1,o2) -> (o1<o2)? -1 : (o1>o2)? 1:0;
		//B
		Collections.sort(l, (o1,o2) -> (o1<o2)? -1 : (o1>o2)? 1:0);
		System.out.println(l);	

	//	method3
		Collections.sort(l, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 < o2) {
					return -1;
				}
				else if(o1>o2) {
					return 1;
				}else {
					return 0;
				}
			//	return (o1<o2)? -1 : (o1>o2)? 1:0;
			}
		});
		System.out.println(l);

		// printing element present in stream one by one
		l.stream().forEach(System.out::println);
		
		//printing only even numbers
		List<Integer> l2 = l.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(l2);
		
	}
}
