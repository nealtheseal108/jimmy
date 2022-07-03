package section9InnerAbstractClassesInterfaces;

public abstract class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return this.name;
    }
}

// abstraction is when one defines the required functionality for a class/method without implementing details
// interfaces are abstract, as they don't implement details of the functionality
// if a return type or parameter or a field of a class/method is 'List', any type of datatype that implements the 'List' interface can be used (ArrayList, LinkedList, List, Vector, etc.)
// you can also store any datatype in a List if it is not specified
// the implementation of the methods in an abstract classes is left to the classes that inherit from the abstract classes or interfaces
// classes that inherit from abstract classes must define the detailed functionality of the method in the abstract class
// you can use the 'super' keyword in classes that inherit from abstract classes, as it is still inheritance
// one can add fields, abstract methods, and regular methods in abstract classes
// you cannot directly instantiate an abstract class
// as parrots can fly but not all birds can fly, a 'Parrot' class was created (which implements the fly() method) that extends the abstract class 'Bird'