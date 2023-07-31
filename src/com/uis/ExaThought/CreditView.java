package com.uis.ExaThought;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CreditView {

	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		List<String> list = new ArrayList();
		list.add("Big Basket");
		list.add("Big Cinema");
		list.add("Bose");
		
		Map<String,Integer> map = new LinkedHashMap<>();
		map.put("Bag", 1000);
		map.put("Mobile", 11000);
		map.put("FoodKit", 5000);
		map.put("LapTop", 25000);
		
		int credit_Num = 0, amount=0;
		String item= null, vendor= null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter Credit Card Number(like mob_no->9875423221 )");
		credit_Num = sc1.nextInt();
		
		if(Util.checkCredit(credit_Num)) 
		{
			
		}
		
		System.out.println("\n"+list+"\n");
		System.out.println("Enter Vendor here you buy from above list");
		vendor = sc2.nextLine();
		
		
		System.out.println(map+"\n"+"Pay amount which one you want to buy from above..");
		amount = sc1.nextInt();
		
		Calendar calendar = Calendar.getInstance();
		Date d = calendar.getTime();
		String date = sdf.format(d);
		//System.out.println(date);
		
		System.out.println("mobile # ="+credit_Num+" Vendor ="+vendor+" Date ="
				+ ""+date+" Amount="+amount+" Status="+Status.SUCCESS);
		
		sc1.close();
		sc2.close();
	}

}
