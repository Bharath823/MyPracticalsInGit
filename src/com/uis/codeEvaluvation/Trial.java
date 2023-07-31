package com.uis.codeEvaluvation;

import java.util.Arrays;

public class Trial {

	public static void main(String[] args) {
	//	1. fibbonacci(10);
		
// 2. one of the first 4 elements in 9 return true else return false
		//elementis9(new int[]{1,2,3,4,5}); //1,2,9,3,4
		
//	3. return true if array contains, somewhere three increasing numbers like.. 4,5,6,...
		//increasingNum(new int[]{1,2,3,4,6,2});
		
//  4. return true if given string contains 1 or 3 'e' chars otherwise return false
		//containsEchar("ccc",'c');	
	
//  5. given a string & int n, 
			//return a string made of the first & last n chars from the string		
		//stringMadeByNchar("bharath", 3);
		
//	6. given 2 int values,return whichever near to the 10, or return 0 if tie,
		//nearestValue(-20, -30);
		
//	7. given two string find matches the char 
		//findMatch("Bhari", "shai");
		
//	8. Average of an int array except smallest and largest value
		//averageOfArray(new int[]{1,3,3,4,5});
		
//	9. Given a array of ints, return true if their is a 1 in the array with a 2 somewhere later in the array
		//has12(new int[]{1,3,3,4,5,2});

//	10. return new array it contains exact same size but rearrange the even number first before odd numbers
		//alterArray(new int[]{1,2,3,4,5,6,7,8,9,10});
		
//	11. 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 any where in the array
		//unlucky1(new int[] {1, 3, 4, 5});
		
//	12.	
		//rearrangeArray0(new int[] {1,0,0,1});
		
//	13. Not implemented...
		
//	14. Given a string,return a string made of the chars at indexes 0,1,4,5,8,9... so "kittens" yields "kien".
	 	// i/p-> kittens o/p->kien
		//stringMadeByParticularChars("kittens");
		
//	15. swap last two characters in string
		//swapLastChar("string");
		
//	16. return sum of array elements except 6 followed by 7
		//sumOfElementsExcept67(new int[] {1,2,3,4,5,6,7,8});
		
//	17. given 2 int values, return true if they are both in the range 30..40 inclusive,
		//in3050(30, 40);
		
//	18. Given array of ints,swap the first and last elements in the array
		//swap1st_lastElement(new int[] {1,2,3,4,5,6,7,8});
	
//	19. Count the number of "xx" in the given string. we'll say that overlapping is allowed, so "xxx" contains 2 "xx".
		//countXX("xxx");
		
//	20. Given non-negative number n where(n>0), create and return a new string array of length n
		convertDigitString(123);
		
	}
	

	
//	1. fibbonacci(10);	
	public static void fibbonacci(int num)
	{
		int a=0;
		int b=0;
		int c=1;
		for(int i=0; i<=num; i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
		}
	}

// 2. one of the first 4 elements in 9 return true else return false
	public static void elementis9(int[] arr)
	{
		boolean flag= false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==9 && i<=3) {
				System.out.println(arr[i]);
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
//3	return true if array contains, somewhere three increasing numbers like.. 4,5,6,...
	public static void increasingNum(int[] arr)	//1,3,2,4,5,6
	{
		boolean flag = false;
		
		for(int i=0; i<arr.length-2; i++)
		{
			if(arr[i]+1==arr[i+1] && arr[i+1]+1 == arr[i+2]) {
				flag = true;
			}
		}
		if(flag) {
			System.out.println("The array contains three increasing numbers.");
		}
		else {
			System.out.println("The array does not contains three increasing numbers.");
		}
	}
	
// 4 string contains char c is either equal 1 or 3	
	 	public static void containsEchar(String x, char cr) {
		int count=0;
		char[] c = x.toCharArray();
		for(int i=0; i<c.length; i++) {
			if(c[i]==cr) count++; ;
		}
		if(count==1 || count==3) System.out.println("true");
		else System.out.println("false");
	}
// 5 return a string made of the first & last n chars from the string	
	 	public static void stringMadeByNchar(String s, int n) {
	 		if(s.length()>n) {
	 			String result = s.substring(0, n)+s.substring(s.length()-n,s.length());
	 			System.out.println(result);
	 		}
	 	}
	 	
// 6. given 2 int values,return whichever near to the 10, or return 0 if tie, 
	 	//note math.abs(v) return absolute value of a number
	 	public static void nearestValue(int x, int y) {
	 		int r1 = 10-x, r2= 10-y;
	 		
	 		System.out.println("x="+x +" y="+y);
	 		
	 		if(r1<r2) {
	 			System.out.println("x is nearest value to 10 ->" + x);
	 		}
	 		else if(r1>r2){
	 			System.out.println("y is nearest value to 10 ->"+y);
	 		}else {
	 			System.out.println("x & y nearest value to 10");
	 		}
	 	}
	 	
// 7. given two string find matches the char 
	 	public static void findMatch(String s1, String s2) 
	 	{
	 		String result = ""+s2.charAt(0);
	 		for(int i=1; i<s1.length(); i++) {
	 			if(s1.charAt(i)==s2.charAt(i)) {
	 				result += s1.charAt(i);
	 				continue;
	 			}
	 			break;
	 		}
	 		System.out.println("s1="+s1+"  s2="+s2);
	 		System.out.println(result);
	 	}
	 	
//	8. Average of an int array except smallest and largest value
	 	static void averageOfArray(int[] arr){
	 		Arrays.sort(arr);
	 		int sum=0, average=0;
	 		for(int i=1; i<arr.length-1; i++) {
	 			sum += arr[i];
	 		}
	 		average = sum/arr.length;
	 		System.out.println("average = "+average);
	 	}
	 	
//	9.  Given a array of ints, return true if their is a 1 in the array with a 2 somewhere later in the array
	 	public static void has12(int[] nums)
	 	{
	 		 boolean flag1=false,flag2=false;
	 
	 		 for(int x: nums){
	 		   if(x==1){
	 		     flag1= true;
	 		   }
	 		   if(x==2){
	 		      flag2=true;
	 		   }
	 		 }
	 		 
	 		 if(flag1 && flag2){
	 		   System.out.println("true");
	 		 }else
	 			System.out.println("false");
	 		}
//	10. return new array it contains exact same size but rearrange the even number first before odd numbers
	 
	 	static void alterArray(int[] arr)
	 	{
	 		for(int i=0; i<arr.length; i++)
	 		{
	 			for(int j=(i); j<arr.length; j++)
	 			{
	 				if(arr[j]%2==0) {
		 				int temp = arr[j];
		 				arr[j]=arr[i];
		 				arr[i] = temp;
		 			}
	 			}
	 		}
	 		System.out.println(Arrays.toString(arr));
	 	}
	 	
//	11. we'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 any where in the array	
	 	
	 	public static void unlucky1(int[] nums) {
	 		boolean flag1= false;
	 		for(int i=0; i<nums.length-1; i++)
	 		{
	 		  if(nums[i]==1 && nums[i+1]==3){ 
	 			 flag1 = true;
	 		  }
	 		}
	 		if(flag1) {
	 			System.out.println("true");
	 		}else {
	 			System.out.println("false");
	 		}
	 	}	
//	12. Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 elements to 0. Return the 
//		changed array.Otherwise returned the same array.	 		

	 	public static void rearrangeArray0(int[] arr) {
	 		for(int i=0; i<arr.length-1; i++) //1,0,0,1
	 		{
	 			if(arr[i] !=0) {
	 				int temp = arr[i];
	 				arr[i] = arr[i+1];
	 				arr[i+1] = temp;
	 			}
	 		}
	 		System.out.println(Arrays.toString(arr));//0,0,1,1
	 	}
	 	
//	13. given array of ints,return true if the array contains a 2 next to a 2 or a 4 next to a 4,but not both
	 
	 	
//	14. Given a string,return a string made of the chars at indexes 0,1,4,5,8,9... so "kittens" yields "kien".
	 	// i/p-> kittens o/p->kien
	 	static void stringMadeByParticularChars(String str)
	 	{
	 		String result = "";

	 		for (int i = 0; i < str.length(); i+=4) {
	 		    if (i < str.length() - 1)
	 		        result += str.substring(i, i+2);
	 		    else
	 		        result += str.substring(i, i+1);
	 		}
	 		System.out.println(result);
	 	}
	 	
//	15. swap last two characters in string	 	
	 	public static void swapLastChar(String s)
	 	{
	 		s = s.substring(0, s.length()-2)+s.charAt(s.length()-1)+s.charAt(s.length()-2);
	 		System.out.println(s);
	 	}
	 	
//	16. return sum of array elements except 6 followed by 7
	 	public static void sumOfElementsExcept67(int[] arr)
	 	{
	 		int sum = 0;
	 		for(int i=0; i<arr.length-1; i++)
	 		{
	 			if(!(arr[i]==6 && arr[i+1]==7)) 
	 			{
	 				sum += arr[i];
	 			}
	 		}
	 		System.out.println("sum = "+sum);
	 	}
	 	
//	17. given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the
	 	//range 40..50 inclusive.
	 	public static void in3050(int a, int b) {
	 		  if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
	 		    System.out.println("true");
	 		  }
	 		  if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
	 		    System.out.println("true");
	 		  }
	 	}

