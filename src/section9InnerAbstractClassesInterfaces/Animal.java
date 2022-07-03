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

// 'is a' vs 'has a' relationship
// 'is a' = inheritance/abstract class inheritance

// classes can both implement an interface and extend from a superclass
// interfaces allow both more flexibility in certain actions that only pertain to certain classes
// interfaces can only have public static final variables since one needs an instance of a class to modify the fields of the class, abstract classes don't have to
// one cannot create an instance of an interface nor an abstract class
// interfaces cannot have constructors, abstract classes can
// all methods defined in an interface must be public, any access modifiers apply in the case of an abstract class
// abstract classes can have methods with more than just a signature (implementation details can be included)
// all methods in interfaces are abstract, not all methods in an abstract class are abstract
// an abstract class can extend only one parent class but can implement multiple interfaces
// if a subclass of an abstract does not provide implementation for all the methods in the superclass, the subclass must be abstract as well

// use an abstract class when you want to share code among closely related classes
// when you expect subclasses of your abstract class to have many common methods/fields or if they require different access modifiers
// when you want some methods to be abstract and some to not be abstract in the abstract class
// when you want to declare non-static/non-final fields
// when you've got a requirement for your base class to provide a basic implementation of certain methods but certain methods should be overridden by child classes
// the purpose of an abstract class is to provide a common definition of a base class that multiple derived classes can share

// an interface is just the declaration of methods of another class (maybe implementation)
// interfaces form a contract between classes and the outside world, and this contract is enforced at build time by the compiler
// interfaces may contain methods with or without implementation
// all methods in interfaces are automatically public and abstract
// interfaces are more flexible and can deal with a lot more stress on the design of your program rather than the implementation
// interfaces introduce points of variation at which you can plug in different implementations for the interface methods
// an interface's primary purpose is abstraction; it decouples the "what" from the "how" in functionality
// an interface's methods can be private apparently(?)

// use an interfaces when you expect that multiple unrelated classes will implement your interface
// for example, the interfaces 'Cloneable' and 'Comparable' are implemented by many classes without any relation to each other
// when you want to specify the behavior of a certain datatype, but you're not concerned about who implements its behavior
// when you want to seperate different behavior