package com.tnsif.dayeight.interfaces.implementinginterfaces;

public class Account {
	 private int accNo;
	 private String name;
	 private double balance;
	 private Bank bank;
	public Account(int i, String string, int j, Bank bank2) {
		// TODO Auto-generated constructor stub
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	@Override
	 public String toString() {
	     return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	 }
	public void withdraw(int i) {
		// TODO Auto-generated method stub
		
	}
	public void deposit(int i) {
		// TODO Auto-generated method stub
		
	}
}