//	18. Given array of ints,swap the first and last elements in the array	
	 	public static void swap1st_lastElement(int[] arr) {
	 		int x = arr[0];
	 		arr[0] = arr[arr.length-1];
	 		arr[arr.length-1] = x;
	 		System.out.println(Arrays.toString(arr));
	 	}
	 		
//	 19. Count the number of "xx" in the given string. we'll say that overlapping is allowed, so "xxx" contains 2 "xx".
	 	public static void countXX(String s)
	 	{
	 		int count = 0;
	 		char[] crr = s.toCharArray();
	 		for(int i=0; i<s.length()-1; i++) {
	 			if(crr[i]=='x'&& crr[i+1]=='x') {
	 				count++;
	 			}
	 		}
	 		System.out.println("xx occur "+count+" times.");
 		}
//	20. Given non-negative number n where(n>0), create and return a new string array of length n
	 	public static void convertDigitString(int num) 
	 	{
	 		
	 		int temp = num, reverse=0;
	 		while(temp>0) {
	 			int rem = temp % 10;
	 			temp /= 10;
	 			reverse = reverse*10 + rem;
	 		}
	 		System.out.println("After reversing number = "+reverse);
	 		
	 		int len = String.valueOf(reverse).length();
	 		String[] array = new String[len];
	 		
	 		for(int i=0; i<len; i++) 
	 		{
	 			int x = reverse%10;
	 			reverse /= 10;
	 			array[i] = String.valueOf(x);
	 		}
	 		System.out.println("String[] array= "+Arrays.toString(array));
	 	}

}
