package com.amazon.BroShaver.Section4ExpressionsStatementsMethods;

public class decimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double x, double y) {
        double xDouble = x * 1000;
        double yDouble = y * 1000;

        int xInt = (int) xDouble;
        int yInt = (int) yDouble;

        if (xInt == yInt) {
            return true;
        }
        return false;
    }
}

// when converting from floating point numbers to non-floating point through casting, the compiler doesn't round; instead, it just takes the literal non-floating point value
// double x = 1.9;
// int xInt = (int) x;
// xInt = 1;

