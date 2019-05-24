package com.davegreen;

import java.util.ArrayList;

public class Branch
{
    private String name;
    private ArrayList<Customer> customerArrayList;
    
    public Branch(String name)
    {
        this.name = name;
        this.customerArrayList = new ArrayList<Customer>();
    }
    
    public String getName()
    {
        return name;
    }
    
    public ArrayList<Customer> getCustomerArrayList()
    {
        return customerArrayList;
    }
    
    public boolean addNewCustomer(String customerName, double openingDeposit)
    {
        if(findCustomer(customerName) == null)
        {
            this.customerArrayList.add(new Customer(customerName, openingDeposit));
            return true;
        }
        
        return false;
    }
    
    public boolean addCustomerTransaction(String customerName, double amount)
    {
        Customer existingCustomer = findCustomer(customerName);
        
        if(findCustomer(customerName) != null)
        {
            existingCustomer.addTransaction(amount);
            return true;
        }
        
        return false;
    }
    
    private Customer findCustomer(String customerName)
    {
        for(int i = 0; i < this.customerArrayList.size(); i ++)
        {
            Customer checkedCustomer = this.customerArrayList.get(i);
            
            if(checkedCustomer.getName().equals(customerName))
            {
                return checkedCustomer;
            }
        }
        
        return null;
    }
}
