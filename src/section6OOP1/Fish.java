package section6OOP1;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(int size, int weight, String name, int gills, int eyes, int fins) {
        super(1, 1, size, weight, name);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {
        System.out.println("Fish.rest() called");
    }

    @Override
    public void move(int speed) {
        swim(speed);
        super.move(speed);
    }

    private void swim(int speed) {
        System.out.println("Fish.swim() called");
        moveMuscles();
        moveBackFin();
    }

    private void moveMuscles() {
        System.out.println("Fish.moveMuscles() called");
    }

    private void moveBackFin() {
        System.out.println("Fish.moveBackFin() called");
    }
}
