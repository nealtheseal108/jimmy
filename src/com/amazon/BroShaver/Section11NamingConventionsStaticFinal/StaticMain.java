package com.amazon.BroShaver.Section11NamingConventionsStaticFinal;

public class StaticMain {

    public static int multiplier = 7;

    public static void main(String[] args) {
        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance #" + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName() + " is instance #" + StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("3rd Instance");
        System.out.println(thirdInstance.getName() + " is instance #" + StaticTest.getNumInstances());
        int answer = multiply(6);
        System.out.println("The answer is " + answer + ".");
        System.out.println("Multiplier = " + multiplier);


        FinalTest one = new FinalTest("one");
        FinalTest two = new FinalTest("two");
        FinalTest three = new FinalTest("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        System.out.println(Math.PI);
        // Math m = new Math();

        Password password = new Password(123456);
        password.storePassword();
        password.letMeIn(12345);

        System.out.println("Main method called.");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
    }

    public static int multiply(int number) {
        return number * multiplier;
    }
}

// a static field, also known as a class variable, has a value associated with the class itself rather than the instance of the class it was declared in
// this means that there is only one variable of that name and type in memory (only one version of the variable)
// all instances of the class it is present in share the value of the variable
// if one wants to create method that only functions with static fields, use a static method which belongs to the class and not the instance of the class itself
// the 'this.' keyword cannot be used in static methods because there cannot be any fields in the method that belong to the instances of the class (where one utilizes 'this.') and not the class itself
// 'psvm' is static so that the JVM can call it from the class itself and not an instance of a class
// the 'non-static field/method _____ cannot be referenced from a static context' displays as a result of non-static fields/methods being required to be instantiated using an instance of the clas they were to be accessed
// non-static fields/methods don't exist until an instance of the class they are within is created
// you can use static fields/methods from a non-static context w/ no problems even if they are in another class
// a static initialisation block is the opposite of a constructor
// whereas constructors are outlined at every instantiation of a class, static initializers are executed only once when the class is first loaded
// all static final fields must be initialized before all static initialisation blocks terminate
//
