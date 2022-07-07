package com.amazon.BroShaver.Section5ControlFlowStatements;

public class allFactors {
    public static void printFactors (int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        String factors = "";
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors += Integer.toString(i) + " ";
            }
        }

        System.out.println(factors);
    }
}
