package section8ArraysListsUnboxingAutoboxing;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    private static Scanner scanner = new Scanner(System.in);
    public static int[] getIntegers(int elements) {
        int[] numbers = new int[elements];
        for (int i = 0; i < elements; i++) {
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return numbers;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int iElement = array[i];
                    int jElement = array[j];
                    array[i] = jElement;
                    array[j] = iElement;
                }
            }
        }
        return array;
    }
}
