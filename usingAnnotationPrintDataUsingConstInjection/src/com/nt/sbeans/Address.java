package com.nt.sbeans;

public class Address
{
   private String city;
   private String state;
   public Address(String city,String state)
   {
	  this.city=city;
	  this.state=state;
   }
   
   public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public void displayAddress()
   {
	   System.out.println("Student Address:");
	   System.out.println("City:"+city);
	   System.out.println("State:"+state);
   }
}
