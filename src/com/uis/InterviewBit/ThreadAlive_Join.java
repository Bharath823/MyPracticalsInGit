package com.uis.InterviewBit;

public class ThreadAlive_Join {

	public static void main(String[] args) {
		Demo1 d1 = new Demo1("Thread First");
		
		System.out.println("ALIVE "+d1.isAlive());
		System.out.println("ID "+d1.getId());
		System.out.println("NAME "+d1.getName());
		System.out.println("PRIORITY "+d1.getPriority());
		d1.start();
		System.out.println("STATE "+d1.getState());
		System.out.println("ALIVE "+d1.isAlive());
		System.out.println();
		
		Demo2 d2 = new Demo2();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//d2.setDaemon(true);
		d2.start();
		d2.interrupt();
		
		Thread mainthread = Thread.currentThread();
		try {
			mainthread.join(100);//Now main will not terminate till the daemon thread is terminated
		}
		catch(Exception e) {
			
		}
	}
}

class Demo1 extends Thread
{
	public Demo1(String name) {
		super(name);
		setPriority(MAX_PRIORITY);
	}
}

class Demo2 extends Thread
{

	@Override
	public void run() {
		int count=1;
		
		while(count !=10) {
			System.out.println("count="+count);
			count++;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
