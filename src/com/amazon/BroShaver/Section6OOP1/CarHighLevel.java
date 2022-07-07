package com.amazon.BroShaver.Section6OOP1;

public class CarHighLevel extends Vehicle {
    public int numberOfGears;
    public int wheels;
    public String typeOfSteeringWheel;
    public int trunkSpaceInCUFT3;
    public boolean hasASunroof;
    public int numberOfDoors;
    public String model;
    public String engine;
    public String color;
    public int turnDegree;

    public int currentGear;

    public int currentSpeed;

    public CarHighLevel(int height, int weight, int maxSpeedInMPH, boolean isElectric, int amountOfPassengers, String mediumOfTravel, boolean hasAnEngine, int numberOfGears, int wheels, String typeOfSteeringWheel, int trunkSpaceInCUFT3, boolean hasASunroof, int numberOfDoors, String model, String engine, String color, int turnDegree, int currentGear, int currentSpeed) {
        super(height, weight, maxSpeedInMPH, isElectric, amountOfPassengers, mediumOfTravel, hasAnEngine);
        this.numberOfGears = numberOfGears;
        this.wheels = wheels;
        this.typeOfSteeringWheel = typeOfSteeringWheel;
        this.trunkSpaceInCUFT3 = trunkSpaceInCUFT3;
        this.hasASunroof = hasASunroof;
        this.numberOfDoors = numberOfDoors;
        this.model = model;
        this.engine = engine;
        this.color = color;
        this.turnDegree = turnDegree % 360;
        this.currentGear = currentGear;
        this.currentSpeed = currentSpeed;
    }

    public void turn(int turnDegree) {
        this.turnDegree = ((this.turnDegree + turnDegree) % 360);
        System.out.println(this.model + " turned " + turnDegree + "." + this.model + " is currently positioned at " + this.turnDegree + " from the east.");
    }

    public void changeGear(int newGear) {
        if (newGear > this.numberOfGears || newGear < 1) {
            System.out.println("Please don't break the gear mechanism in your " + this.model + ". Try calling this function again to change the gear.");
            return;
        }
        int previousGear = this.currentGear;
        this.currentGear = newGear;
        System.out.println("Changed the gear of your " + model + " to " + newGear + " from gear " + previousGear + " to gear " + this.currentGear);
        return;
    }

    public void accelerate(int accelerationValueInMPH) {
        if (accelerationValueInMPH < 1) {
            System.out.println("You are either attempting to remain at the speed you are already traveling at or decelerate your " + this.model + ". Use the CarHighLevel.decelerate() function to decelerate your car.");
            return;
        }
        int newSpeed = this.currentSpeed + accelerationValueInMPH;
        int previousSpeed = this.currentSpeed;
        this.currentGear += accelerationValueInMPH;
        System.out.println("Accelerated your " + this.model + " from " + previousSpeed + " to " + this.currentSpeed + " MPH.");
        return;
    }

    public void decelerate(int decelerationValueInMPH) {
        if (decelerationValueInMPH > 1) {
            System.out.println("You are either attempting to remain at the speed you are already traveling at or accelerate your " + this.model + ". Use the CarHighLevel.accelerate() function to accelerate your car.");
            return;
        }
        int newSpeed = this.currentSpeed - decelerationValueInMPH;
        int previousSpeed = this.currentSpeed;
        this.currentGear += decelerationValueInMPH;
        System.out.println("Decelerated your " + this.model + " from " + previousSpeed + " to " + this.currentSpeed + " MPH.");
        return;
    }


}
