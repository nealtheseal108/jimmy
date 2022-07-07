package com.amazon.BroShaver.Section7OOP2;

public class Monitor {
    private String model;
    private String manufacturer;
    private int widthInInches;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int widthInInches, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.widthInInches = widthInInches;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt (int x, int y, String color) {
        System.out.println("Drew a " + color + " pixel at " + x + ", " + y + ".");
    }
}
