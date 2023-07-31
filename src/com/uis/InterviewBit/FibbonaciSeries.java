package com.uis.InterviewBit;

public class FibbonaciSeries {

	public static void main(String[] args) {
		int num=10;
		int a=0, b=0, c=1;
		
		for(int i=0; i<num;i++)
		{
			a=b; //0,1,1,2,3
			b=c; //1,1,2,3,5,
			c=a+b; //1,2,3,5,8
			System.out.print(a+" ");
		}
	}

}
