package com.uis.NumberSeries;

public class TestPronicNum {

	public static void main(String[] args)
	{
		int num = 42;
		boolean flag = false;
		for(int i=0; i<=num; i++)
		{
			int x = i*(i+1);
			
			if(num==x) {
				flag = true;
				break;
			}
		}
		if(flag==true)
		System.out.println("Pronic");
		else
			System.out.println("Not pronic");
		
		
	}

}
