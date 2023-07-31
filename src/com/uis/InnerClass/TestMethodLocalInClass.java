package com.uis.InnerClass;

import com.uis.InnerClass.OuterStatic.Inner;

public class TestMethodLocalInClass {

	public static void main(String[] args) {
		MethodLocalIn_Class m = new MethodLocalIn_Class();
		//System.out.println("x="+m.x);
		m.useInner();
		
		Inner in = new Inner();
		in.print();
		
	//	System.out.println(in.z);
		
	}

}
