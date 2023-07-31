package com.uis.InterviewBit;

public class AkhilChallenge {

	public static void main(String[] args) {

		String input = "PrintScannerr"; //	PrintScannerr
		
//	1st challenge		
		System.out.println(oddString(input));
		oddString2(input);
		
//	2nd challenge
		ak2("");
	}
	
	// First method
	// time complexity less compare to method 2
	// code complexity more
	public static String oddString(String str){
		if(str.length()%2==1) {
			int odd= str.length()/2;
			StringBuffer sb = new StringBuffer();
			for(int i=odd-1; i<=str.length()-odd; i++) sb.append(str.charAt(i));
			return sb.toString();
		}
		else return str;
	}
	
	// Second method
	// time complexity more
	// code complexity less
	public static void oddString2(String s) {
		char[] crr = s.toCharArray();
		
		String result = "";
		if(crr.length %2 ==1) {
			for(int i=crr.length/2-1; i<=crr.length-crr.length/2; i++) {
				result += crr[i];
			}
			System.out.println(result);
		}
		else {
			System.out.println("Even");
		}
	}
	
	public static void ak2(String s2)
	{
		if(s2.length()>2) {
		
			char[] crr = s2.toCharArray();
			for(int i=crr.length/2-1; i<=crr.length/2+1; i++) {
				System.out.print(crr[i]);
			}
		}
		else {
			System.out.println("length >2");
		}
			
	}

}
