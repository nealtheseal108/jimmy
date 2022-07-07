package com.amazon.BroShaver.Section4ExpressionsStatementsMethods;

public class playingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (!summer) {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            }
            return false;
        }
        if (temperature >= 25 && temperature <= 45) {
            return true;
        }
        return false;
    }
}
