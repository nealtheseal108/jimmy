package com.amazon.BroShaver.Section5ControlFlowStatements;

public class flourPacking {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if ((5 * bigCount) + (smallCount) == goal) {
            return true;
        }

        if ((5 * bigCount) + (smallCount) < goal) {
            return false;
        }

        if ((5 * bigCount) + (smallCount) > goal) {
            if (bigCount == 0) {
                return true;
            }
        }
            if (smallCount == 0) {
                if (goal % 5 == 0) {
                    return true;
                }
            }


            for (int b = 0; b <= bigCount; b++) {
                for (int s = 0; s <= smallCount; s++) {
                    if ((5 * b + s) == goal) {
                        return true;
                    }
                }
            }

        return false;
    }

}
