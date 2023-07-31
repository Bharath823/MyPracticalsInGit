package com.uis.java8_features;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		d = LocalDate.of(1998, Month.MARCH, 23);
		System.out.println(d);
		
		System.out.println(LocalTime.now());
	}

}
