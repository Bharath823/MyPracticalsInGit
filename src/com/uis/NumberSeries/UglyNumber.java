package com.uis.NumberSeries;

class UglyNumber {

	public static void main(String[] args) {
		int x = 15;
		int y = x;
		while(y>1) {
			y = (y%2==0)? (y/2):(y%3==0)?(y/3):(y%5==0)?(y/5):(-1);
		}
		if(y!=-1)
			System.out.println(x+ " Ugly Number");
		else
			System.out.println(x+ " Not Ugly Number");
	}

}
