package com.uis.MockTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Roman Number");
		String number = sc.nextLine();

		int result = Test3.convertRomanInt(number);

		if (result != -1) {
			System.out.println(number + " = " + result);
		} else {
			System.out.println("Invalid input");
		}
		sc.close();
	}

	public static int convertRomanInt(String input) {

		if (input == null) {
			return -1;
		}

		 input = input.toLowerCase();
		 
		 char[] crr = input.toCharArray();
		 for(int i=0; i<crr.length; i++)
		 {
			 char c = input.charAt(i);
			 
			if((c == 'i' || c=='v' || c=='x' || c=='l' || c=='c' || c=='d' || c=='m')) {
				continue;
			}else {
				return -1;
			}
		 }
		
		if (input.contains("i") || input.contains("v") || input.contains("x") || input.contains("l")
				|| input.contains("c") || input.contains("d") || input.contains("m")) {

			Map<Character, Integer> map = new HashMap<>();

			map.put('i', 1);
			map.put('v', 5);
			map.put('x', 10);
			map.put('l', 50);
			map.put('c', 100);
			map.put('d', 500);
			map.put('m', 1000);

			int num = 0;
			int previousValue = 0;

			for (int i = input.length() - 1; i >= 0; i--) {
				char c = input.charAt(i);
				int value = map.get(c);
//vi
				if (value < previousValue) {
					num -= value;
				} else {
					num += value;
				}

				previousValue = value;
			}

			return num;
		} else {
			return -1;
		}
		
	}
}
