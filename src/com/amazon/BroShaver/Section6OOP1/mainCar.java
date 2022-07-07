package com.amazon.BroShaver.Section6OOP1;

public class mainCar {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}

// the new object defined of type 'Car' is called porsche
// when one types 'porsche.', methods that Java created are exemplified; these are inherited form a base Java class
