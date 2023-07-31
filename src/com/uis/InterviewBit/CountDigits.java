package com.uis.InterviewBit;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		sc.close();
		
		if(num==0) { System.out.println("num of digits = "+num); 
		System.exit(0);
		}
		
		else if(num<0) {
			num = -num;
		}
		
		int digits=0;
		while(num != 0)
		{
			num /= 10;
			digits++;
		}
		
		System.out.println("num of digits = "+digits);
	}

}
