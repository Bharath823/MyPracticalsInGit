package com.uis.InterviewBit;

public class SwapTwoStringVariables {

	public static void main(String[] args) {
		String s1 = "JAVA";
		String s2 = "J2EE";
		
		s1 = s1+s2; // JAVAJ2EE
		s2 = s1.substring(0,s1.length()-s2.length());
	//	s1 = s1.substring(s1.length()-s2.length(),s1.length());
		s1 = s1.substring(s2.length());
		
		System.out.println("s1="+s1+ " ,,, s2="+s2);
	}

}
