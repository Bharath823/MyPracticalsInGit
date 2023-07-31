package com.uis.InnerClass;

public class TestInnerStaticClass {

	public static void main(String[] args) {
		OuterStatic.Inner in = new OuterStatic.Inner();
		in.print();
		
		OuterStatic o = new OuterStatic();
		System.out.println(o.x);
	}

}
