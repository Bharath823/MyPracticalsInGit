package com.uis.InterviewBit;

import java.util.Scanner;

public class AddBinaryStrings {
	public static String add(String a, String b) {
		String ans = "";
        
        if(a.equals("0") && b.equals("0")) return "0";
        
        int i = a.length() -1;
        int j = b.length() -1;
        
        int ca = 0;
        
        while(i >=0 || j>=0 || ca >0) {
            
            int d1 = (i >= 0) ? (a.charAt(i) - '0') : 0;
            int d2 = (j >= 0) ? (b.charAt(j) - '0') : 0;
            
            int digit = 0;
            if(d1 + d2 + ca >= 2) {
                digit = (d1 + d2 + ca) % 2;
                ca = (d1 + d2 + ca) / 2;
            } else {
                digit = d1 + d2 + ca;
                ca = 0;
            }
            
            i--;
            j--;
            ans  = digit + ans;
        }
        
        return ans;
	}

	public static void main(String args[]) {
		// Your code goes here
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String 1");
		String a = scn.nextLine();
		
		System.out.println("Enter String 2");
		String b = scn.nextLine();
		scn.close();

		System.out.println("The sum is: " + add(a,b));  
	}
}
