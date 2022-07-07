package com.amazon.BroShaver.Section6OOP1;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        if (width < 0 && length < 0) {
            this.width = 0;
            this.length = 0;
            return;
        }
        if (width < 0) {
            this.width = 0;
            this.length = length;
            return;
        }
        if (length < 0) {
            this.length = 0;
            this.width = width;
            return;
        }
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }
}
