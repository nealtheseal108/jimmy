package section5ControlFlowStatements;

public class numberToWords {

    public static void main(String[] args) {
        System.out.println(reverse(-8462));
        numberToWords(80000000);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int digitCount = getDigitCount(number);

        int reverse = reverse(number);
        String numbertoWords = "";
        int numberOfNonZeros = 0;

        while (reverse >= 10) {
            int lastDigit = (reverse % 10);
            if (lastDigit == 0) {
                    numbertoWords += "Zero ";
                }
            if (lastDigit == 1) {
                numbertoWords += "One ";
                numberOfNonZeros++;
            }
            if (lastDigit == 2) {
                numbertoWords += "Two ";
                numberOfNonZeros++;
            }
            if (lastDigit == 3) {
                numbertoWords += "Three ";
                numberOfNonZeros++;
            }
            if (lastDigit == 4) {
                numbertoWords += "Four ";
                numberOfNonZeros++;
            }
            if (lastDigit == 5) {
                numbertoWords += "Five ";
                numberOfNonZeros++;
            }
            if (lastDigit == 6) {
                numbertoWords += "Six ";
                numberOfNonZeros++;
            }
            if (lastDigit == 7) {
                numbertoWords += "Seven ";
                numberOfNonZeros++;
            }
            if (lastDigit == 8) {
                numbertoWords += "Eight ";
                numberOfNonZeros++;
            }
            if (lastDigit == 9) {
                numbertoWords += "Nine ";
                numberOfNonZeros++;
            }
            reverse /= 10;
        }

        if (reverse == 0) {
            numbertoWords += "Zero";
        }
        if (reverse == 1) {
            numbertoWords += "One";
            numberOfNonZeros++;
        }
        if (reverse == 2) {
            numbertoWords += "Two";
            numberOfNonZeros++;
        }
        if (reverse == 3) {
            numbertoWords += "Three";
            numberOfNonZeros++;
        }
        if (reverse == 4) {
            numbertoWords += "Four";
            numberOfNonZeros++;
        }
        if (reverse == 5) {
            numbertoWords += "Five";
            numberOfNonZeros++;
        }
        if (reverse == 6) {
            numbertoWords += "Six";
            numberOfNonZeros++;
        }
        if (reverse == 7) {
            numbertoWords += "Seven";
            numberOfNonZeros++;
        }
        if (reverse == 8) {
            numbertoWords += "Eight";
            numberOfNonZeros++;
        }
        if (reverse == 9) {
            numbertoWords += "Nine";
            numberOfNonZeros++;
        }
        if (numberOfNonZeros == digitCount) {
            System.out.println(numbertoWords);
            return;
        }
        int diffZeros = digitCount - numberOfNonZeros;
        for (int i = 1; i <= diffZeros; i++) {
            numbertoWords = numbertoWords + "Zero ";
        }
        System.out.println(numbertoWords);
    }

    public static int reverse (int number) {

        if (number < 10 && number > -10) {
            return number;
        }

        int digitCount; // digitCountMinusOne = 1
        int reversedNumber = 0;

        if (number >= 10) { // number is 13
            digitCount = getDigitCount(number);
            for (int i = digitCount - 1; i >= 0; i--) { // i = 1
                int lastDigit = (number % 10); // lastDigit = 3
                reversedNumber += lastDigit * (Math.pow(10, i)); // 30 + 1
                number /= 10;
            }
            reversedNumber += number;
            return reversedNumber;
        }

        if (number <= -10) { // -2521
            number *= -1; // 2521
            digitCount = getDigitCount(number);
            for (int i = digitCount - 1; i >= 0; i--) { // i = 1
                int lastDigit = (number % 10); // lastDigit = 1
                reversedNumber += lastDigit * (Math.pow(10, i)); // 30 + 1
                number /= 10;
            }
            reversedNumber += number;
            return reversedNumber * -1;
        }
        return -1;
    }

    public static int getDigitCount (int number) {

        int digitCount = 1;

        if (number > 0) {
            while (number / 10 > 0) {
                number /= 10;
                digitCount++;
            }
        }

        if (number < 0) {
            return -1;
        }

        return digitCount;
    }
}
