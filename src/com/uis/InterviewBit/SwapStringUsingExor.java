package com.uis.InterviewBit;

public class SwapStringUsingExor {

	public static void main(String[] args) {
		//swapString("ABharat", "BIndiaa");
		
		isDissarium(135);
		
/*		StringBuffer sb = new StringBuffer("BHARATH");
		System.out.println(sb.capacity());
		//sb.append("nnnnnnnnnnnnnnnnj");
	//	System.out.println(sb.delete(0,1));
		System.out.println(sb.replace(1, 6, "JAI"));
		System.out.println(sb);
		//System.out.println(sb.capacity());
		 
*/
	}
	
	public static void swapString(String s1, String s2)
	{
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		for(int i=0; i<c1.length; i++)
		{
			c1[i] = (char)(c1[i] ^ c2[i]);
			c2[i] = (char)(c1[i] ^ c2[i]);
			c1[i] = (char)(c1[i] ^ c2[i]);
		}
		
		s1= new String(c1);
		s2= new String(c2);
		System.out.println("s1= "+s1+", s2= "+s2);
	}

	static void isDissarium(int num)
	{
		System.out.println("original num= "+num);
		if(isPow(num)==num)
			System.out.println("true");
		else
			System.out.println("false");
	}
	
	static int isPow(int x)
	{
		int result = 0;
		
		int len = String.valueOf(x).length();
		System.out.println("len of Number= "+len);
		while(x>0) //135
		{
			int pow =1;
			int rem = x % 10;
			x /= 10;
			for(int i=0; i<len; i++) {
				pow = pow * rem;
			}
			result += pow;
			len--;
		}
		System.out.println("sum = "+result);
		return result;
	}
}
