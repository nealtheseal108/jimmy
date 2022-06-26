package section6OOP1;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        super(1, 1, size, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.coat = coat;
    }


    private void chew() {
        System.out.println("Dog.chew() called");
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called at a speed of " + speed);
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

    private void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        super.move(10);
    }


}

// the @Override method overrides the superclass method placed below it and instead runs other code listed in the code block of the method
// use private for subclass methods except for methods with the @Override keyword

