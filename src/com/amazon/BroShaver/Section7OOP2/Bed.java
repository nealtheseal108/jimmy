package com.amazon.BroShaver.Section7OOP2;

public class Bed {
    private String style;
    private int pillows;
    private int quilt;
    private int height;
    private int sheets;

    public Bed(String style, int pillows, int quilt, int height, int sheets) {
        this.style = style;
        this.pillows = pillows;
        this.quilt = quilt;
        this.height = height;
        this.sheets = sheets;
    }

    public void make() {
        System.out.print("Bed -> Making bed | ");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getQuilt() {
        return quilt;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }
}
