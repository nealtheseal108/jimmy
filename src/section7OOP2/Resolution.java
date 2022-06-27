package section7OOP2;

public class Resolution {
    private int widthInPixels;
    private int heightInPixels;

    public Resolution(int widthInPixels, int heightInPixels) {
        this.widthInPixels = widthInPixels;
        this.heightInPixels = heightInPixels;
    }

    public int getWidthInPixels() {
        return widthInPixels;
    }

    public int getHeightInPixels() {
        return heightInPixels;
    }
}
