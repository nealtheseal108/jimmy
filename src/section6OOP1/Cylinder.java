package section6OOP1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

}
