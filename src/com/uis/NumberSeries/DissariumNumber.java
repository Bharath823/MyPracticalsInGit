package com.uis.NumberSeries;

public class DissariumNumber {

	public static void main(String[] args) {
		int num = 175;
		
		int count=0,temp;
		temp = num;
		while(temp>0) {
			count++;
			temp /=10;
		}
		System.out.println("Num of Digits in num "+num+ " is "+count);
		
		temp = num;
		int sum=0;
		while(temp>0) {
			int rem = temp % 10;
			int pow=1;
			for(int i=1; i<=count; i++) {
				pow = pow*rem;
			}
			sum +=pow;
			count--;
			temp /=10;
		}
		System.out.println("sum = "+sum);
		if(sum==num)
			System.out.println("Disarium number");
		else
			System.out.println("Not Disarium number");
	}

}
