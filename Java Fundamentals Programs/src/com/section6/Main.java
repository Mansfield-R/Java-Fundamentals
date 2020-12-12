package com.section6;

public class Main {

    public static void main(String[] args) {

        BankAccount myBank = new BankAccount();
        myBank.depositFunds(2198.27);
        myBank.withdrawFunds(400.00);

        // Using constructor we made in BankAccount Class:
        BankAccount ricksAccount = new BankAccount("123333",
                0.00,
                "Rick Mansfield",
                "myemail@rick.com",
                "888-777-6655");


        // Test VipCustomer object:

        // Using Default constructor with default fields:
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        // Using constructor with 1 default field with 2 passed parameters:
        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getName());

        // Using constructor with all fields passed as paramters:
        VipCustomer person3 = new VipCustomer("Tim", 50000.00, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
