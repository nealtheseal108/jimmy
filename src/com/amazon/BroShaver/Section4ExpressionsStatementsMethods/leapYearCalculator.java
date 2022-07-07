package com.amazon.BroShaver.Section4ExpressionsStatementsMethods;

public class leapYearCalculator {
    public static boolean isLeapYear (int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0) {
            if (year % 400 == 0) {
                return true;
            }
            if (year % 100 != 0) {
                return true;
            }
        }
        return false;
    }
}
