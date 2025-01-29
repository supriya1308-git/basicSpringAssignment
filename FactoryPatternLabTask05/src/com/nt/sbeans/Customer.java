package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Customer
{
	private int custId;
	private String custname;
	private Bank bank;
	@Autowired
	BankFactory bfactory;
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public void setBank(String banktype) {
		this.bank = bfactory.createBank(banktype);
	}
	
	public void deposit(double amount)
	{
		bank.deposit(amount);
	}
	public void withdraw(double amount)
	{
		bank.withdraw(amount);
	}
	public void displayDetails()
	{
		System.out.println("CustomerId:"+custId);
		System.out.println("Customer Name:"+custname);
		System.out.println("Bank Details:"+bank);
	}
	
	

}
