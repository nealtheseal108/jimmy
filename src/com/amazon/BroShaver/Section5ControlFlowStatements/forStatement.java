package com.amazon.BroShaver.Section5ControlFlowStatements;

public class forStatement {
    public static void main(String[] args) {

        /* System.out.println("$10,000 at 2% interest = " + calculateInterest(10000, 2));

        for (int i = 8; i > 1; i--) {
            System.out.println("$10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
        } */

        int numberofPrimes = 0;
        for (int i = 10; i < 100; i++) {
            if (isPrime(i) == true) {
                numberofPrimes++;
                System.out.println("Prime number: " + i + ", number of total primes found so far: " + numberofPrimes);
            }
            if (numberofPrimes == 3) {
                break;
            }
        }

    }

    /* public static double calculateInterest (double principal, double interestRate) {
        return (principal * interestRate / 100);
    } */

    public static boolean isPrime(int x) {
        if (x < 1) {
            return false;
        }
        if (x == 1) {
            return false;
        }

        int numberOfDivisors = 0;

        for (int i = x; i > 0; i--) {
            if (x % i == 0) {
                numberOfDivisors++;
            }
        }
        if (numberOfDivisors == 2) {
            return true;
        }
        return false;
    }
}

// for (init; termination condition; increment) {}
// for loop only terminates when the second condition is false
// use String.format("%2f", 1.001) to limit the printed output to two decimal places
// code in for loop executes everytime the condition is reached
// for (int i = 1; i > 7; i += 2) {
//     System.out.println(i);
// }
// output: 1       3        5