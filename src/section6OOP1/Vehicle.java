package section6OOP1;

public class Vehicle {
    public int heightInCM;
    public int weightInKG;
    public int maxSpeedInMPH;
    public boolean isElectric;
    public int amountOfPassengers;
    public String mediumOfTravel;
    public boolean hasAnEngine;

    public Vehicle(int height, int weight, int maxSpeedInMPH, boolean isElectric, int amountOfPassengers, String mediumOfTravel, boolean hasAnEngine) {
        this.heightInCM = height;
        this.weightInKG = weight;
        this.maxSpeedInMPH = maxSpeedInMPH;
        this.isElectric = isElectric;
        this.amountOfPassengers = amountOfPassengers;
        this.mediumOfTravel = mediumOfTravel;
        this.hasAnEngine = hasAnEngine;
    }

    public Vehicle() {
        this.heightInCM = 100;
        this.weightInKG = 25;
        this.maxSpeedInMPH = 60;
        this.isElectric = false;
        this.amountOfPassengers = 1;
        this.mediumOfTravel = "land";
        this.hasAnEngine = false;
    }

}
