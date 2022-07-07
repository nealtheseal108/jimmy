package com.amazon.BroShaver.Section9InnerAbstractClassesInterfaces;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "is breathing.");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in. Breathe out. Repeat.");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
