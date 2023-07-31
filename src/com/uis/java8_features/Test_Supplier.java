package com.uis.java8_features;

import java.util.function.Consumer;

class Movie{
	String name;

	public Movie(String name) {
		super();
		this.name = name;
	}
}

public class Test_Supplier {

	public static void main(String[] args) {
		
		Consumer<Movie> c1 = m->System.out.println(m.name+" is ready to release");
		Consumer<Movie> c2 = m->System.out.println(m.name+" is released and flop");
		Consumer<Movie> c3 = m->System.out.println(m.name+" is storing info in db");
		
		Consumer<Movie> cc = c1.andThen(c2).andThen(c3);
		
		Movie m1 = new Movie("Kabzaa");
//		c1.accept(m1);
//		c2.accept(m1);
//		c3.accept(m1);
		
		cc.accept(m1);
	}
}
