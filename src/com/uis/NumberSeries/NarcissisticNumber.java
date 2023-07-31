package com.uis.NumberSeries;

public class NarcissisticNumber {

	public static void main(String[] args) {
		int num = 153;
		
		int count=0,temp;
		temp = num;
		while(temp>0) {
			count++;
			temp /=10;
		}
		System.out.println("Num of Digits in num "+num+ " is "+count);
		
		temp=num;
		int sum = 0;
		while(temp >0) {
			int rem = temp % 10;
			
			int total=0;
//			for(int i=1; i<=count; i++) {
//				total = total+(rem * rem * rem);
//			}
			total = (int)Math.pow(rem, count);
			sum = sum + total;
			temp /= 10;
		}
		System.out.println("sum="+sum);
		if(sum==num) {
			System.out.println("NarcissisticNumber");
		}else
			System.out.println("Not NarcissisticNumber");
	}

}
