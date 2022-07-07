package com.amazon.BroShaver.Section5ControlFlowStatements;

public class whileStatement {
    public static void main(String[] args) {
        /* int count = 1;
         while (count != 6) {
            System.out.println("Value of count is " + count + ".");
            count++;
        }

        count = 1;

        while(true) {
            if (count == 6) {
                 break;
            }
            System.out.println("Value of count is " + count + ".");
            count++;
        }

        do {
            System.out.println("Value of count is " + count + ".");
            count++;
        } while(count != 6); */

        int number = 4;
        int finishNumber = 20;
        int amountOfEvens = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            amountOfEvens++;
            System.out.println("Even number found: " + number);
            if (amountOfEvens == 5) {
                System.out.println("5 even numbers found.");
                break;
            }
        }
    }

    public static boolean isEvenNumber(int x) {
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }
}

// while loop executes while a statement is true, the condition is checked before executing
// do while executes code before condition is checked
// continue directly repeats the while/for/do while loop by bypassing the remaining code in the loop
//
