package section6OOP1;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal(1, 1, 1, 5, "Animal");

        Dog dog = new Dog(8, 20, "Yorkie", 2, 4, 1, 32, "long and silky");
        dog.eat();
        // dog.walk();
        dog.run();
    }
}
