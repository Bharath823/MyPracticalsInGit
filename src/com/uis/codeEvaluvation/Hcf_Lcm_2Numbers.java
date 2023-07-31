package com.uis.codeEvaluvation;

public class Hcf_Lcm_2Numbers {

	public static void main(String[] args) 
	{
		//HCf
		int x = 18, y=48;
		//hcf(x, y);
		lcm(x, y);
	}
	
	public static void hcf(int num1, int num2)
	{
		int low = (num1 < num2) ? num1 : num2;
		
		for(int i=low/2; i>=1; i--) {
			if(num1%i==0 && num2%i==0) {
				System.out.println("Hcf is "+i);
				break;
			}
		}
	}
	
	public static void lcm(int num1, int num2)
	{
		int max = (num1 > num2) ? num1 : num2;
		
		for(int i=max; i<num1*num2/2; i++) {
			if(i%num1==0 && i%num2==0) {
				System.out.println("Lcm is "+i);
				break;
			}
		}
	}

}
// write a method print the series from a given begin value and ends with 15(ascending order)