package com.section6.exercises;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Empty constructor
    public BankAccount() {

    }

    // This is the constructor we have made so we don't have to set the parameters every time in Main class
    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount) {
        if (depositAmount < 0) {
            System.out.println("Cannot deposit negative amount.");
        } else if (depositAmount == 0) {
            System.out.println("Error: Please deposit more than 0.0 dollars");
        } else {
            this.balance += depositAmount;
            System.out.println("You have deposited $" + depositAmount + " into your account.");
            System.out.println("Your new balance is: $" + balance);
        }
    }

    public void withdrawFunds(double withdrawAmount) {
        if (withdrawAmount > balance || balance == 0) {
            System.out.println("Error: You cannot withdraw more than you have!");
        } else if(withdrawAmount < 0.0) {
            System.out.println("Error: Cannot withdraw a negative number");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("You have withdrawn: $" + withdrawAmount + " from your account.");
            System.out.println("Your new balance is: $" + balance);
        }
    }

}
