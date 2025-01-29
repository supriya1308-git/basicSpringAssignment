package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConcreteBankFactory implements BankFactory
{
	@Autowired
    SBI sbi;
	@Autowired
    HDFC hdfc;
	@Override
	public Bank createBank(String type) {
		 if(type.equalsIgnoreCase("sbi"))
    	 {
    		 return new SBI();
    	 }
    	 else if(type.equalsIgnoreCase("hdfc"))
    	 {
    		 return new HDFC();
    	 }
    	 else
    	 {
    		 throw new IllegalArgumentException("Invalid Bank Name Plz Give Valid Bank Name");
    	 }
		 
	}

}
