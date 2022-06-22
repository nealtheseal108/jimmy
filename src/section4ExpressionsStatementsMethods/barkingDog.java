package section4ExpressionsStatementsMethods;

public class barkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay > 23 || hourOfDay < 0) {
            return false;
        }
        if (barking && (hourOfDay > 22 || hourOfDay < 8)) {
            return true;
        }
        return false;
    }
}
