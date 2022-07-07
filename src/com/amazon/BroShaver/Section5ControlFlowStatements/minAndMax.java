package com.amazon.BroShaver.Section5ControlFlowStatements;

import java.util.Scanner;

public class minAndMax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;

        while(true) { // infinite loop
            System.out.println("Enter a number: "); // while the loop isn't broken the statement is printed
            boolean isAnInt = scanner.hasNextInt(); // checks next input
            if (isAnInt) { // if the input is an int
                int number = scanner.nextInt();
                if (number > max) {
                    max = number;
                    continue;
                }
                if (number < min) {
                    min = number;
                    continue;
                }
                scanner.nextLine(); // discards previous inputs
            } else {
                System.out.println("The max value was " + max + " and the min value was " + min);
                return;
            }
        }




    }
}

// scanner.hasNextInt() triggers a query for user input