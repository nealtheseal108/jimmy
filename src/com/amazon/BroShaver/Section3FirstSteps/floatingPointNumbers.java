package com.amazon.BroShaver.Section3FirstSteps;

public class floatingPointNumbers {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min Value = " + myMinFloatValue);
        System.out.println("Float Max Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Min Value = " + myMinDoubleValue);
        System.out.println("Double Max Value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5 / 3f;
        double myDoubleValue = 5.00 / 3.00;

        System.out.println("int value = " + myIntValue);
        System.out.println("float value = " + myFloatValue);
        System.out.println("double value = " + myDoubleValue);


    }
}
