package com.uis.InterviewBit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DiffOfTwoDates {

	public static void main(String[] args) {
		String s1 = "18-03-2022/12:26:26"; // dd-MM-yyyy/HH:mm:ss 
		String s2 = "18-03-2023/13:28:29"; // dd-MM-yyyy/HH:mm:ss
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy/HH:mm:ss");
		
		try {
			Date startDate = sdf.parse(s1);
			Date endDate = sdf.parse(s2);
			
			long diffInmilliseconds = endDate.getTime()-startDate.getTime();
			long seconds = (diffInmilliseconds/1000) % 60;
			long minutes = (diffInmilliseconds/ (1000 *60)) % 60;
			long hours = (diffInmilliseconds/ (1000 * 60 * 60)) % 60;
			long days = (diffInmilliseconds/ (1000 * 60 * 60 * 24)) % 365;
			long years = (diffInmilliseconds/ (1000l * 60 * 60 * 24 * 365));
			
			System.out.println("startDate.getTime()="+startDate.getTime()+", endDate.getTime()="+endDate.getTime());
			
			System.out.println("diffInmilliseconds = "+diffInmilliseconds);
			
			System.out.println(years+" years, "+days+" days, "+hours+" hours, "+minutes+" minutes, "+seconds+" seconds");
		} 
		catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
