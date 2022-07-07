package com.amazon.BroShaver.Section9InnerAbstractClassesInterfaces;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("no.");
    }
}
