package section7OOP2;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("deluxe burger", "black bean patty", 19.10, "whole wheat");
        System.out.println("Added chips for $1.99.");
        System.out.println("Added a drink for $2.12.");
        itemizeHamburger();
    }

    @Override
    public void addHamburgerAddition1 (String name, double price) {
        System.out.println("You cannot add any sides or topping to complement a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition2 (String name, double price) {
        System.out.println("You cannot add any sides or topping to complement a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition3 (String name, double price) {
        System.out.println("You cannot add any sides or topping to complement a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition4 (String name, double price) {
        System.out.println("You cannot add any sides or topping to complement a deluxe burger.");
    }


}
