package com.amazon.BroShaver.Section5ControlFlowStatements;

public class evenDigitSum {
    public static int getEvenDigitSum(int number) {
        int x = number;

        if (x < 0) {
            return -1;
        }

        int sum = 0;

        while (x / 10 > 0) {
            int lastDigit = (x % 10);
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            x /= 10;
        }

        if (x % 2 == 0) {
            sum += x;
        }
        return sum;
    }
}
