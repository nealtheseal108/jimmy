package section7OOP2;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String BIOSName;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String BIOSName) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.BIOSName = BIOSName;
    }

    public void loadProgram(String programName) {
        System.out.println(programName + " will subsequently load.");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBIOSName() {
        return BIOSName;
    }


}
