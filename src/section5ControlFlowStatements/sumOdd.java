package section5ControlFlowStatements;

public class sumOdd {
    public static boolean isOdd (int number) {
        if (number < 0) {
            return false;
        }
        if ((double) number % 2.00 == 0) {
            return false;
        }
        return true;
    }
    public static int sumOdd (int start, int end) {
        if (start > end || start <= 0 || end <= 0) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
