package com.uis.java8_features;

public class AnnonymousIC {

	public static void main(String[] args) {
	
	// Anonymous Inner Class implementing Runnable Interface , so here creating object	
		Runnable r = new Runnable() 
		{
			public void run() {
				for(int i=1;i<=10; i++) {
					System.out.println("Child Thread");
				}
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=1;i<=10; i++) {
			System.out.println("Main Thread");
		}
	}

}
