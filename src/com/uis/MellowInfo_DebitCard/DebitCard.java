package com.uis.MellowInfo_DebitCard;

import java.util.Objects;

public class DebitCard {

	private double ACCOUNT_NUM;
	private int debitCard_Num;
	private int PIN;
	private int balance;
	
	public double getAccount_Num() {
		return ACCOUNT_NUM;
	}
	
	public int getDebitCard_Num() {
		return debitCard_Num;
	}
	public int getPIN() {
		return PIN;
	}
	public void setDebitCard_Num(int debitCard_Num) {
		this.debitCard_Num = debitCard_Num;
	}
	public void setPIN(int pIN) {
		PIN = pIN;
	}

	public void withdraw(int amount) {
		if(amount>0 && amount< balance) {
			 balance-=amount;
			 System.out.println("withdraw successfull");
			 System.out.println("Remainig Balance = "+this.balance);
		}else {
			System.out.println("insufficient funds...!");
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ACCOUNT_NUM, PIN, debitCard_Num);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DebitCard other = (DebitCard) obj;
		return Double.doubleToLongBits(ACCOUNT_NUM) == Double.doubleToLongBits(other.ACCOUNT_NUM) && PIN == other.PIN
				&& debitCard_Num == other.debitCard_Num;
	}

	@Override
	public String toString() {
		return "DebitCard [ACCOUNT_NUM=" + ACCOUNT_NUM + ", debitCard_Num=" + debitCard_Num + ", PIN=" + PIN + "]";
	}

	public DebitCard(double accNum,int debitCard_Num, int pIN) {
		super();
		this.ACCOUNT_NUM=accNum;
		this.debitCard_Num = debitCard_Num;
		PIN = pIN;
		
		System.out.println("In DebitCard parameterised constructor..");
	}
	
	
	public DebitCard() {
		System.out.println("In DebitCard no arg constructor..");
	}
	
}
