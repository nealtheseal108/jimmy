package com.amazon.BroShaver.Section8ArraysListsUnboxingAutoboxing;

import java.util.Arrays;
public class ReversedArray {
    private static void reverse (int[] array) {
        System.out.print("Array = [");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
        if (array.length % 2 == 0) {
            for (int i = 0; i < (array.length / 2); i++) {
                int first = array[i];
                int last = array[array.length - i - 1];
                array[i] = last;
                array[array.length - i - 1] = first;
            }
        }

        if (array.length % 2 == 1) {
            for (int i = 0; i < (array.length / 2 + 1); i++) {
                int first = array[i];
                int last = array[array.length - i - 1];
                array[i] = last;
                array[array.length - i - 1] = first;
            }
        }

        System.out.print("Reversed array = [");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1] + "]");
    }
}
