package com.uis.Trial;

public class MainMethod {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(" "+arr1[i]);
		}
		
		
		int[] x1 = {1,2,3};
		int[] x2 = {1,2,3};
		if(x1.equals(x2)) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		
		System.out.println();
		
		System.out.println("Main Method");
		m1();
		m1(null);
		m1(10,20,30);
		m1(10);
		m1(null);
		
		String s1 = "FB";
		String s2 = "Ea";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode()+ " , "+s2.hashCode());
		
		int x = 10;
		Integer i = Integer.valueOf(x);
		System.out.println(i);
		
		int y = i.valueOf(i);
		System.out.println(y);
		
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a+b);
		
	}
	
	public static void m1(int... x) {
		System.out.println("Var arg method-1");
	}
	
	public static void m1(int x) {
		System.out.println("Var arg method-2");
	}

}

class ChildMain{
	public static void main(String[] args) {
		System.out.println("Child main");
	}

}
