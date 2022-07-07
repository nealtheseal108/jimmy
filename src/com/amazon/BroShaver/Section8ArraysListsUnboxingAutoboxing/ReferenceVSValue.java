package com.amazon.BroShaver.Section8ArraysListsUnboxingAutoboxing;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ReferenceVSValue {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray = new int[] {4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}

// arrays and strings are reference types
// reference types hold a reference to the object, but not the object itself
// 'myIntArray' holds a reference to an array in memory
// with reference types, one uses a reference in memory to access and change the object
// reference types use the 'new' operator
// 'anotherArray' is referencing the reference to 'myIntArray' stored in memory
// 'Arrays.toString' static method prints the elements of an array separated by commas
// if one reference to a reference type is changed, all reference types that reference the same reference are modified
// reference types represent the reference point, not the actual data
// when a reference type switches its reference (points to a different reference/dereferencing), it cannot modify the other reference types referencing the orginal reference
// reference types that reference the same reference (in this case, an array) in memory will be dynamically changed if the reference is changed through modifications
