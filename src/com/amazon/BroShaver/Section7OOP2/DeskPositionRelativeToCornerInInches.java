package com.amazon.BroShaver.Section7OOP2;

public class DeskPositionRelativeToCornerInInches {

    protected static int x;
    protected static int y;

    public DeskPositionRelativeToCornerInInches(int x, int y) {

        if (x > 0) {
            System.out.println("Unfortunately, the desk cannot go through a wall.");
            this.x = 0;
        } else {
            this.x = x;
        }

        if (y > 0) {
            System.out.println("Unfortunately, the desk cannot go through a wall.");
            this.y = 0;
        } else {
            this.x = x;
        }
    }
}
