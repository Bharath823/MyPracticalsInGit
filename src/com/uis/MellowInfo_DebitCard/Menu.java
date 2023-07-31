package com.uis.MellowInfo_DebitCard;

import java.util.Scanner;

public class Menu 
{

	public static void showMenu()
	{
		Scanner sc1 = new Scanner(System.in); // for numeric inputs
		Scanner sc2 = new Scanner(System.in); // for String inputs
		
		int amount=0;
		
		int choice = -1;
		
		System.out.println("Create an Account after you get DebitCard Number"+"\n");
		
		System.out.println("Enter Account Number");
		int accountNum = sc1.nextInt();
		
		System.out.println("Enter the amount to deposit amount > 5000");
		amount= sc1.nextInt();
		
		System.out.println("Enter DebitCard Number");
		int debit_Num = sc1.nextInt();
		
		
		while(!Controller.checkAccount(accountNum,debit_Num))
		{
			System.out.println("Account number and Debit Number Mismatch, Enter valid ACCOUNT NUM & DEBIT NUM");
			
			System.out.println("Enter Account Number");
			accountNum = sc1.nextInt();
			
			System.out.println("Enter DebitCard Number");
			debit_Num = sc1.nextInt();
		}
		
		
		
		while(choice != 4)
		{
			
			System.out.println("Press 1 Withdraw Money");
			System.out.println("Press 2 Card to Card Transfer");
			System.out.println("Press 3 Card to Fund Transfer");
			System.out.println("Press 4 Card to EXIT");
			
			choice = sc1.nextInt();
			
			
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter the Amount to Withdraw");
				amount = sc1.nextInt();
				
				
				
				break;
				
			case 2:
				break;
				
			case 3:
				break;
				
			case 4:
				sc1.close();
				sc2.close();
				
				break;
			}
		}
	}
}
