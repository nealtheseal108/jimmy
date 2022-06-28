package section7OOP2;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price = 0;
    private double healthyExtra2Price = 0;

    public HealthyBurger(String meat, double price) {
        super("bob", meat, price, "wheat");
    }



    public void addHealthyAddition1(String name, double price) {
        if (price <= 0) {
            System.out.println("We will not pay you to eat our food. Sorry, mate.");
            return;
        }
        System.out.println("Added " + name + " for an extra $" + price + ".");
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        if (price <= 0) {
            System.out.println("We will not pay you to eat our food. Sorry, mate.");
            return;
        }
        System.out.println("Added " + name + " for an extra $" + price + ".");
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            totalPrice += this.healthyExtra1Price;
        }
        if (this.healthyExtra2Name != null) {
            totalPrice += this.healthyExtra2Price;
        }
        return totalPrice;
    }

}
