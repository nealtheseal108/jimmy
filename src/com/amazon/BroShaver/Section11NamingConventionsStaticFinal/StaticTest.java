package com.amazon.BroShaver.Section11NamingConventionsStaticFinal;

public class StaticTest {
    private static int numInstances  = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        this.numInstances++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return this.name;
    }
}
