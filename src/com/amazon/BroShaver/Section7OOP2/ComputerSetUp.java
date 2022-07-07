package com.amazon.BroShaver.Section7OOP2;

public class ComputerSetUp {
    private String laptopModel;
    private Resolution monitorResolution;
    private String monitorModel;
    private String keyboardModel;
    private String mouseModel;
    private int computerTempInFahrenheit;
    private boolean areThereHeadphones;
    private boolean doesUSBBCableWork;
    private boolean isLaptopOn;

    public ComputerSetUp(String laptopModel, Resolution monitorResolution, String monitorModel, String keyboardModel, String mouseModel, int computerTempInFahrenheit, boolean areThereHeadphones, boolean doesUSBBCableWork, boolean isLaptopOn) {
        this.laptopModel = laptopModel;
        this.monitorResolution = monitorResolution;
        this.monitorModel = monitorModel;
        this.keyboardModel = keyboardModel;
        this.mouseModel = mouseModel;
        this.computerTempInFahrenheit = computerTempInFahrenheit;
        this.areThereHeadphones = areThereHeadphones;
        this.doesUSBBCableWork = doesUSBBCableWork;
        this.isLaptopOn = isLaptopOn;
    }

    public void turnOn() {
        if (isLaptopOn) {
            System.out.println("Neal's laptop is already on. Hopefully, he's being ultra-productive.");
        } else {
            this.isLaptopOn = true;
            System.out.println("Power button pressed.");
        }

    }

    public String getLaptopModel() {
        return laptopModel;
    }

    public Resolution getMonitorResolution() {
        return monitorResolution;
    }

    public String getMonitorModel() {
        return monitorModel;
    }

    public String getKeyboardModel() {
        return keyboardModel;
    }

    public String getMouseModel() {
        return mouseModel;
    }

    public int getComputerTempInFahrenheit() {
        return computerTempInFahrenheit;
    }

    public boolean isAreThereHeadphones() {
        return areThereHeadphones;
    }

    public boolean isDoesUSBBCableWork() {
        return doesUSBBCableWork;
    }
}
