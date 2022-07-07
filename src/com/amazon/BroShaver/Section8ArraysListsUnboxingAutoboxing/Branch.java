package com.amazon.BroShaver.Section8ArraysListsUnboxingAutoboxing;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public boolean newCustomer(String name, double initialTransaction) {
        if (findCustomer(name) != null) {
            return false;
        }
        this.customers.add(new Customer(name, initialTransaction));
        return true;
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer desiredCustomer = findCustomer(name);
        if (desiredCustomer == null) {
            return false;
        }
        int indexDesired = this.customers.indexOf(desiredCustomer);
        this.customers.get(indexDesired).addTransaction(transaction);
        return true;
    }

    public Customer findCustomer(String name) {
        for (int i = 0; i < this.customers.size(); i++) {
            if (this.customers.get(i).getName().equals(name)) {
                return this.customers.get(i);
            }
        }
        return null;
    }
}
