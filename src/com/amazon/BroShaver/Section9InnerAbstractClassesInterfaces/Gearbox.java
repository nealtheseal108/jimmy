package com.amazon.BroShaver.Section9InnerAbstractClassesInterfaces;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for (int i = 0; i < this.maxGears; i++)  {
            addGear(i, i * 5.3);
        }
    }

    public void operateClutch (boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if (number == this.gears.size() && this.gears.get(number - 1).ratio < ratio) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if (newGear >= 0 && newGear <= this.gears.size() - 1 && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + this.currentGear + " selected.");
        } else {
            System.out.println("Cannot change gear.");
        }
    }

    public double wheelSpeed(int revs) {
        if(!clutchIsIn) {
            System.out.println("Scream.");
            return 0.0;
        }
        return revs * this.gears.get(this.currentGear).getRatio();
    }

    private class Gear {
        private int number;
        private double ratio;

        public Gear(int number, double ratio) {
            this.number = number;
            this.ratio = ratio;
        }

        public int getNumber() {
            return number;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs * this.ratio;
        }
    }
}

// an inner class should be used when a component of an outer class is the inner class in and of itself
// it doesn't make sense to use a 'Gear' class unless a 'Gearbox' class is present
// you need to create an instance of the outer class to create an instance of the inner class

// local classes are declared inside code blocks, useful for encapsulation
// anonymous classes are lcoal classes without a name, have to be declared and instantiated at the same time, can only

