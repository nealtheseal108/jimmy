package com.amazon.BroShaver.Section5ControlFlowStatements;

public class lastDigitChecker {

    public static boolean hasSameLastDigit (int x, int y, int z) {
        if (x < 10 || x > 1000 || y < 10 || y > 1000 || z < 10 || z > 1000) {
            return false;
        }

        int lastDigitX = (x % 10);
        int lastDigitY = (y % 10);
        int lastDigitZ = (z % 10);

        if (lastDigitX == lastDigitY || lastDigitX == lastDigitZ || lastDigitY == lastDigitZ) {
            return true;
        }

        return false;
    }

    public static boolean isValid (int x) {
        if (x < 10 || x > 1000) {
            return false;
        }
        return true;
    }
}
