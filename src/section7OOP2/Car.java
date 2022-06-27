package section7OOP2;

public class Car extends Vehicle {
    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}

// composition deals with a 'has a' relationship
// computer has a motherboard, case, monitor
// computer is composed of the aforementioned

