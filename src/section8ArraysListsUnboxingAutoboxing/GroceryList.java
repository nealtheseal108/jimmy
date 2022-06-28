package section8ArraysListsUnboxingAutoboxing;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList <String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println("Item #" + i + 1 + " is " + groceryList.get(i) + ".");
        }
    }

    public void modifyGroceryList(int position, String newItem) {
        if (position < 1) {
            System.out.println("You cannot modify a negative or zero position in your list.");
        }
        groceryList.set(position - 1, newItem);
        System.out.println("Item #" + (position - 1) + " was replaced with " + groceryList.get(position - 1) + ".");
    }

    public void removeGroceryItem(int position) {
        if (position < 1) {
            System.out.println("You cannot remove a negative or zero position in your list.");
        }
        String item = groceryList.get(position - 1);
        groceryList.remove(position - 1);
    }

    public String findItem(String searchItem) {
        // boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            groceryList.get(position);
        }
        return null;
    }
}
// the collection in Java is a framework that provides architecture to store and manipulate objects
// a list in Java is extended from the collection; it is an ordered collection of objects in which duplicate values can be stored
// since a List preserves the insertion order, it allows positional access and insertion of elements
// '<E>' signifies that classes and custom data types can be included (can be parameters) in an object (in this case, an ArrayList)
// an ArrayList is a class that can be called with a constructor
// use '.add' to add an element to an ArrayList
// use '.size' to access the size of an ArrayList
// use .'get' to access a certain index in an ArrayList
// use '.set' to modify a certain index in an ArrayList
// use '.remove' to remove a certain index in an ArrayList
// use '.contains' to view if an item exists in an ArrayList (returns boolean)
// use '.indexOf' to find the first occurrence of an object in an ArrayList (returns int; returns -1 is nothing is found)
