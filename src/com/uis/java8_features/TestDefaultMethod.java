package com.uis.java8_features;

public class TestDefaultMethod {

	public static void main(String[] args) {
		Phone p = new AndroidPhone();
		p.call();
		p.message();
	}
}

interface Phone
{
	void call(); // by default public abstract
	
	default void message() {
		System.out.println("Sent message..");
	}
}

class AndroidPhone implements Phone
{

	@Override
	public void call() {
		System.out.println("AndroidPhone calling...");
	}
	
}