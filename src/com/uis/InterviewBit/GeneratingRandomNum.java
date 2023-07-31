package com.uis.InterviewBit;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GeneratingRandomNum {

	public static void main(String[] args) {
		Random random = new Random();
		
		System.out.println("Method--1");
		for(int i=1; i<5; i++) {
			System.out.println(random.nextInt());
		}
		
		System.out.println("\n"+"Method--2");
		for(int i=1; i<5; i++) {
			System.out.println(Math.random());
		}
		
		System.out.println("\n"+"Method--3");
		for(int i=1; i<5; i++) {
			System.out.println(ThreadLocalRandom.current().nextInt());
		}
	}

}
