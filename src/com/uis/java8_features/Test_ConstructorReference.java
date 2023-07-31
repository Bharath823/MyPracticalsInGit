package com.uis.java8_features;

public class Test_ConstructorReference {

	public static void main(String[] args) {
		
//		ConsRef c = Sample::new;
//		Sample s = c.get();
		
		ConsRef c1 = Sample::new ;
		Sample s1 = c1.get(10);
		System.out.println(s1.a);
		
	}

}

class Sample
{
	public int a;
	
	public Sample() {
		System.out.println("Sample class constructor");
	}
	
	public Sample(int x) {
		this.a=x;
		System.out.println("Sample class parameter constructor "+x);
	}
}

interface ConsRef
{
	public Sample get(int x);
}
