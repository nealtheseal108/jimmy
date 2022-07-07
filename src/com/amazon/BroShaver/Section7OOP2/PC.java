package com.amazon.BroShaver.Section7OOP2;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private void drawLogo() {
        monitor.drawPixelAt(1250, 1250, "yellow");
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

}

// composition is when a superclass has fields that are its subclasses
// its subclasses compose the superclass
// you can only inherit from one class at a time, so lateral classes in the "tree" are used to "inherit" or "import" fields and methods
// the PC is composed of a case, motherboard, and monitors
// composition is creating objects within objects
