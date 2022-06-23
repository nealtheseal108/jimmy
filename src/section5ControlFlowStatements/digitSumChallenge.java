package section5ControlFlowStatements;

public class digitSumChallenge {
    public static void main(String[] args) {
        int number = 3428974;
        System.out.println("The sum of the digits in " + number + " is " + sumDigits(number));
    }
    public static int sumDigits(int x) {
        if (x < 10) {
            return -1;
        }
        int sumOfDigits = 0;
        while (x / 10 != 0) {
            sumOfDigits += x % 10;
            x /= 10;
        }
        sumOfDigits += x;
        return sumOfDigits;
    }
}
