package com.nt.sbeans;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
@Component("agecal")
public class AgeCalculator {
  
	private int age;
	@Autowired
	private LocalDate birthDate;
	@Autowired
	private LocalDate currentDate;
	
	public void calculateAge(String name)
	{
		//age=currentDate.compareTo(birthDate);
		age=Period.between(birthDate, currentDate).getYears();
		System.out.println(name+" your age is :"+age);
		
	}
	
}
