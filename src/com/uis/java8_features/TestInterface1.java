package com.uis.java8_features;

public class TestInterface1 {

	public static void main(String[] args) {
		A a = new A();
		a.show();
		
		I.mymethod();
	}

}

interface I{
	default void show() {
		System.out.println("I interface");
	}
	
	static void mymethod() {
		System.out.println("I interface mymethod()");
	}
	
//	default boolean equals(Object o) ** A default method cannot override a method from java.lang.Object **
//	{
//		System.out.println("I interface");
//		return true;
//	}
}

interface J{
	default void show() {
		System.out.println("J interface");
	}
}

class X{
	public void show() {
		System.out.println("X class");
	}
}

class A extends X implements I,J {
	
}
