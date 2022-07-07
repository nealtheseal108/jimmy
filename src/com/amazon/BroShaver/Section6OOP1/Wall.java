package com.amazon.BroShaver.Section6OOP1;

public class Wall {
    private double width;
    private double height;

    public Wall() {

    }

    public Wall(double width, double height) {
        if (width < 0 && height < 0) {
            this.width = 0;
            this.height = 0;
            return;
        }
        if (width < 0) {
            this.width = 0;
            this.height = height;
            return;
        }
        if (height < 0) {
            this.height = 0;
            this.width = width;
            return;
        }
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
            return;
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
            return;
        }
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public double getArea() {
        return this.width * this.height;
    }
}
