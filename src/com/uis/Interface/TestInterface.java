package com.uis.Interface;

public class TestInterface {

	public static void main(String[] args) {
		Thing thing = new Tool();
		thing.doSomething();
		
		thing = new Spanner();
		thing.doSomething();
		
		Spanner sp = new Spanner();
		sp.doSomething();
		
		Tool t = new Tool();
		
		Vehichle v = new Vehichle("Benz");
		v.doSomething();
		
		Person p = new Person();
		p.testThing(thing);
		p.testThing(sp);
		p.testThing(t);
		
	}
}

interface Thing {
	void doSomething();
}

class Tool implements Thing
{
	@Override
	public void doSomething() {
		System.out.println("In Tool -> doSomething()");
	}
}

class Spanner extends Tool
{
	@Override
	public void doSomething() {
		System.out.println("In Spanner -> doSomething()");
	}
}

class Vehichle implements Thing
{
	private String name;
	
	public Vehichle(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void doSomething() {
		System.out.println("Driving vehicle -> "+name);
	}
}

class Person
{
	public void testThing(Thing t)
	{
		System.out.println("Person Testing thing..");
		t.doSomething();
	}
}
