package com.section8.Exercises.MobilePhone;

import java.util.Scanner;

public class MobilePhoneRunner {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();
    private static final SystemOptionList optionList = new SystemOptionList();

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\n Enter Action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\n Shutting down...");
                    quit = true;
                    break;
                case 1:
                    printContact();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }

    }

    private static void queryContact() {

    }

    private static void removeContact() {

    }

    private static void updateContact() {

    }

    private static void addContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.addContact(name, phone);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: " + name + ", phone: " + phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void printContact() {
        mobilePhone.printContacts();
    }

    private static void printActions() {
        System.out.println("\n Available actions: \npress ");
        System.out.println(optionList.getOptionZero());
        System.out.println(optionList.getOptionOne());
        System.out.println(optionList.getOptionTwo());
        System.out.println(optionList.getOptionThree());
        System.out.println(optionList.getOptionFour());
        System.out.println(optionList.getOptionFive());
        System.out.println(optionList.getOptionSix());
        System.out.println("Choose your action: ");
    }

    private static void startPhone() {
        System.out.println("Starting phone..");
    }


}
