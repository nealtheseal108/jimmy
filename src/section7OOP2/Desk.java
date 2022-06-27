package section7OOP2;

public class Desk {
    private String counterMaterial;
    private String legsMaterial;
    private boolean isMaskReady;
    private boolean isClean;
    public static DeskPositionRelativeToCornerInInches deskPositionRelativeToCornerInInches;

    public Desk(String counterMaterial, String legsMaterial, boolean isMaskReady, boolean isClean, DeskPositionRelativeToCornerInInches deskPositionRelativeToCornerInInches) {
        this.counterMaterial = counterMaterial;
        this.legsMaterial = legsMaterial;
        this.isMaskReady = isMaskReady;
        this.isClean = isClean;
        this.deskPositionRelativeToCornerInInches = deskPositionRelativeToCornerInInches;
    }

    public void clean() {
        if (this.isClean) {
            System.out.println("Neal's desk is already clean. No need to clean it again.");
        } else {
            this.isClean = true;
            System.out.println("Neal's desk is now clean.");
        }
    }

    public void moveDesk(int x, int y) {
        if (x > 0 || y > 0) {
            System.out.println("Imagine the room as the third quadrant of a graph. The desk is already in the right corner of the room. Therefore, you cannot move the desk forward with a positive y-value or to the right with a positive x-value.");
            return;
        } else {
            deskPositionRelativeToCornerInInches.x -= x;
            deskPositionRelativeToCornerInInches.y -= y;
        }

    }

    public String getCounterMaterial() {
        return counterMaterial;
    }

    public String getLegsMaterial() {
        return legsMaterial;
    }

    public boolean isMaskReady() {
        return isMaskReady;
    }

    public boolean isClean() {
        return isClean;
    }
}
