package section6OOP1;

public class vipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public vipCustomer() {
        this("Jane Doe", 100.00, "jane@jane.com");
    }

    public vipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "jane@jane.com");
    }

    public vipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

}
