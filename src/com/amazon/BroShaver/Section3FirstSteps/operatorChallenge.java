package com.amazon.BroShaver.Section3FirstSteps;

public class operatorChallenge {
    public static void main(String[] args) {
        double doubleVar = 20.00d;
        double secondDoubleVar = 80.00d;
        double totalMultiply = (doubleVar + secondDoubleVar) + 100;
        double remainder = (totalMultiply % 40.00);

        boolean hasRemainder = (remainder == 0) ? true : true;

        if (hasRemainder) {
            System.out.println("Got no remainder.");
        }
    }
}
