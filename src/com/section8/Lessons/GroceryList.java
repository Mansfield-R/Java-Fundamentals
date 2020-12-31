package com.section8.Lessons;

import java.util.ArrayList;

public class GroceryList {
    // Array List is actually a class which is why it has its own constructor at ArrayList<String> ()
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        // Add Element:
        groceryList.add(item);
    }

    public void printGroceryList() {
        // To get size of list:
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        // Loop for grocery list.size() to grab elements:
        for (int i=0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    // Overloaded method:
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(newItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    // Replace item at position:
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item: " + (position + 1) + " has been modified");
    }

    // Remove from list:
    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    // Query List and search it:
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }
}
