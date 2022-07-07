package com.amazon.BroShaver.Section8ArraysListsUnboxingAutoboxing;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListMain {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
                case 7:
                    processArrayList();
                    break;
                default:
                    quit = true;
                    break;
            }
        }
    }

    private static void printInstructions() {
        System.out.println("Press:");
        System.out.println("0 to reprint navigation options.");
        System.out.println("1 to print out your grocery list.");
        System.out.println("2 to add an item to your grocery list.");
        System.out.println("3 to modify an item in your grocery list.");
        System.out.println("4 to remove an item from your grocery list.");
        System.out.println("5 to search for items in your grocery list.");
        System.out.println("6 to quit the grocery list application.");
    }

    private static void addItem() {
        System.out.print("Please enter the grocery item you want to add: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    private static void modifyItem() {
        System.out.print("Please enter the name of the grocery item you want to replace: ");
        String searchItem = scanner.nextLine();
        if (groceryList.findItem(searchItem) != -1) {
            System.out.print("Please enter the name of the of the grocery item you want to replace " + searchItem + " with: ");
            String newItem = scanner.nextLine();
            groceryList.modifyGroceryList(groceryList.findItem(searchItem), newItem);
        }
    }

    private static void removeItem() {
        System.out.print("Please enter the name of the item you want to remove: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    private static void searchItem() {
        System.out.print("Please enter the name of the item you want to search for: ");
        String searchedItem = scanner.nextLine();
        if (groceryList.findItem(searchedItem) != -1) {
            System.out.println(searchedItem + " is in position #" + groceryList.findItem(searchedItem));
        } else {
            System.out.println(searchedItem + " does not exist in your list. You can add it if you want.");
        }
    }

    private static void processArrayList() {
        ArrayList<String> newArrayList = new ArrayList<String>();
        newArrayList.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArrayList = new ArrayList<String>(groceryList.getGroceryList());

        // below is ArrayList to Array conversion

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}


