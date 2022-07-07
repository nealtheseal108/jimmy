package com.amazon.BroShaver.Section7OOP2;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return this.getName() + " -> startEngine()";
    }

    public String accelerate() {
        return this.getName() + " -> accelerate()";
    }

    public String brake() {
        return this.getName() + " -> brake()";
    }
}
