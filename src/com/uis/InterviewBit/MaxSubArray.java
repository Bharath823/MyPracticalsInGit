package com.uis.InterviewBit;

public class MaxSubArray {

	public static void main(String[] args) {
		int[] a = {-2,-3,4,-1,-2,1,5,-3};
		System.out.println(maxSubArraySum(a));
		
		String b = " hello world ";
		System.out.println(solve(b));
	}
	
	 public static String solve(String A) {
	        
	        if(A==null){
	            return A;
	        }
	        A = A.trim();
	        String[] arr = A.split(" ");
	        StringBuffer ab = new StringBuffer();
	        for(int i=arr.length-1; i>=0; i--)
	        {
	            ab.append(arr[i]+" ");
	        }
	        return ab.toString();
	    }
	
	public static int maxSubArraySum(int[] ar)
	{
		int max= Integer.MIN_VALUE;
		int min= 0;
		
		for(int i=0; i<ar.length; i++)
		{
			min = min+ar[i];
			if(max <min) {
				max=min;
			}
			if(min <0) {
				min = 0;
			}
		}
		return max;
	}

}
