package section7OOP2;

public class Swing {
    private boolean isSwinging;
    private String material;
    private String mainColor;
    private String accentColor;
    private String numberOfPillows;

    public Swing(boolean isSwinging, String material, String mainColor, String accentColor, String numberOfPillows) {
        this.isSwinging = isSwinging;
        this.material = material;
        this.mainColor = mainColor;
        this.accentColor = accentColor;
        this.numberOfPillows = numberOfPillows;
    }

    public void swing() {
        if (this.isSwinging) {
            System.out.println("The swing in Neal's study is already swinging.");
        } else {
            this.isSwinging = true;
            System.out.println("The swing in Neal's study is now swinging.");
        }
    }

    public boolean isSwinging() {
        return isSwinging;
    }

    public String getMaterial() {
        return material;
    }

    public String getMainColor() {
        return mainColor;
    }

    public String getAccentColor() {
        return accentColor;
    }

    public String getNumberOfPillows() {
        return numberOfPillows;
    }
}
