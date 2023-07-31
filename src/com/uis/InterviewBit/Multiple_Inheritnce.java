package com.uis.InterviewBit;

public class Multiple_Inheritnce {
	D d = new D();
}

class A {
	public void print() {
		System.out.println("in A print()");
	}
}

class B extends A{

	@Override
	public void print() {
		System.out.println("in B print()");
	}
}

class C extends A{
	@Override
	public void print() {
		System.out.println("in C print()");
	}
}

//multiple inheritance not allowed in Java
class D extends C {
	@Override
	public void print() {
		System.out.println("in D print()");
	}
}
