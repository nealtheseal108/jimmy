package section5ControlFlowStatements;

import java.util.Scanner;

public class inputCalc {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;

        while (scanner.hasNextInt()) { // used to check if the next token in this scanner's input can be interpreted as an int value using the nextInt() method
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                counter++;
                scanner.nextLine();
            }
        }

        double avg = (double)sum / (double)counter;
        long average = Math.round(avg);
        System.out.println("SUM = " + (sum) + " AVG = " + (average));

    }
}
