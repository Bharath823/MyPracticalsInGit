package com.uis.MellowInfo;

import java.util.ArrayList;
import java.util.List;

public class FindGapBWElements {

	public static void main(String[] args)
	{
		// method 1
		int[] arr=  {4,-3,-7,1}; //{-3,-1,2,4,5,9};
		
		for(int i=0; i<arr.length; i++){
			for(int j=(i+1); j<arr.length; j++){
				if(arr[i]>arr[j]) {
					arr[i] = arr[i] ^ arr[j];
					arr[j] = arr[i] ^ arr[j];
					arr[i] = arr[i] ^ arr[j];
				}
			}
		}
		
		int count=0;
		int ele = arr[0];
		ele +=1;
		// -3,-1,2,4,5,9
		for(int i=1; i<arr.length;)// -1  el=0  -2  count=2
		{
			if(arr[i]!=ele)
			{
				count++;
				ele +=1;
				continue;
			}
			ele +=1;
			i++;
		}	
		System.out.println("gap elements = "+count+"\n");
		
		
		// method 2
		int[] arr2=  {4,-3,-7,1};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int cou=0;
		
		//Arrays.sort(arr2);
//		for(int x : arr2) {
//			System.out.print(x+" ");
//		}
		
		for(int i=0; i<arr2.length; i++)
		{
			if(arr2[i]> max) {
				max=arr2[i];
			}
			else if(arr2[i]<min) {
				min=arr2[i];
			}
		}
		System.out.println("min="+min+" max="+max);
		for(int i=min+1; i<max; i++)
		{
			cou++;
		}
		System.out.println("gap elements= "+cou);
		
		//remove duplicats
		int[] arr3 = {2,3,1,2,4,3,5,7,8,7};
		
		List l1 = new ArrayList();
		List l2 = new ArrayList();
		
		for(int i=0; i<arr3.length; i++)
		{
			if(!l1.contains(arr3[i])) {
				l1.add(arr3[i]);
			}
			else {
				l2.add(arr3[i]);
			}
		}
		System.out.println("l1 = "+l1);
		System.out.println("l2 = "+l2);
		
		l1.removeAll(l2);
		System.out.println("after removing dup l1="+l1);
		
		
	}
}
