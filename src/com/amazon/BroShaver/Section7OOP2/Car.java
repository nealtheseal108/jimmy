package com.amazon.BroShaver.Section7OOP2;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public String startEngine() {
        return this.getName() +  "Car -> startEngine()";
    }

    public String accelerate() {
        return this.getName() +  " -> accelerate()";
    }

    public String brake() {
        return this.getName() + " -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
