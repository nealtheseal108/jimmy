package section5ControlFlowStatements;

public class numberPalindrome {
    public static boolean isPalindrome (int x) {
        if (x >= -9 && x <= 9) {
            return true;
        }

        int y = x;
        String initialDigits;
        String reverseDigits = "";
        int lastDigit;

        if (x >= 10) {
            initialDigits = Integer.toString(x); // initial digits = "11"
            lastDigit = (x % 10); // lastDigit = 1
            reverseDigits += Integer.toString(lastDigit); // reverseDigits = "1"
            x /= 10; // x = 1

            while (x / 10 > 0) {
                lastDigit = (x % 10);
                reverseDigits += Integer.toString(lastDigit);
                x /= 10;
            }

            reverseDigits += Integer.toString(x); // reverseDigits = "1" + "1" = "11"
            if (reverseDigits.equals(initialDigits)) {
                return true;
            }
        }

        if (y <= -10) {
            y /= -1;
            initialDigits = Integer.toString(y); // initial digits = "11"
            reverseDigits = ""; // reverseDigits doesn't have a value
            lastDigit = (y % 10); // lastDigit = 1
            reverseDigits += Integer.toString(lastDigit);
            y /= 10; // x = 1

            while (y / 10 > 0) {
                lastDigit = (y % 10);
                reverseDigits += Integer.toString(lastDigit);
                y /= 10;
            }

            reverseDigits += Integer.toString(y);
            if (reverseDigits.equals(initialDigits)) {
                return true;
            }
        }
        return false;
    }
}
