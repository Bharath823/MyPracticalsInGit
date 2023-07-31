package com.uis.codeEvaluvation;

public class TestParraot {

	public static void main(String[] args) {
		Parrot p = new Parrot();
		p.parrotTrouble(3);
		p.parrotTrouble(7);
	}

}

class Parrot
{
	public void parrotTrouble(int time) {
		if(time >=0 && time<24) {
			if(time<7 || time>20)
			{
				System.out.println("parrotTrouble -> True ,"+" Time = "+time);	
			}else {
				System.out.println("parrotTrouble -> false "+" Time = "+time);	
			}
		}
		else {
			System.out.println("Invalid Time");
		}
	}
}
