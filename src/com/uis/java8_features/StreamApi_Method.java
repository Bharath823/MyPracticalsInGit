package com.uis.java8_features;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamApi_Method {

	public static void main(String[] args) {
		Stream<Integer> s1 = Stream.of(10,20,30,40,50,60);
		
		s1.filter(i-> i>20);
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Varun");
		al.add("Manja");
		al.add("Thimma");
		al.add("Seenu");
		al.add("Bheeru");
		al.add("Bheema");
		
		Stream<String> s2 = al.stream();
		s2=s2.filter(s->s.startsWith("B"));
		
		s2.forEach(name->System.out.println(name));
	}

}
