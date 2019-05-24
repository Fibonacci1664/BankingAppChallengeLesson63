package com.davegreen;

public class Main
{

    public static void main(String[] args)
    {
        CentralBank centralBank = new CentralBank("Bank of England");

//	   centralBank.addBranch("Nottingham");
//	   centralBank.addBranch("Liverpool");
//	   centralBank.addBranch("Essex");
//	   centralBank.addBranch("Skegness");
//	   centralBank.addBranch("Newcastle");
//	   centralBank.addBranch("Manchester");
    
        centralBank.addCustomer("Nottingham", "Dave", 100.00);
//	   centralBank.addCustomer("Nottingham", "Stacy", 100.00);
//	   centralBank.addCustomer("Nottingham", "Amelia", 50.00);
//	   centralBank.addCustomer("Skegness", "James", 21.00);
//
//	   centralBank.addCustomer("Liverpool", "Claudia", 50.00);
//
//	   centralBank.addCustomerTransaction("Essex", "Ally", 200.00);
//	   centralBank.addCustomerTransaction("Skegness", "James", 80.00);
//	   centralBank.addCustomerTransaction("Newcastle", "Jim", 500.00);
//	   centralBank.addCustomerTransaction("Nottingham", "Dave", 250.00);
//	   centralBank.addCustomerTransaction("Nottingham", "Dave", 125.00);
//	   centralBank.addCustomerTransaction("Nottingham", "Stacy", 625.00);
//	   centralBank.addCustomerTransaction("Liverpool", "Claudia", 145.00);
//	   centralBank.addCustomerTransaction("Essex", "Ally", 420.00);
//
//
//	   centralBank.listCustomers("Essex", true);
//
//
//	   if(!centralBank.addCustomer("Glasgow", "Bob", 10.00))
//       {
//           System.out.println("Error that bank doesn't exist!");
//       }
//
//       if(!centralBank.addBranch("Nottingham"))
//       {
//           System.out.println("Error that branch already exists!");
//       }
//
//       if(!centralBank.addCustomerTransaction("Nottingham", "Paul", 189.00))
//       {
//           System.out.println("Customer does not exists a that branch!");
//       }
//
//       if(!centralBank.addCustomer("Skegness", "James", 80.00))
//       {
//           System.out.println("Customer already exists");
//       }
    }
}
