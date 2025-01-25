package com.nt.cfgs;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.sbeans.Address;
import com.nt.sbeans.Student;

@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig 
{
    Scanner sc=new Scanner(System.in);
//    @Bean
//    public Address add()
//    {
//    	System.out.println("Enter Student City:");
//    	String city=sc.next();
//    	System.out.println("Enter Student State:");
//    	String state=sc.next();
//    	return new Address(city,state);
//    }
    @Bean(name="stu")
    public Student student()
    {
    	System.out.println("Enter Student Name:");
    	String name=sc.next();
    	System.out.println("Enter Student RollNo.:");
    	int rollno=sc.nextInt();
    	System.out.println("Enter Student City:");
    	String city=sc.next();
    	System.out.println("Enter Student State:");
    	String state=sc.next();
    	Address add=new Address(city,state);
    	return new Student(name,rollno,add);
    }
}
