package com.amazon.BroShaver.Section8ArraysListsUnboxingAutoboxing;

public class CustomerMain {
    public static void main(String[] args) {
        Customer1 customer1 = new Customer1("Tim", 54.96);
        Customer1 anotherCustomer1;
        anotherCustomer1 = customer1;
        anotherCustomer1.setBalance(12.18);
        System.out.println("Balance for customer " + customer1.getName() + " is " + customer1.getBalance());
    }
}

// when 'anotherCustomer1' was "assigned" to 'customer1', Java only created a pointer to 'customer1'
// Java didn't actually create an instance of 'Customer' called 'anotherCustomer1'
// Java assigned 'anotherCustomer1' to the memory address of 'customer1'
// when the 'setBalance' method changed the balance of 'anotherCustomer1', it changed the balance of the reference, so both "instances" were affected
