package com.uis.Arrays_Qsn;

public class MagicNumber {

	public static void main(String[] args) {
		int num = 163, temp;
		
		temp = num;
		
		while(temp !=1)
		{
			temp = sum(temp);
		}
		if(temp==1) {
			System.out.println("Given number "+num+ " is Magic Num "+temp);
		}else {
			System.out.println("Given number "+num+ " is NOT Magic Num");
		}
	}
	
	public static int sum(int n)
	{
		int sum =0;
		while(n>0 || n>9)
		{
			sum += n%10;
			n/=10;
		}
		return sum;
	}

}
