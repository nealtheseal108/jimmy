package com.amazon.BroShaver.Section12Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();
        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + "cubes.");

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);

        System.out.println("The unionized HashSet of squares and cubes contains " + union.size() + " elements.");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + "elements.");

        for (int i: intersection) {
            System.out.println(i + " is the square of " + (int)Math.sqrt(i) + " and the cube of " + (int) Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String arrayWords[] = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for (String s: words) {
            System.out.println(s);
        }
    }
}

// whereas a List is an ordered Collection of items that can contain duplicates, a Set has no defined order (defined as chaotic) and cannot contain duplicates
// the Set interfaces utilizes generics just like any other Collection
// '.add()', '.remove()', 'clear()'.size()', '.isEmpty()', and '.contain()' applies to the Set interface; there is no way to retrieve the nth item from a set; one has to iterate through the Set to find an item
// using immutable objects can cause problems in a Set; same with storing a Set in itself
// the best-known implementation of the Set interface is the HashSet class, which uses hashes and a HashMap to store the items
// whenever an element is added to a HashSet, the object becomes a key in the internal HashMap
// whenever an element is added to a HashSet, Java checks whether it is equal to an object already in the Set using the '.equals()' method, which checks equalities using the hashcode of the object
// however, if one field of two compared objects are equal and the other(s) are not, they will return different hashcodes, causing them both to be present in Set
// this might be an inadvertent consequence of Java utilizing '.equals()' (which uses 'hashCode()') to compare objects
// nonetheless, we can override the '.hashCode()' method for a class to return the hashcode value of only one field of the object (and adding an integer to make sure the returned value is not zero)
// the '.addAll()' method adds all the items of one set to another
// note that for each 'HeavenlyBody' in this class, only one object in memory exists, but there are multiple references to each one at different points in the code
// note that for an object to be deemed as "repeated" by a Set, all objects within the object must be identical to its counterpart
// one can overwrite the '.equals()' method for this
// when storing object in "'Hash' Collections, the hashcode of the object determines which "bucket" an object will go into
// any objects that are equal will ultimately have the same hashcode, and thus will go into the same bucket
// if two objects belong to the same bucket than an '.equals()' comparison will return 'true'
// but a '.equals()' comparison returning 'true' doesn't necessarily mean that the two objects belong to the same bucket, as ultimately only deals with if the two objects reference the same object in memory
// if a duplicate object has a different hashcode than the original, it will be added to the Collection
// if we try to iterate through the data structure and remove the duplicate, we might end up finding the original first and removing that one
// this is why there needs to be a strict relationship between the hashcode and the '.equals()' method in certain circumstances
// this is why we override them in certain cases
// we also have to override '.equals()' to only check for that single field
// 's1.contains(s2)' returns 'true' only if all the elements of s2 are present in s1 (if s2 is a subset of s1)
// 's1.addAll(s2)' transforms s1 into the union of s1 and s2
// 's1.retainAll(s2)' transforms s1 into the intersection of s1 and s2 (only retains the elements that are shared between the two sets)
// 's1.removeAll(s2)' transforms s1 into the asymmetric set difference of s1 and s2 (only retains the elements that are present in s1 but not s2)
// the 'Arrays.asList(arr)' method converts an array to a List