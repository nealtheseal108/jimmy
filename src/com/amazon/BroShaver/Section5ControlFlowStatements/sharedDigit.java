package com.amazon.BroShaver.Section5ControlFlowStatements;

public class sharedDigit {
    public static boolean hasSharedDigit (int x, int y) {
        if (x < 10 || x > 99 || y < 10 || y > 99) {
            return false;
        }
        int onesX = (x % 10);
        int tensX = (x / 10);
        int onesY = (y % 10);
        int tensY = (y / 10);
        if (onesX == onesY || onesX == tensY || tensX == onesY || tensX == tensY) {
            return true;
        }
        return false;
    }
}
