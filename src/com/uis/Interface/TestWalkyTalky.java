package com.uis.Interface;

public class TestWalkyTalky {

	public static void main(String[] args) {
		WalkyTalky walkytalky = new WalkyTalky();
		
		Transmitter transmitter = walkytalky;
		transmitter.transmitt("Hello dear..!");
		
		Reciever reciever = walkytalky;
		String recievedmessage = reciever.recieve();
		System.out.println("recievedmessage = "+recievedmessage);
	}
}

interface Transmitter
{
	void transmitt(String tmt);
}

interface Reciever
{
	String recieve();
}

class WalkyTalky implements Transmitter,Reciever
{
	private String message;
	
	public void transmitt(String message) {
		this.message = message;
		System.out.println("WalkyTalky transmitting  message is = "+message);
	}

	public String recieve() {
		//System.out.println("WalkyTalky recieving message= "+this.message);
		return this.message;
	}

}

//create a transmitter interface. A transmitter can transmit a string. create a reciever interface. A Reciever can recieve a string(return type). code a walkytalky class which implements both Reciever and Transmitter interfaces. Create a tester class to test the working of walkytalky. use interface ref variables and point to the object and verify which methods can be called. 



