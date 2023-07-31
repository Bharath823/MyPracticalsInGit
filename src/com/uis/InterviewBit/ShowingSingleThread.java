package com.uis.InterviewBit;

public class ShowingSingleThread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread th = Thread.currentThread();
		th.setName("Bharath");
		th.setPriority(8);
		
		System.out.println(th);
		System.out.println(th.getName());
		System.out.println(th.getPriority());
	}

}
