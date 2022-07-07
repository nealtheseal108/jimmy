package com.amazon.BroShaver.Section8ArraysListsUnboxingAutoboxing;

public class Array {
    public static void main(String[] args) {
        int[] myIntArray = new int[25];
        myIntArray[5] = 50; // the 6th element is 50
        System.out.println(myIntArray[5]);

        int[] mySecondIntArray = {0, 1, 2, 3, 4, 5};
        System.out.println(mySecondIntArray[3]);

        double[] myDoubleArray = new double[10];
    }

    public static void printAndAssignArray(int[] array) {
        for(int i = 0; i <= array.length - 1; i++) {
            array[i] = i * 10;
            System.out.println("Element #" + (i + 1) + " in myIntArray is " + array[i]);
        }
    }
}

// you cannot store a regular int in an array, you need to create an integer array
// elements start count from 0
// any datatype can be stored in an array
// you can use curly brackets to initialize each value of an array at once (and define the amount of values in the array)
// one can also se for loops to initialize values in an array
// use 'myArray.length' to dynamically access the length of an array
// 'ArrayIndexOutOfBounds' exception will be thrown if one is trying to access/assign an index of an array that does not exist
// arrays can be return types and parameters
// the default value of a numeric element in an array is 0
// the '[]' operator is called an array access operator
// boolean default value in array is false
// the 'new' operator is used to initialize and create an array and set the elements to their default values

// arrays and strings a reference types
//

