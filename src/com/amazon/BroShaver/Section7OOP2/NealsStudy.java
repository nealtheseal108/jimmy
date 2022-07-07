package com.amazon.BroShaver.Section7OOP2;

public class NealsStudy {
    private Swing hichko;
    private Desk glassDesk;
    private ComputerSetUp computerSetUp;

    private boolean areDoorsClosed;

    public NealsStudy(Swing hichko, Desk glassDesk, ComputerSetUp computerSetUp, boolean areDoorsClosed) {
        this.hichko = hichko;
        this.glassDesk = glassDesk;
        this.computerSetUp = computerSetUp;
        this.areDoorsClosed = areDoorsClosed;
    }

    public void CloseDoors() {
        if (this.areDoorsClosed) {
            System.out.println("Unfortunately, one cannot close closed doors.");
            return;
        } else {
            this.glassDesk.moveDesk(-48, 0);
            System.out.println("Moved desk 48 inches to the left.");
            this.areDoorsClosed = true;
            System.out.println("Closed doors.");
            this.glassDesk.moveDesk(-48, 0);
            System.out.println("Moved desk to original position.");
        }
    }
}
