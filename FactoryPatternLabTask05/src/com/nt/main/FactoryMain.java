package com.nt.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.AppConfig.AppConfig;
import com.nt.sbeans.Customer;

public class FactoryMain 
{
    public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Customer c=ctx.getBean(Customer.class);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Id:");
		int id=sc.nextInt();
		c.setCustId(id);
		System.out.println("Enter Customer Name:");
		String name=sc.next();
		c.setCustname(name);
		System.out.println("Enter Bank Type (SBI,HDFC):");
		String type=sc.next();
		c.setBank(type);
		System.out.println("Enter Amount to Deposit:");
		double damount=sc.nextDouble();
		c.deposit(damount);
		System.out.println("Enter Amount to Withdraw:");
		double wamount=sc.nextDouble();
		c.withdraw(wamount);
		c.displayDetails();
		sc.close();
		ctx.close();
		
	}
}
