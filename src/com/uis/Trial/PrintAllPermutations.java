package com.uis.Trial;

public class PrintAllPermutations {

	public static char[] swap(String input, int i1, int i2) {
		
		char[] crr = input.toCharArray();
	
		/*
		// using temp var
		char temp = crr[i1];
		crr[i1] = crr[i2];
		crr[i2] = temp;
		*/
		/*
		//using operations 
		crr[i1] =(char) (crr[i1]+crr[i2]);
		crr[i2] =(char) (crr[i1]-crr[i2]);
		crr[i1] =(char) (crr[i1]-crr[i2]);
		*/
		
		// using bitwise operator 
		crr[i1] =(char) (crr[i1]^crr[i2]);
		crr[i2] =(char) (crr[i1]^crr[i2]);
		crr[i1] =(char) (crr[i1]^crr[i2]);
		return crr;
	}
	
	public static String nTwice(String str, int n) 
	{
	  return str.substring(0,n) + str.substring(str.length()- n, str.length());
	}
	
	public static void main(String[] args) 
	{
		
		
		//WAP to read a string and return true if "good" appears starting at index 0 or 1 in the given string
/*		String s = "goodboy";
		String s1 = "good";
		int x = s1.length();
		char[] cx = s.toCharArray();
		boolean flag = false;
		for(int i=0; i<2; i++)
		{
			if(s.substring(i, i+x).equals(s1)) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("string = "+s1+ " found");
		}else {
			System.out.println("not found");
		}
*/	
		
		//WAP to New string taking SPECIFIED NUMBER OF CHARACTERS FROM FIRST AND LAST POSITION of a given string
	 
/*     String str1 =  "Welcome";
       int n1 =  3;
			  
       System.out.println("The given strings is: "+str1);
       System.out.println("The given numbers is: "+n1);
	   System.out.println("The new string is: "+nTwice(str1,n1));
*/
		
		
		//WAP to Append 2 strings; REMOVE CHARACTERS FROM THE BEGINNING OF LONGER STRING if the lengths of the string are different

/*		String s1 = "welcome";
		String s2 = "home";
		int x1 = s1.length();
		int x2 = s2.length();
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		if(x1==x2) {
			System.out.println(s1+s2);
		}else 
			if(x1>x2){
			System.out.println("omit begginning chars..");
			System.out.println(s1.substring(x1-x2,x1)+s2);
		}
		else {
			System.out.println("omit begginning chars..");
			System.out.println(s1+s2.substring(x2-x1,x2));
		}
*/	
		
		//WAP to create a new string from a given string SWAPPING THE LAST TWO CHARACTERS of the given string
/*		String input = "string";
		System.out.println(swap(input,input.length()-2,input.length()-1));
*/	
		
		//WAP to Append 2 strings such that, if the concatenation creates a DOUBLE CHARACTERS, THEN OMIT ONE OF THE CHARACTERS
		
/*		String x = "food";
		String y = "door";
		
		String res = "";
		if(x.charAt(x.length()-1)== y.charAt(0)) 
		{
			res += x.substring(0,x.length()-1)+y;
			System.out.println(res);
		}else {
			System.out.println("No double char found");
		}
*/
		//WAP to check if 2 STRINGS ARE ROTATIONS of each other

		//method 1
/*		String s1 = "ABACD";
		String s2 = "CDABA";
		String conct = s1+s1;
		int i = conct.indexOf(s2);
		int j = i+(s2.length()-1);
		String x = conct.substring(i, j+1);
		System.out.println(x);
		if(s2.equals(x)) {
			System.out.println("found");
		}else
			System.out.println("not found");
*/	
		//method 2
/*		String s1 = "ABACD";
		String check = "CDABA";
		int chlen = check.length();
		boolean flag = false;
		String conct = s1+s1;
		for(int i=0; i<conct.length(); i++) {
			if(conct.substring(i,i+chlen).equals(check)) {
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println("String "+check+ " found..");
		else {
			System.out.println("Not found");
		}
*/
		
		//WAP to COUNT & PRINT ALL DUPLICATE CHARACTERS in a String
		
/*		String input = "abrambabasc";
		char[] cx = input.toCharArray();
		int count=0;
		boolean flag = false;
		Map<String,Integer> m = new TreeMap<String,Integer>();
		
		for(int i=0; i<cx.length; i++) {
			for(int j=0; j<cx.length; j++)
			{
				if(cx[i] == cx[j] && i!=j) {
					flag=true;
					count++;
				}
				m.put(cx[i]+"", count);
			}
			flag= false;
			count=0;
		}
		System.out.println(m);
*/
		
/*		
		// WAP to REMOVE specific char from a given string 
		//output = aramaasc
		String x = "abrambabasc";
		String emp = "";
		char[] cx = x.toCharArray();
		char remove = 'b';
		for(int i=0; i<cx.length; i++) {
			if(!(cx[i]==remove)) {
				emp += cx[i];
			}
		}
		System.out.println(emp);
*/
		
		//Reverse every word in a String
		
/*		String s = "RCB IS THE RED ARMY";
		String[] srr = s.split(" ");
		StringBuilder sb = new StringBuilder("");
		for(String x : srr)
		{
			char[] crr = x.toCharArray();
			for(int i=crr.length-1; i>=0; i--) {
				sb.append(crr[i]);
			}
			sb.append(" ");
		}
		System.out.println(sb.toString());
		
*/
		
		//Reverse characters in a String
/*		String s = "BHARATH";
		char[] crr = s.toCharArray();
		String empty = "";
		for(int i=crr.length-1; i>=0; i--) {
			empty += crr[i];
		}
		System.out.println(empty);
*/
		
		// swap 2 characters of string 
	/*	String s1 = "bharathi";
		System.out.println(swap(s1, 0, s1.length()-1));
		
	*/
		
		// find maximum occurring character in a string
	/*	String input = "test string";
		
		int max = 0;
		char mch = '0';
		char[] crr = input.toCharArray();
		
		for(int i=0; i<crr.length; i++)
		{
			int count = 0;
			for(int j=i+1; j<crr.length; j++)
			{
				if(crr[i] == crr[j]) {
					count++;
				}
			}
			if(count >0 && max < count) {
				mch = crr[i];
				max = count;
			}
			
		}
		System.out.println("Maximu occuring char : "+mch);
	*/	
		
		
	/*	
		// removig duplicate characters
		  String str1 = "the quick brown fox";
		  String str2 = "queen";
		  System.out.println("The given string is: " + str1);
		  System.out.println("The given mask string is: " + str2);
		  
		  char arr[] = new char[str1.length()];
		  char[] mask = new char[256];
	 
		  for (int i = 0; i < str2.length(); i++)
		  {
			  mask[str2.charAt(i)]++;
		  }
		  System.out.println("\nThe new string is: ");
	  
		  for (int i = 0; i < str1.length(); i++) 
		  {
			  if (mask[str1.charAt(i)] == 0)
				  System.out.print(str1.charAt(i));
		  }
		  
//		  for(char c : mask) {
//			  System.out.print(c);
//		  }
		 
	*/

		
		// divide string n equal parts
/*		String input = "abcddeff";
			int divider = 2;
			StringBuilder sb = new StringBuilder("");
			
			if(input.length() %divider==0)
			{
				for(int i=0; i<input.length(); i+=divider)
				{
					sb.append(input.substring(i, i+divider)+" ");
				}
				System.out.println(sb.toString());
			}else {
				System.out.println("not possible");
			}
			
	*/
		
		
/*		//find first non-repeating character
		String duplicates = "xxxxxxxgggggggggmmckkkxx";
		char[] crr = duplicates.toCharArray();
		String empty = "";
		boolean flag = true;
		for(int i=0; i<crr.length; i++)
		{
			for(int j=0; j<crr.length; j++)//abacdcb
			{
				if(crr[i]==crr[j] && i!=j)
				{
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println("First non-repeating char is : "+empty+crr[i]);
				break;
			}
			flag = true;
		}
		
	*/
		
/*		
		String duplicates = "xxxxxxxgggggggggmmckkkxx";
		
		char[] crr = duplicates.toCharArray();
		int index=0;
		for(int i=0; i<crr.length; i++)
		{
			int j;
			for(j=0; j<i; j++)
			{
				if(crr[i]==crr[j]) {
					break;
				}
			}
			if(i==j)
			{
				crr[index++]= crr[i];
			}
		}
		System.out.println(String.valueOf(Arrays.copyOf(crr, index)));
		System.out.println(index);
		
*/
		
/*	
	  String input = "xxxxxxxgggggggggmmckkkxx";
	 
		
		StringBuilder sb = new StringBuilder();
		char[] crr = input.toCharArray();
		int count = 0;
		
		for(int i=0; i<crr.length; i++)
		{
			 for(int j=i;j<crr.length;j++)
			{
				if(crr[i]==crr[j]) {
					count++;
				}
				else
					break;
			}
			if(count>0) {
				//System.out.println(crr[i]+" : "+count);
				sb.append(crr[i]+""+count+",");
				i= i+count-1;		
			}
			count = 0;
		}
		System.out.println(sb);
*/	
	}

}
