package com.amazon.BroShaver.Section8ArraysListsUnboxingAutoboxing;

import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int elements = readInteger();
        System.out.println(elements);
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                i = scanner.nextInt();
                break;
            } else {
                scanner.nextLine();
            }
        }
        return i;
    }

    private static int[] readElements(int elements) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[elements];
        for (int i = 0; i < elements; i++) {
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return numbers;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        boolean isEqual = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

