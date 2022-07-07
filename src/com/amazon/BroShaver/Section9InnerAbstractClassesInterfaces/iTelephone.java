package com.amazon.BroShaver.Section9InnerAbstractClassesInterfaces;

public interface iTelephone {
    void powerOn();
    void dial(int number);
    void answer();
    boolean callPhone(int number);
    boolean isRinging();
}

// an interface specifies methods that a particular class that implements the interface must implement
// the interface that one is creating is abstract, meaning that there is no code for any of the methods
// one only supplies the method names and the parameters, code goes in the created class
// you can use an interface to have multiple classes have a common behavior by implementing the same interface
// this standardizes the way a set of classes are utilized
// if a method is reliant on another and the latter modifies its parameters/return type, etc., the former method no longer functions as specified and has to be changed
// a signature of a method/class is the name, parameters, access modifier, and return type
// access modifiers are redundant in the case of an interface as a result of the classes inheriting the methods in the interface already
// and because interfaces are public static final by design
// use the 'implements' keyword to implement interfaces
// all methods from an interface have to be implemented in a class
// you can create an instance of two classes using the same interface with the same variable name
// as Java libraries extensively utilize interfaces, the processes to change return types and parameters is very simple
// as all 'List' types are derived from the 'List' interface, on can use the 'List' keyword to instantiate another type of a List
// to decide whether to use inheritance ('extends') or interfaces ('implements') in your code, consider the relationship of the final class to the "superclass"
// a class can only inherit from one superclass, but you can implement from many interfaces
