package section6OOP1;

public class Tesla extends CarHighLevel {
    private char teslaModel;
    private int milesPerCharge;
    private int touchscreenWidth;
    private boolean isInRainbowRoadMode;
    private boolean isInSantaSleighMode;
    private int currentPercentCharge;
    private int currentRemainingMileage;

    private boolean isInAutosteerMode;

    public Tesla(int height, int weight, int maxSpeedInMPH, String mediumOfTravel, boolean hasAnEngine, int numberOfGears, int wheels, String typeOfSteeringWheel, int trunkSpaceInCUFT3, boolean hasASunroof, int numberOfDoors, String model, String engine, String color, int turnDegree, int currentGear, int currentSpeed, char teslaModel, int milesPerCharge, int touchscreenWidth, boolean isInRainbowRoadMode, boolean isInSantaSleighMode, int currentPercentCharge, int currentRemainingMileage, boolean isInAutosteerMode) {
        super(height, weight, maxSpeedInMPH, true, 5, mediumOfTravel, hasAnEngine, numberOfGears, wheels, typeOfSteeringWheel, trunkSpaceInCUFT3, hasASunroof, numberOfDoors, model, engine, color, turnDegree, currentGear, currentSpeed);
        this.teslaModel = teslaModel;
        this.milesPerCharge = milesPerCharge;
        this.touchscreenWidth = touchscreenWidth;
        this.isInRainbowRoadMode = isInRainbowRoadMode;
        this.isInSantaSleighMode = isInSantaSleighMode;
        this.currentPercentCharge = currentPercentCharge;
        this.currentRemainingMileage = milesPerCharge * currentGear / 100;
        this.isInAutosteerMode = isInAutosteerMode;
    }

    public void enableAutosteer() {
        if (isInAutosteerMode) {
            System.out.println("Your Tesla Model " + Character.toUpperCase(this.teslaModel) + " is already in Autosteer mode.");
            return;
        }
        this.isInAutosteerMode = true;
    }

    public void enableRainbowRoadMode () {
        if (isInAutosteerMode) {
            System.out.println("Your Tesla Model " + Character.toUpperCase(this.teslaModel) + " is already in Rainbow Road mode. Make sure to not speed to get that ever-illustrious first place!");
            return;
        }
        this.isInRainbowRoadMode = true;
    }

    public void enableSantaSleighMode () {
        if (isInSantaSleighMode) {
            System.out.println("Your Tesla Model " + Character.toUpperCase(this.teslaModel) + " is already in Santa's Sleigh mode. Happy holidays!");
            return;
        }
        this.isInSantaSleighMode = true;
    }
}
