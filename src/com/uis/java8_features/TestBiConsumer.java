package com.uis.java8_features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class TestBiConsumer {

	public static void main(String[] args) {
		List<Employe> l = new ArrayList<Employe>();
		populate(l);
		
		BiConsumer<Employe,Double> b = (e,d) -> e.salary = e.salary+d;
		
		for(Employe e : l) {
			b.accept(e, 500.0);
		}
		
		for(Employe e : l) {
			System.out.println("name="+e.name +" salary="+e.salary);
			System.out.println();
		}
	}
	
	public static void populate(List<Employe> l)
	{
		l.add(new Employe("Shivu", 1000));
		l.add(new Employe("Raghu", 2000));
		l.add(new Employe("Varu", 3000));
		l.add(new Employe("Bharu", 4000));
	}

}
