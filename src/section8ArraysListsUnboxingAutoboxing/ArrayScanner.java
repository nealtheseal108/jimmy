package section8ArraysListsUnboxingAutoboxing;

import java.util.Scanner;

public class ArrayScanner {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myInts = getIntegers(5);
        for (int i = 0; i < myInts.length; i++) {
            System.out.println("Element #" + (i + 1) + " in myIntArray is " + myInts[i]);
        }
        getAverage(myInts);
    }

    public static int[] getIntegers(int elements) {
        int[] numbers = new int[elements];
        for (int i = 0; i < elements; i++) {
            System.out.println("Enter your value for index #" + i + ": ");
            if (scanner.hasNextInt()) {
                numbers[i] = scanner.nextInt();
            } else {
                i--;
                System.out.println("Please enter an integer.");
            }
            scanner.nextLine();
        }
        return numbers;
    }

    public static double getAverage(int[] array) {
        double count = 0;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
            sum += array[i];
        }
        System.out.println("The average of the elements of your parsed array is " + sum / count + ".");
        return sum / count;
    }
}
