package com.nt.cfgs;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.sbeans.Employee;

@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig {
	
@Bean
 public Employee emp()
 {
	 return new Employee(LocalDate.now());
 }

	
}
