package com.amazon.BroShaver.Section7OOP2;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price = 0;
    private double addition2Price = 0;
    private double addition3Price = 0;
    private double addition4Price = 0;

    public void addHamburgerAddition1 (String name, double price) {
        if (price <= 0) {
            System.out.println("We will not pay you to eat our food. Sorry, mate.");
            return;
        }
        this.addition1Price = price;
        this.addition1Name = name;
        System.out.println("Added " + name + " for an extra $" + price + ".");

    }

    public void addHamburgerAddition2 (String name, double price) {
        if (price <= 0) {
            System.out.println("We will not pay you to eat our food. Sorry, mate.");
            return;
        }
        this.addition2Price = price;
        this.addition2Name = name;
        System.out.println("Added " + name + " for an extra $" + price + ".");

    }

    public void addHamburgerAddition3 (String name, double price) {
        if (price <= 0) {
            System.out.println("We will not pay you to eat our food. Sorry, mate.");
            return;
        }
        this.addition3Price = price;
        this.addition3Name = name;
        System.out.println("Added " + name + " for an extra $" + price + ".");

    }

    public void addHamburgerAddition4 (String name, double price) {
        if (price <= 0) {
            System.out.println("We will not pay you to eat our food. Sorry, mate.");
            return;
        }
        this.addition4Price = price;
        this.addition4Name = name;
        System.out.println("Added " + name + " for an extra $" + price + ".");

    }

    public double itemizeHamburger() {
        double totalPrice = this.price;
        if (this.addition1Name != null) {
            totalPrice += addition1Price;
        }
        if (this.addition2Name != null) {
            totalPrice += addition2Price;
        }
        if (this.addition3Name != null) {
            totalPrice += addition3Price;
        }
        if (this.addition4Name != null) {
            totalPrice += addition4Price;
        }
        return totalPrice;
    }
}
