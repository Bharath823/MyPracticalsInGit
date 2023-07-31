package com.uis.java8_features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//External loops -> normal for loop & for(int x : arr)

//Internal loops in java 8
public class ForEachMethod {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>(Arrays.asList(2,1,5,4,8,7));
		
		values.forEach(i -> System.out.print(i+" "));
	}

}
