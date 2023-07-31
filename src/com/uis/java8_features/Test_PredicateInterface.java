package com.uis.java8_features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employe
{
	String name;
	double salary;
	
	public Employe(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}

public class Test_PredicateInterface {

	public static void main(String[] args) {
		Predicate<Integer> p = i -> i%2==0 ;
		
		System.out.println(p.test(10));
		System.out.println(p.test(15));
		
		
		Predicate<String> p1 = s->s.length()>5;
//		System.out.println(p1.test("Bharath"));
//		System.out.println(p1.test("veer"));
		
		String[] str = {"Veer","bharath","lokesh","shivu","Theeru"};
		for(String x : str) {
			if(p1.test(x)) {
				System.out.println(x);
			}
		}
		
		System.out.println("\n"+"=====================");
		List<Employe> list = new ArrayList<Employe>();
		
		list.add(new Employe("Bharu", 1000));
		list.add(new Employe("Sharu", 2000));
		list.add(new Employe("Theeru", 3000));
		list.add(new Employe("kiran", 4000));
		list.add(new Employe("Shivu", 5000));
		list.add(new Employe("Ashok", 6000));
		
		System.out.println("Original List -> "+list+"\n");
		
		Predicate<Employe> p3 = e -> e.salary>3000;
		
		System.out.println("============================"+"After predicating");
		for(Employe e : list) {
			if(p3.test(e)) {
				System.out.println(e);
			}
		}
	}

}
