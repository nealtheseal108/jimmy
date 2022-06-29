package section8ArraysListsUnboxingAutoboxing;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList <Double> transactions;

    public Customer(String name, double transaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        transactions.add(transaction);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }
}
