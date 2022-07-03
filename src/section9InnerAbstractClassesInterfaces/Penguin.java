package section9InnerAbstractClassesInterfaces;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("no.");
    }
}
