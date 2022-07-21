package com.amazon.BroShaver.Section12Collections;

import java.util.*;

public class Theatre {
    private final String theatreName;
    public   List<Seat> seats = new ArrayList<>();

    static final Comparator<Seat> PRICE_ORDER = new Comparator<>() { // anonymous inner class
        @Override
        public int compare(Seat seat1, Seat seat2) {
            if (seat1.getPrice() < seat2.getPrice()) {
                return -1;
            } else if (seat1.getPrice() == seat2.getPrice()) {
                return 0;
            } else {
                return 1;
            }
        }
    };

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                double price = 12;
                if (row < 'D' && (seatNum >= 4 && seatNum <= 9)) {
                    price = 14;
                } else if (row > 'F' || (seatNum < 4 || seatNum > 9)) {
                    price = 7;
                }
                Seat seat = new Seat (row + String.format("%02d", seatNum), price);
                this.seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber,  0);
        int foundSeat = Collections.binarySearch(this.seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return this.seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
    }

    public Collection<Seat> getSeats() {
        return this.seats;
    }

    class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat number " + getSeatNumber() + " reserved.");
                return true;
            } else {
                return false;
            }
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Your reservation for seat number " + getSeatNumber() + " was canceled.");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }
    }
}

// Java's 'Collections' framework includes Lists, Sets, Maps, Trees, Queue, Deque, etc.
// at the top-level of the 'Collections' framework is the 'Collections' class
// this exposes static methods that return primitive and wrapper types and 'Collections' types
// the interfaces in the framework allow the framework to be extended
// they define a lot of the fundamental operations of various 'Collections' types
// good interoperability between 'Collection' types
// if the 'Collection<>' class is used, the 'new' keyword can apply to any data structure inside the 'Collection' class
// concrete class = classes that have implementation details in all methods
// as we move down the hierarchy of 'Collection' data structure, they become more and more specialized
// we can only replace classes with other classes that implement one of the core 'Collection' interfaces and the same level as the replaced data structure
// a 'Set' is a special type of 'Collection', a 'SortedSet' is a special type of 'Set', and so on
// the '.binarySearch()' List method is the fastest way to find an item because it recursively splits an ordered list into two based on if the 'compareTo()' method returns less than or more than 0
// the '.sort()' and 'reverseSort()' methods are also useful in sorting lists
// to use any sort or search methods in the Collections class, the 'Comparator' interface must be implemented
// the '.shuffle()' method shuffles the elements in a list in a random order
// the '.min()' and .max()' methods returns the respective minimum and maximum elements in a list
// the '.swap()' method swaps two elements in a list

// the '.copy()' method takes two parameters (the destination which has to be of a generic type that is a superset of the source list type and source list)
// this method will fail unless the size of the destination is big enough to hold all the elements to be copied
// one can't just create a destination list to mimic the size of the source and copy it in with the method since the dest. will have no value and so will not actually be the specified size i nmemory
// one needs to fill the dest. with the required amount of objects

// '.compareTo()' returns > 0 when the parameter is greater than the object and 0 if the parameter is lexicographically equal to the object

// the 'Comparator' interface defines a single '.compare()' method called compare which creates an object of type 'Comparator' that can sort the objects we are interested in
// more than one 'Comparator' can be created which allows for sorting flexibility


