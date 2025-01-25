package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("emp")
public class Employee 
{
  private int id;
  private String name;
  private LocalDate joiningDate;
  @Autowired
  public Employee(LocalDate joindate)
  {
	 this.joiningDate=joindate;
  }

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public LocalDate getJoiningDate() {
	return joiningDate;
}

public void setJoiningDate(LocalDate joiningDate) {
	this.joiningDate = joiningDate;
}
  public void ShowDetails()
  {
	  System.out.println("====Employee Details:====");
	  System.out.println("Employee id:"+id);
	  System.out.println("Employee Name:"+name);
	  System.out.println("Employee JoiningDate:"+joiningDate);
  }
}
