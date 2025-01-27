package com.nt.config;

import java.time.LocalDate;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.nt.sbeans")

public class AppConfig {
	Scanner sc=new Scanner(System.in);
  @Bean(name="birthDate")
	public LocalDate createDate()
	{
	  System.out.println("Enter the Year of BirthDate:");
	  int year=sc.nextInt();
	  System.out.println("Enter the Month Of BirthDate:");
	  int month=sc.nextInt();
	  System.out.println("Enter the Date of BirthDate:");
	  int day=sc.nextInt();
	
		return LocalDate.of(year,month,day);
	}
  @Bean(name="currentDate")
  public LocalDate newDate()
  {
	  return LocalDate.now();
  }
}
