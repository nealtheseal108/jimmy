package com.amazon.BroShaver.Section5ControlFlowStatements;

public class switchStatement {
    public static void main(String[] args) {
        /*int value = 2;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }*/

        int switchValue = 1;
        switch(switchValue) { // switchValue is the variable being checked for its value
            case 1: // if switchValue == 1, execute this code
                System.out.println("Value was 1");
                break; // terminate the entire switch statement

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5: // if any of these conditions are met, run below code
                System.out.println("Was 3, 4, or 5");
                break;

            default: // if none of the above conditions were met, run below code
                System.out.println("Was not 1, 2, 3, 4, or 5");
        }

        char switchChar = 'B';
        switch(switchChar) {
            case 'A':
                System.out.println("Value was A");
                break;

            case 'B':
                System.out.println("Value was B");
                break;

            case 'C':
                System.out.println("Value was C");
                break;

            case 'D':
                System.out.println("Value was D");
                break;

            case 'E':
                System.out.println("Value was E");
                break;

            default:
                System.out.println("Value was not A, B, C, D, E");
        }

        String month = "January";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan.");
                break;
            case "june":
                System.out.println("Jun.");
                break;
            default:
                System.out.println("Not Jan. nor Jun.");
        }

    }

    public static void printDayOfTheWeek (int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Don't be a bunkalingo");
        }
    }
}


