package com.uis.java8_features;

import java.util.Date;
import java.util.function.Supplier;

public class TestSupplier {

	public static void main(String[] args) {
		
		Supplier<Date> s = ()-> new Date();
		System.out.println(s.get());
		
		// supplier for generating Random
		Supplier<String> s1 = () ->{
			String otp = "";
			for(int i=0; i<6; i++) {
				otp += (int)(Math.random()*10);
			}
			return otp;
		};
		
		System.out.println(s1.get());
	}

}
