package com.amazon.BroShaver.Section7OOP2;

public class MainPC {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("p32-20", "Lenovo", 32, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("P-390", "ASUS", 4, 4, "Version 2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

    }
}

//  thePC.getMonitor().drawPixelAt(1, 1, "green") calls the 'getMonitor()' method to reference the 'monitor' object in the 'thePC' class to invoke the 'drawPixelAt()' method