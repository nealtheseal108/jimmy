package com.amazon.BroShaver.Section8ArraysListsUnboxingAutoboxing;

import java.util.ArrayList;

class intClass {
    private int myValue;
    public intClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Neal");

        // ArrayList<String> intArrayList = new ArrayList<>(); does not work, as int is a primitive type, not a class
        ArrayList<intClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new intClass(54));

        Integer integer = new Integer(1);
        Double doubleValue = new Double(1.5);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " -> " + integerArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; // shortcut for 'Integer myIntValue = Integer.valueOf(56);'

        int myInt = myIntValue; // shortcut for 'int myInt = myIntValue.intValue();'

        ArrayList<Double> myDoubleValues = new ArrayList<>();

        for (double i = 0; i < 10; i++) {
            myDoubleValues.add(i * 10);
        }

        for (int i = 0; i < 10; i++) {
            double temp = myDoubleValues.get(i);
            System.out.println(i + " -> " + temp);
        }
    }
}

// to be able to use an Arraylist that saves primitive types (not classes), you must create a class of a primitive type that only stores the aforementioned primitive type
// this is very inefficient
// 'intClass' is a wrapper class of 'int', since it holds the exact same properties, functionality, datatype
// the 'Integer' is already a wrapper class of 'int' inbuilt into Java
// 'valueOf' method takes a primitive type and coverts it to a wrapper type (autoboxing)
// 'intValue' method takes a wrapper type and converts it to an int type (unboxing)
// primitive type to object wrapper = autoboxing
// object wrapper to primitive type = unboxing
// Java inbuilt wrappers don't need the 'new' keyword to be instantiated
// when performing operations, Java automatically autoboxes and unboxes primitive and wrapper types


