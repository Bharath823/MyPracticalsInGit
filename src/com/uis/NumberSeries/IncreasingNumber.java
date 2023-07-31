package com.uis.NumberSeries;

public class IncreasingNumber {

	public static void main(String[] args) {
		int num = 321,temp;
		temp = num;
		
		boolean b= true;
		while(temp>9||temp<-9)
		{
			int rem1 = temp%10;
			temp/=10;
			if(temp%10<rem1) {
				b=true;
				continue;
			}else {
				b=false;
				break;
			}
		}
		if(b) {
			System.out.println("Increasing number");
		}else
			System.out.println("Not Increasing number");
	}

}
