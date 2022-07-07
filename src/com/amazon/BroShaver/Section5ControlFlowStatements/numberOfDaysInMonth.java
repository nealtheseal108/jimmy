package com.amazon.BroShaver.Section5ControlFlowStatements;

public class numberOfDaysInMonth {
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

    public static int getDaysInMonth (int month, int year) {
        boolean isLeapYear = isLeapYear(year);
        if (isLeapYear && month == 2) {
            return 29;
        }

        if (year < 0 || year > 9999) {
            return -1;
        }

        switch(month) {
            case 1:
                return 31;

            case 2:
                return 28;

            case 3:
                return 31;

            case 4:
                return 30;

            case 5:
                return 31;

            case 6:
                return 30;

            case 7:
                return 31;

            case 8:
                return 31;

            case 9:
                return 30;

            case 10:
                return 31;

            case 11:
                return 30;

            case 12:
                return 31;
        }
        return -1;
    }
}
