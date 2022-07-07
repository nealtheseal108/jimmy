package com.amazon.BroShaver.Section11NamingConventionsStaticFinal;

public class AccountMain {
    public static void main(String[] args) {
        Account timsAccount = new Account("Tim");
        timsAccount.deposit(1000);
        timsAccount.withdraw(500);
        timsAccount.withdraw(-200);
        timsAccount.deposit(-20);
        timsAccount.calculateBalance();
    }
}

// as a result of the 'public' access modifier being applied to the methods in the 'Account' class, any classes that use an instance of the class can modify the balance directly
// if you expose fields in classes, they become easy targets for unwanted manipulation by other classes
// access control in granted at the top-level (classes, enums, and interfaces) or member-level (methods, members and fields)
// classes can't be private

// top-level
// public: the object is visible to all classes everywhere, even if they are in a different package (through 'import' statements)
// package-private: the object is visible only to classes inside the package it is present in; it is the default access modifier

// member-level
// public: fields, members, and methods declared public in a public class can be accessed from any other class, even if they are in a different package (through 'import' statements)
// package-private: fields, members, and methods are visible only to classes inside the package it is present in; it is the default access modifier
// private: fields, members, and methods are only visible within the class it has been declared in (not even subclasses of its original class can access them)
// protected: fields, members, and methods are only visible within its own package but also in subclasses of its origin class (even if they are in external packages)

