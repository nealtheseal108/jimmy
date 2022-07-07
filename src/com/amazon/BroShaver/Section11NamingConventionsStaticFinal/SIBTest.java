package com.amazon.BroShaver.Section11NamingConventionsStaticFinal;

public class SIBTest {
    public static final String owner;

    static {
        owner = "Tim";
        System.out.println("SIBTest SIB called.");
    }

    public SIBTest() {
        System.out.println("SIBTest constructor called.");
    }

    static {
        System.out.println("2nd initialization block called.");
    }

    public void someMethod() {
        System.out.println("someMethod() called.");
    }
}
