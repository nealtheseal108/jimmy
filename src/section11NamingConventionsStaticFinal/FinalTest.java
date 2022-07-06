package section11NamingConventionsStaticFinal;

public class FinalTest {

    private static int classCounter = 0;
    private final int instanceNumber;
    private final String name;
    public FinalTest(String name) {
        classCounter++;
        instanceNumber = classCounter;
        this.name = name;
        System.out.println(name + " created; it was FinalTest instance #" + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }

    public String getName() {
        return name;
    }
}

// final fields are not absolute constants
// they can be modified once before the constructor of the class they are within terminates (in the constructor code block)
// but for this to happen, they cannot be assigned a value prior to the constructor code block commences
// one reason why one might want to declare the value of a final field in the constructor is if the value depends on other code (a method from another class)
// when reading a record from a database, one might want to store the database key as a final field
// one cannot change the value of a final field once the instance of the class it belongs to is instantiated
// constants should be declared as static final so that they belong to the class itself and cannot be changed at all
// if the keyword 'final' is used on a class, the aforementioned cannot be extended
// if the keyword 'final' is used on a class, the aforementioned cannot be overridden by child classes
