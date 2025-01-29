package com.nt.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.AgeCalculator;

public class DependencyInjectionTest {
public static void main(String[] args) {
	//System.out.println("DependencyInjectionTest.main()-started");
	System.out.println("==== Age Calculator Application=====");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name:");
	String name=sc.next();
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	AgeCalculator age=ctx.getBean("agecal",AgeCalculator.class);
	
	age.calculateAge(name);
	ctx.close();
	System.out.println("Thank you for Using This WebSite "+name+" 😊");
	System.out.println("Plz Visit It Again");
	//System.out.println("DependencyInjectionTest.main()-ended");
	
}


}
