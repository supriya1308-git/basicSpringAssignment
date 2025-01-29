package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component
public class SBI implements Bank {

	private double amount;
	
	@Override
	public double getAmount() {
		
		return amount;
	}

	@Override
	public void setAmount(double amount) {
		this.amount=amount;

	}

	@Override
	public String deposit(double amount) {
       
       this.amount+=amount;
		return "In SBI bank amount:"+amount+" has bean debited";
	}

	@Override
	public String withdraw(double amount) {
         if(this.amount>=amount)
         {
        	 this.amount-=amount;
		return "In SBI bank amount:"+amount+" has bean creadted";
         }
         return "Insufficient balance ";
	}

	@Override
	public String toString() {
		return "SBI amount=" + amount ;
	}

}
