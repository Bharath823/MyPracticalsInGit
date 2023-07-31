package com.uis.MellowInfo_DebitCard;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Controller 
{
	
	public static DebitCard cardLoaded()
	{
		return null;
		
	}
	
	public static List<DebitCard> addAccount(double accountnum)
	{
		File file = new File("C:\\DEBIT_CARD\\Accounts.txt");
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			
			String line;
			while((line=br.readLine()) != null)
			{
				String[] str = line.split(" ");
				
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	}
	
	public static boolean checkAccount(int accountNum,int debitNum)
	{
		File file = new File("C:\\DEBIT_CARD\\Accounts.txt");
		Map<Integer,Integer> account = new HashMap<>();
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			
			String line;
			while((line=br.readLine()) != null)
			{
				String[] str = line.split(" ");
				
				if(line != null) { account.put(Integer.parseInt(str[1]), Integer.parseInt(str[3])); }	
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		if(account.containsKey(accountNum)) {
			int value = account.get(accountNum);
			if(value==debitNum) {
				return true;
			}
		}
		
		return false;
	}
	
//	public static boolean isAcc_Exist(int accnum)
	{
		
	}
}
