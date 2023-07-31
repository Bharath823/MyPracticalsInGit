package com.uis.Trial;

public class StaticCheck {
	public static void main(String[] args) {
		Child.pm();
	}
}
class Parent {
	public static void pm() {
		System.out.println("In parent ()");
	}
}

class Child extends Parent {
	
}