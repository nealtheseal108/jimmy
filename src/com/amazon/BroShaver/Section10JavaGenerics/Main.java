package com.amazon.BroShaver.Section10JavaGenerics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for (int i : n) {
            System.out.println(i * 2);
        }
    }
}

// Generics means parameterized types
// The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces
// Using Generics, it is possible to create classes that work with different data types
// in Java, the ':' operator represents 'for each'
// 'uses unsafe or unchecked operations' warning means that one's code might throw an error when executed
//  List is naturally a generic type
// it is recommended to not utilize raw types in your code
// when one provides a type parameter to a generic type (using <>), it is called a parameterized type
// one doesn't need a second declaration for the parameterized type
// the earlier a bug is spotted in the code, the easier it is to fix
// 'T' keyword represents a generic type
// A "raw" type in Java is a class which is non-generic and deals with "raw" Objects, rather than type-safe generic type parameters
// use '<dataType>' to specify which datatypes are allowed as parameters in classes/methods
// use bounded type parameters to provide classes with a restriction on which parameters it and its methods can accept
// for example, one can use the 'extends' keyword inside of a diamond to specify that only datatypes that extend a certain class can be used
// an argument passed of a type parameter can be a class or interface
// interfaces can also specify type parameters
// you can only extend from a single class, but you can extend multiple interfaces
// if '<T extends class>' is defined in the class signature methods (and other classes) that use 'T' can only accept datatypes that extend 'class'