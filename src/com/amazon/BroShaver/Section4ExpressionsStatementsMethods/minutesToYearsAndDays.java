package com.amazon.BroShaver.Section4ExpressionsStatementsMethods;

public class minutesToYearsAndDays {
    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long years = minutes / 525600;
        long remainingMinutes = minutes % 525600;
        long days = remainingMinutes / 1440;
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}
