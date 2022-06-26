package section6OOP1;

import java.util.Locale;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    public String getModel () {
        return this.model;
    }
}



// a class is like a room, and the objects in the room are like the objects in a class
// objects in a room and in programming have states and behaviors
// state defined by variables, behavior determined by methods
// a class is a template or a blueprint to create objects
// 'public class' keyword creates a class
// the 'public' keywords is an access modifier that controls the other classes' access of the defined class
// 'public' allows all classes to access the defined class
// 'private' does not allow any other class to access the defined class
// 'protected' allows classes only in the same package as the defined class to access it
// a class is like a shell in which you can define objects
// variables that are created in methods/code blocks cannot be accessed outside them
// classes allow you to create variables (fields) that are accessible anywhere in the same class
// in terms of fields, you should usually use 'private' to adhere to encapsulation
// encapsulation is used to hide fields and methods from public access, hidden from view outside of the place of the object's definition
// 'set' method initializes variables, has one parameter which is the value, can modify private fields, setter
// 'this.' keyword set the value of a field that is outside of the method
// classes need to be initialized with the new keyword, no default value is attached to them
// 'get' method returns the value of the field, getter, has no parameters
// String is a special class
// public setters and getters allow any class to get and set fields
// always set parameters after new ____(); in parenthesis
