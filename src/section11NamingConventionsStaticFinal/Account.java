package section11NamingConventionsStaticFinal;

import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now " + this.balance + ".");
        } else {
            System.out.println("Please use the withdraw() method to withdraw funds from your account.");
            return;
        }
    }

    public void withdraw(int amount) {
        int withdrawal = -amount;
        if (withdrawal < 0) {
            this.transactions.add(withdrawal);
            this.balance -= amount;
            System.out.println("Withdrew " + amount + " from your account. Balance is now " + this.balance + ".");
        } else {
            System.out.println("Please enter a negative integer for the amount you want to withdraw.");
            return;
       }
    }

    public void calculateBalance() {
        this.balance = 0;
        for (int i = 0; i < this.transactions.size(); i++) {
            this.balance += this.transactions.get(i);
        }
        System.out.println("Current balance is" + this.balance + ".");
    }
}
