package com.uis.codeEvaluvation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public interface MaxValAcross2Arrays {
	public static void main(String[] args) {
	//	int[] a1 = {2,5,7,4,8,3,7,3};
	//	int[] a2 = {1,2,2,9,3,6,1,22};
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.addAll(Arrays.asList(2,5,7,4,8,3,7));
		
		List<Integer> l2 = new ArrayList<Integer>();
		l2.addAll(Arrays.asList(10,2,2,9,3,6,1,22));
		
		Optional<Integer> max1 = l1.stream().max((i1,i2)->i1.compareTo(i2));
		Optional<Integer> max2 = l2.stream().max((i1,i2)->i1.compareTo(i2));
		//Optional<Integer> max2 = l2.stream().max((i1,i2)->i1.compareTo(i2));
		
		int maxValue1 = max1.orElse(Integer.MIN_VALUE);
		int maxValue2 = max2.orElse(Integer.MIN_VALUE);
		
		if(maxValue1 > maxValue2)
			System.out.println("maxvalue = "+maxValue1);
		else 
			System.out.println("maxvalue = "+maxValue2);
	}
}
