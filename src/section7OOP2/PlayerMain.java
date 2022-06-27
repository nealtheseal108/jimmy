package section7OOP2;

import java.io.Closeable;

public class PlayerMain {
    public static void main(String[] args) {
       EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim", 110, "Sword");
       System.out.println("Initial health is " + enhancedPlayer.getHealth());
    }
}

// encapsulation deals with classes' and methods' abilities to change fields
// if a field is private or protected, other classes and methods cannot directly change fields
// the only way to access and assign values to variables is through methods and constructors
// giving control to the 'EnhancedPlayer' class, not classes outside of it
// encapsulation eliminates unauthorized access from other classes
