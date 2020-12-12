package com.section6.exercises;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("customer", 50000.00, "default.email@default.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    // Getters for this class:
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
