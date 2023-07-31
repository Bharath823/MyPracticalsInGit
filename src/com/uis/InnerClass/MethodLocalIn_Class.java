package com.uis.InnerClass;

public class MethodLocalIn_Class {
	private int x=10;
	
	public void useInner() {
		
		int y=20;
		
		class Inner {
			 final int z=30;
			
			 void print() {
				System.out.println("z="+z+"x="+x+" y="+y);

			 }
			 
		}
	}
}
