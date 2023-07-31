package com.uis.NumberSeries;

public class HappyNumber {

	public static void main(String[] args) {
		int num =18;
		
		int temp=num;
		while(temp !=1 && temp !=4) {
			temp= HappyNumber.checkhappyNum(temp);
		}
		if(temp==1)
			System.out.println("Happy Number");
		else
			if(temp==4)
			System.out.println("Not Happy Number");
	}
	public static int checkhappyNum(int num1)
	{
		int sum =0,rem,temp;
		temp = num1;
		while(temp>0)
		{
			rem = temp%10;
			sum = sum+(rem*rem);
			temp /=10;
		}
		return sum;
	}

}
