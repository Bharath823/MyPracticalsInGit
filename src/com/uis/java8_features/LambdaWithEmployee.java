package com.uis.java8_features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee
{
	int id;	
	String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}

public class LambdaWithEmployee {

	public static void main(String[] args) {
		List<Employee> l = new ArrayList<Employee>();
		
		l.add(new Employee(10, "Bharath"));
		l.add(new Employee(15, "Sharu"));
		l.add(new Employee(5, "Vishnu"));
		l.add(new Employee(24, "Kiara"));
		
		System.out.println(l);
		
	//	here sorting ascending order based on Employee id
		Collections.sort(l, (e1,e2)-> (e1.id<e2.id)? -1: (e1.id>e2.id)? 1: 0);
		System.out.println(l);
		
	//	here sorting ascending order based on Employee id
		Collections.sort(l, (e1,e2)-> (e1.name).compareTo(e2.name));
		System.out.println(l);
	}

}
