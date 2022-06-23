package section5ControlFlowStatements;

public class firstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int x = number;
        int lastDigit = (x % 10);
        while (x / 10 > 0) {
            x /= 10;
        }
        return x + lastDigit;
    }
}
