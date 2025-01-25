package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.sbeans.Employee;

public class DependencyInjectiontest 
{
  public static void main(String[] args) {
	System.out.println("DependencyInjectiontest.main()-started");
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	Employee emp=ctx.getBean("emp",Employee.class);
	emp.setId(101);
	emp.setName("Priya");
	emp.ShowDetails();
	System.out.println("DependencyInjectiontest.main()-ended");
	ctx.close();
}
}
