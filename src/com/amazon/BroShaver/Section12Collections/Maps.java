package com.amazon.BroShaver.Section12Collections;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java already exists in the HashMap.");
        } else {
            languages.put("Java", "a compiled, high-level, object-oriented, platform-independent language");
        }
        languages.put("Java", "a compiled, high-level, object-oriented, platform-independent language");
        languages.put("Python", "object-oriented high-level programming language with dynamic semantics");
        languages.put("Algol", "algorithmic language");
        System.out.println(languages.put("Basic", "beginners all-purpose symbolic instruction code"));
        System.out.println(languages.put("Lisp", "therein lies madness"));

        System.out.println(languages.get("Java"));
        System.out.println(languages.put("Java", "this course is about Java"));
        System.out.println(languages.get("Java"));

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the HashMap.");
        } else {
            languages.put("Java", "this course is about Java");
        }

        System.out.println("========================================");
        // languages.remove("Lisp");
        if (languages.remove("Algol", "algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, pair not found.");
        }

        System.out.println(languages.replace("Lisp", "a functional programming language"));
        System.out.println(languages.replace("Scala", "this will not be added"));

        if (languages.replace("Java", "Java", "Java")) {
            System.out.println("Java's value was replaced.");
        } else {
            System.out.println("Java's value was not replaced.");
        }

        for (String key: languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }
    }
}

// maps are part of the 'Collections' framework, but they are not actually a 'Collection', as do not inherit from the 'Collections' class
// maps map keys to values (an example of this is a dictionary: words are mapped to their respective definitions)
// Java maps cannot contain duplicate keys, and each key can only map to a single value
// maps are generic types; they take a type for the key and another for the value
// use the '.put()' method to add a key-value pair to a HashMap and return the value of a pair with a key that is identical to the 'kay' parameter in the method and is already included in the HashMap
// the '.get({key})' method retrieves a value pair from a HashMap
// if one inserts a key-value pair with an identical key to one already present in the HashMap, the latter pair will be overwritten
// use '.containsKey()' to check whether a HashMap contains a certain key
// use the '.putIfAbsent()' method to insert a pair into a HashMap if the key that is a parameter in the method is not already present in the HashMap; intended to prevent concurrency issues
// use the 'keySet()' method in Java to create a set out of the key elements contained in the hash map.
// the for-each loop is used to simplify the syntax of the traditional for loop
// for(dataType item: array) {
//     ...
// }
// use the '.remove({key}/{key, value})' method to remove a pair from a hashmap; returns a boolean
// use the '.remove({key, value}/{key, old value, new value})' method to replace a pair in a hashmap; returns the previous value of the pair being replaced or 'null' if it doesn't exist
//
// Requirements for a class to be immutable:
//
// the class must be declared as final so that child classes can’t be created.
// data members in the class must be declared private so that direct access is not allowed.
// data members in the class must be declared as final so that we can’t change the value of it after object creation.
// a parameterized constructor should initialize all the fields performing a deep copy so that data members can’t be modified with an object reference.
// deep copy of objects should be performed in the getter methods to return a copy rather than returning the actual object reference)