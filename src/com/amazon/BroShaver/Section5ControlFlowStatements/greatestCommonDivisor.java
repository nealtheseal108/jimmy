package com.amazon.BroShaver.Section5ControlFlowStatements;

public class greatestCommonDivisor {

    public static int getGreatestCommonDivisor(int x, int y) {

        if (x < 10 || y < 10) {
            return -1;
        }

        if (x == y) {
            return x;
        }

        int lesser = 0;
        int greater = 0;
        int GCF = 0;

        if (x < y) {
            lesser = x;
            greater = y;
        }

        if (y < x) {
            lesser = y;
            greater = x;
        }

        for (int i = 2; i <= lesser; i++) {
            if (greater % i == 0 && lesser % i == 0) {
                GCF = i;
            }
        }
        return GCF;
    }
}
