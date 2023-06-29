package org.Bankmanagement;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customers;

    // Constructor
    public Bank() {
        customers = new ArrayList<>();
    }
    public void createAccount(String name, String accountNumber, double initialBalance) {     // Method to create a new customer account
        Customer customer = new Customer(name, accountNumber, initialBalance);
        customers.add(customer);
        System.out.println("Account created successfully.");
    }
    public void deposit(String accountNumber, double amount) {    // Method to deposit money into an account
        Customer customer = findCustomer(accountNumber);
        if (customer != null) {
            customer.deposit(amount);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String accountNumber, double amount) { // Method to withdraw funds from an account
        Customer customer = findCustomer(accountNumber);
        if (customer != null) {
            customer.withdraw(amount);
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public void displayAccountInfo(String accountNumber) {  // Method to display account information
        Customer customer = findCustomer(accountNumber);
        if (customer != null) {
            customer.displayAccountInfo();
        } else {
            System.out.println("Account not found.");
        }
    }

    private Customer findCustomer(String accountNumber) {   //  Method to find a customer by account number
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if (customer.getAccountNumber().equals(accountNumber)) {
                return customer;
            }
        }
        return null;
    }

    public void removeAccount(String accountNumber) {   // Method to remove a customer account
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if (customer.getAccountNumber().equals(accountNumber)) {
                customers.remove(i);
                System.out.println("Account removed successfully.");
                return;
            }
        }
        System.out.println("Account not found.");
    }
}
