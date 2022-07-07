package com.amazon.BroShaver.Section4ExpressionsStatementsMethods;

public class secondsAndMinutes {
    private static String INVALID_VALUE_MESSAGE = "Invalid Value.";
    public static void main(String[] args) {
        System.out.println(getDurationString(55, 117));
        System.out.println(getDurationString(7075));
    }

    public static String getDurationString (int seconds, int minutes) {
        if (seconds < 0 || seconds > 59 || minutes < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        String duration = hours + "h " + remainingMinutes + "m " + seconds + "s";
        return duration;
    }

    public static String getDurationString (int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(remainingSeconds, minutes);
    }
}

// final keyword make a variable immutable
// variables in static methods are allowed to be utilized outside the method