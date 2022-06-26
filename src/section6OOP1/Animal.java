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

    public void move(int speed) {
        System.out.println("Animal.move() called. Animal is moving at " + speed + " speed");
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
// super.methodName() calls the method methodName in the parent class

// analogy: a class is a blueprint for the behaviors and states of a house
// each time you build a house, you instantiate the instance, and the new house is known as an object
// each house you build has an address, and you reference the house with a copy of the address, not the house itself
// we can pass reference as parameters to constructors and methods
// Animal is actually a datatype, and the name of the variable is 'animal'
// use 'animal' to reference to the Animal variable called 'animal'
// 'super.' is used to access/call/assign the parent class's fields and methods
// 'this.' is used to access/call/assign the current class's fields and methods
// we can use both anywhere in a class except for static areas
// 'this()' is used to call a constructor from another overloaded constructor in the same class, used in constructor chaining
// 'super()' is used to call parent constructors
// the Java compiler automatically inserts a default call to 'super()' if we don't add it, it is the no-args super
// 'super()' and 'this()' must be the first respective statements in a constructor
// method overloading means defining two or more methods in a class or of its inherited subclass with the same name but different parameters
// "compile time polymorphism"
// method overriding means defining an inherited method in a child class that already exists in the parent class with the same name and parameters and return type, and the child class cannot have a lower access modifier, '@Override'
// you can only override instance methods

// a constructor is used to assign and access fields for a class
// encapsulation deals with scope of fields/ private, public, access modifiers, etc.
// 'this.' is used to assign values to fields that are outside of the method but inside the class
// 'super.' is used to assign values to fields in a superclass and call superclass methods
// 'this()' is used to assign values to fields in the current class, calls another (usually default) constructor
// 'super()' is used to assign values to fields in a superclass
// constructors or private classes cannot be overridden
// use 'super.methodName' to call a superclass overridden method in a subclass

// static methods are declared with a static modifier
// static methods cannot access instance methods and instance variables directly
// they are used for operations that do not require any data from an instance of a class (ex: 'this', 'super'); the 'this' keyword is the current instance of a class
// static methods are called as 'ClassName.methodName()' in a different class or 'methodName()' in the same class
// instance methods belong to an instance of a class, to use these, we have to instantiate the class using the new keyword
// a method should be static if it doesn't use any fields or instance methods
// static variables are also known as static member variables
// every instance of that static class shares the same variables
// if changes are made to those variables, all classes that use those variables will be affected
// static variables are changed between instances
// instance variables are known as member variables or fields
// each instance of a class has its own copy of an instance variable
// each instance can have a different value
// these variables represent the state a variable pertaining to the instance of the class
// all classes in Java extend from the 'java.lang.object" class, and they inherit objects/methods from that class


