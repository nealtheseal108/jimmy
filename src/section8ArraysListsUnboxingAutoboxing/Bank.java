package section8ArraysListsUnboxingAutoboxing;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String name) {
        if (findBranch(name) != null) {
            return false;
        }
        this.branches.add(new Branch(name));
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        if (findBranch(branchName) == null) {
            return false;
        }
        Branch branch = findBranch(branchName);
        int brIndex = this.branches.indexOf(branch);
        if (branch.findCustomer(customerName) != null) {
            return false;
        }
        this.branches.get(brIndex).getCustomers().add(new Customer(customerName, initialTransaction));
        return true;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        int brIndex = this.branches.indexOf(branch);
        if (findBranch(branchName) == null) {
            return false;
        }
        if (this.branches.get(brIndex).findCustomer(customerName) == null) {
            return false;
        }
        this.branches.get(brIndex).addCustomerTransaction(customerName, transaction);
        return true;
    }

    private Branch findBranch(String name) {
        for (int i = 0; i < this.branches.size(); i++) {
            if (this.branches.get(i).getName().equals(name)) {
                return this.branches.get(i);
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean shouldPrintTransactions) {
        if (findBranch(branchName) == null) {
            return false;
        }
        Branch branch = findBranch(branchName);
        int brIndex = this.branches.indexOf(branch);
        if (shouldPrintTransactions) {
            System.out.println("Customer details for branch " + branchName);
            for (int i = 0; i < this.branches.get(brIndex).getCustomers().size(); i++) {
                System.out.println("Customer: " + this.branches.get(brIndex).getCustomers().get(i).getName() + "[" + (int)(i + 1) + "]");
                System.out.println("Transactions");
                for (int j = 0; j < this.branches.get(brIndex).getCustomers().get(i).getTransactions().size(); j++) {
                    System.out.println("[" + (int)(j + 1) + "] Amount " + this.branches.get(brIndex).getCustomers().get(i).getTransactions().get(j));
                }
            }
        }
        if (!shouldPrintTransactions) {
            System.out.println("Customer details for branch " + branchName);
            for (int i = 0; i < this.branches.get(brIndex).getCustomers().size(); i++) {
                System.out.println("Customer: " + this.branches.get(brIndex).getCustomers().get(i) + "[" + (int) (i + 1) + "]");
            }
        }
        return true;
    }
}
