package com.amazon.BroShaver.Section5ControlFlowStatements;

import java.util.Scanner;

public class scanner {
    /* public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        int birthYear = scanner.nextInt();
        while (birthYear > 2022 || birthYear < 1900) {
            System.out.println("Don't be a bongo. It's very unlikely that you are either 0 years old or an ultracentenarian and can use a computer.");
            System.out.println("Enter your year of birth: ");
            birthYear = scanner.nextInt();
        }

        System.out.println("Enter your name: ");
        String name = scanner.next();

        System.out.println("Your name is " + name + ", and you are " + (2022 - birthYear) + " years old if you have already had your birthday this year.");

        scanner.close();
    } */

    public static void main(String[] args) {
        printSumOfReadNumbers();
    }

    public static void printSumOfReadNumbers() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 1;

        while (counter <= 10) {
            System.out.println("Type in number #" + counter + ":");
            boolean isAnInt = scanner.hasNextInt(); // triggers the user input
            if (isAnInt) {
                int number = scanner.nextInt(); // assigns number to the user input
                sum += number; // adds the number to the sum
                counter++; // iterates the counter
                scanner.nextLine();
            } else {
                System.out.println("Invalid value");
            }
            scanner.nextLine(); // the enter key  causes the loop to iterate, discards the entered content
        }
        System.out.println("Sum of numbers entered = " + sum);
    }
}

// scanner.nextInt() parses the string entered to an int