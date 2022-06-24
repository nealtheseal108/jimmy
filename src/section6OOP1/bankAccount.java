package section6OOP1;

public class bankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public bankAccount() {
        this(123456789, 123, "Jane Doe", "jane@jane.com", 123456789);
        System.out.println("Empty constructor called.");
    }

    public bankAccount(int accountNumber, double balance, String customerName, String email, int phoneNumber) {
        System.out.println("Account with constructors called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public bankAccount(int accountNumber, double balance, String customerName) {
        this(accountNumber, balance, customerName, "bob@nealsbank.com", 123456789);
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int amountDeposited) {
        this.balance += this.balance + amountDeposited;
        System.out.println("Deposit of $" + amountDeposited + " made in " + this.customerName + "'s account.");
    }

    public void withdrawFunds(int withdrawalAmount) {
        if (withdrawalAmount > this.balance) {
            System.out.println("Withdrawal of $" + withdrawalAmount + " was not processed, as only $" + this.balance + " is available for withdrawal.");
            return;
        }
        this.balance -= withdrawalAmount;
        System.out.println("Withdrawal of $" + withdrawalAmount + " was processed. Your current balance stands at $" + this.balance + ".");
    }
}
