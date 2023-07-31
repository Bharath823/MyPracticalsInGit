package com.uis.InnerClass;

public class OuterStatic {
	public static int x =10;
	
	public static class Inner{
		public int y=20;
		
		public void print() {
			System.out.println("x = "+x+ " y = "+y);
		}
	}
}
