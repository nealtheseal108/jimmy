package com.amazon.BroShaver.Section4ExpressionsStatementsMethods;

public class equalityCalculator {
    public static void printEqual (int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (x == y && y == z) {
            System.out.println("All numbers are equal");
            return;
        }
        if (x == y || y == z || x == z) {
            System.out.println("Neither all are equal or different");
            return;
        }
        System.out.println("All numbers are different");
    }
}
