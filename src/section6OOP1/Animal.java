package section6OOP1;

public class Animal {
    private int brain;
    private int body;
    private int size;
    private int weight;
    private String name;

    public Animal(int brain, int body, int size, int weight, String name) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;
    }

    public void eat() {
        System.out.println("Animal.eat() called");
    }

    public void move() {
        System.out.println("Animal.move() called");
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}

// physical objects IRL share similar characteristics
// a Mac, a tablet, and a laptop all share characteristics of computers, all have RAM, on/off states
// each device adds different features to make them distinct and specialized, different CPUs, GPUs, OSs
// all animals share certain behaviors and states, they all eat and move and need energy, they all have a size and weight
// only some animals have eyes, legs, and a brain
// a Dog (sub-class) inherits its traits (fields) from its parent characterization (parent class) Animal
// use 'extends' keywords to create a sub-c;ass of a parent class
// super calls the constructor and imports the fields of a class's parent class
// Dog is part of the Animal class
// we can add features and fields to the Dog class to specialize its "use case"
// the Dog class can also inherit its behaviors (methods) from the Animal class
// you can remove a parameter in a sub-class constructor and define the field in the super() keyword
// use 'this.' keyword to assign values to local fields in a constructor
// use @Override keyword to have sub-class override certain methods from its parent class
// super.methodName() calls the method methodNmae in the parent class
