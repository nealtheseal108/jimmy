package section9InnerAbstractClassesInterfaces;

public class Gearbox {
    private boolean clutchIsIn;

    public void operateClutch (boolean inOrOut) {
        this.clutchIsIn = inOrOut;
    }
}

// an interface specifies methods that a particular class that implements the interface must implement
// the interface that one is creating is abstract, meaning that there is no code for any of the methods
// one only supplies the method names and the parameters, code goes in the created class
// you can use an interface to have multiple classes have a common behavior by implementing the same interface
// this standardizes the way a set of classes are utilized
// if a method is reliant on another and the latter modifies its parameters/return type, etc., the former method no longer functions as specified and has to be changed
//