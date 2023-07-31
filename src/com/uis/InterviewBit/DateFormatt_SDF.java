package com.uis.InterviewBit;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatt_SDF {

	public static void main(String[] args)
	{
		Date today = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		System.out.println("pattern 1 (dd/MM/yy)->"+sdf.format(today));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd MMMM yyyy");
		System.out.println("pattern 2 (dd MMMM yyyy)->"+sdf1.format(today));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("pattern 3 (yyyy-MM-dd)->"+sdf2.format(today));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd MMMM yyyy");
		System.out.println("pattern 4 (dd MMMM yyyy)->"+sdf3.format(today));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("dd MMM yyyy");
		System.out.println("pattern 5 (dd MMM yyyy)->"+sdf4.format(today));
		
		SimpleDateFormat sdf5 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		System.out.println("pattern 6 (dd-MMM-yyyy HH:mm:ss)->"+sdf5.format(today));
		
		SimpleDateFormat sdf6 = new SimpleDateFormat("EEEE, MMM dd yyyy, hh:mm:ss a");
		System.out.println("pattern 7 (EEEE, MMM dd yyyy, hh:mm:ss a)" +sdf6.format(today));
	}

}
