package com.amazon.BroShaver.Section9InnerAbstractClassesInterfaces;

public abstract class Bird extends Animal implements CanFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking.");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in. Breathe out. Repeat.");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping their wings.");
    }
}
