package com.nt.sbeans;

public interface Bank 
{
    public double getAmount();
    public void setAmount(double amount);
    public String deposit(double amount);
    public String withdraw(double amount);
     public String toString();
}
