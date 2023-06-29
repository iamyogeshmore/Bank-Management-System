package org.Bankmanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Account Information");
            System.out.println("5. removeAccount");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {

                case 1:
                    System.out.print("Enter account holder's name: ");
                    String name = input.nextLine();
                    System.out.print("Enter account number: ");
                    String accountNumber = input.nextLine();
                    System.out.print("Enter balance: ");
                    double initialBalance = input.nextDouble();
                    input.nextLine();
                    bank.createAccount(name, accountNumber, initialBalance);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = input.nextLine();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = input.nextDouble();
                    input.nextLine();
                    bank.deposit(accountNumber, depositAmount);
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = input.nextLine();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = input.nextDouble();
                    input.nextLine();
                    bank.withdraw(accountNumber, withdrawalAmount);
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    accountNumber = input.nextLine();
                    bank.displayAccountInfo(accountNumber);
                    break;

                case 5:
                    System.out.print("Enter account number: ");
                    accountNumber = input.nextLine();
                    bank.removeAccount(accountNumber);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}