package com.amazon.BroShaver.Section12Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TheatreMain {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Gay", 8, 12);

        printList(theatre.seats);

        theatre.reserveSeat("D12");

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(seat.getSeatNumber() + " " + seat.getPrice() + " | ");
        }
        System.out.println();
        System.out.println("============================================");
    }
}

// for (type object name of object: name list/array/data structure) = for each object of type object in list 'name', create an object of type object name 'name', and execute the below code
// a shallow copy is when one creates a new list just to replicate another one with the list constructor (both have the same reference in memory)
// a deep copy is a copy when elements are not just referencing other elements, but are actually copied
// '.compareTo()' returns > 0 when the parameter is greater than the object and 0 if the parameter is lexicographically equal to the object

