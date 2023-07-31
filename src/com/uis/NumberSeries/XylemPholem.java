package com.uis.NumberSeries;

public class XylemPholem {

	public static void main(String[] args) {
		int num = 12348;
		int firstDigit,lastDigit,sumOfExtreme=0,sumOfMean=0;
		
		int temp = num;
		lastDigit = temp%10;
		temp/=10;
		
		int sum =0;
		while(temp>0)
		{
			int rem = temp%10;
			temp/=10;
			sum = (sum*10)+rem;
		}
		firstDigit = sum%10;
		sum/=10;
		
		sumOfExtreme=lastDigit+firstDigit;
		
		while(sum>0)
		{
			int rem2=sum%10;
			sumOfMean += rem2; 
			sum /=10;
		}
		System.out.println("sumOfExtreme = "+sumOfExtreme);
		System.out.println("sumOfMean = "+sumOfMean);
		
		if(sumOfMean==sumOfExtreme) {
			System.out.println("Xylem Number...");
		}else
			System.out.println("Not Xylem Number");
	}

}
