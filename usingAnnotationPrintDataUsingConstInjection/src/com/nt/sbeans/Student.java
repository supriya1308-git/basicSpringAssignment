package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//target class
//@Component("stu")
public class Student
{
	private String name;
    private int rollno;
    private Address add;
  //@Autowired
  public Student(String name,int rollno,Address add)
  {
	 this.name=name;
	 this.rollno=rollno;
	 this.add=add;
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
  public void displayStudentDetails()
  {
	  System.out.println("=====Student Details=====");
	  System.out.println("Student Name:"+name);
	  System.out.println("Student RollNo.:"+rollno);
	  add.displayAddress();
  }
  
  
}
