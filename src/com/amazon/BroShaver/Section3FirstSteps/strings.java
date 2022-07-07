package com.amazon.BroShaver.Section3FirstSteps;

public class strings {
    public static void main(String[] args) {
        // byte // short // int // long // float // double //char // boolean //

        String myString = "This is a string";
        System.out.println("My string = " + myString);

        myString = myString + ", and this is more";
        System.out.println("My string = " + myString);

        myString = myString + "\u00A9 2019";
        System.out.println("My string = " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        myString = myString + numberString;
        System.out.println("My string = " + myString);

        // string only deals with textual data, mathematical operators do not work

        String lastString = "10";
        int lastInt = 50;
        lastString = lastString + lastInt;
        System.out.println("Last string = " + lastString);

        double lastDouble = 120.47d;
        lastString = lastString + lastDouble;
        System.out.println("Last string = " + lastString);

        // strings in Java are immutable, when one changes the value of a string, the old value gets discarded and a new string gets created
        // StringBuffer is a work-around
    }
}
