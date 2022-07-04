package section10JavaGenerics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for (int i : n) {
            System.out.println(i * 2);
        }
    }
}

// Generics means parameterized types
// The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces
// Using Generics, it is possible to create classes that work with different data types
// in Java, the ':' operator represents 'for each'
// 'uses unsafe or unchecked operations' warning means that one's code might throw an error when executed
//  List is naturally a generic type
// it is recommended to not utilize raw types in your code
// when one provides a type parameter to a generic type (using <>), it is called a parameterized type
// one doesn't need a second declaration for the parameterized type
// the earlier a bug is spotted in the code, the easier it is to fix