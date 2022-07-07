package com.amazon.BroShaver.Section8ArraysListsUnboxingAutoboxing;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();

        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Darwin");

        printList(placesToVisit);

        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);
        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("------------------------------");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println(newCity + " is already included in the list as a destination.");
                return false;
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else {

            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();
        boolean goingForward = true;
        if (cities.isEmpty()) {
            System.out.println("No cities in the itinerary.");
        } else {
            System.out.println("Now visiting " + listIterator.next());
        }

        while (!quit) {
            printMenu();
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday over lingesh.");
                    quit = true;
                    break;

                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list.");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list.");
                        goingForward = true;
                    }

                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Type: ");
        System.out.println("0 to quit");
        System.out.println("1 to visit the next city");
        System.out.println("2 to visit the previous city");
        System.out.println("3 to reprint the menu");
    }
}

// a LinkedList is a list that creates pointers to the next element in its list
// the LinkedList class includes an inbuilt 'iterator' method that iterates through the LinkedList
// it also has a 'hasNext' method that checks if there is a succeeding element in the list
// use the 'add' method to add elements to your linked list; you can also use the 'add' method with the index and element parameters to insert an element in a certain index
// use the 'remove' method to remove elements from your linked list;
// use the 'compareTo' method to check if an element in a linked list matches another field
// returns 0 if they match, returns > 0 if the element is alphabetically sorted above the next element
// returns < 0 if the element is alphabetically sorted below the next element
// use the 'next' method to move to the next entry in the linked list
// the 'ListIterator' actually points to the -1st entry initially, so '.next' is needed
// use the 'getFirst' method to access the first element in a linked list
// use the 'isEmpty' method to check whether a linked list is empty
// A ListIterator has no current element
// its cursor position always lies between the element that would be returned by a call to previous() and the element that would be returned by a call to next().