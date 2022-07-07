package com.amazon.BroShaver.Section9InnerAbstractClassesInterfaces;

public class DeskPhone implements iTelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("The desk phone does not have a power button.");
    }

    @Override
    public void dial(int number) {
        System.out.println("Now ringing " + number + " on the desk phone.");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the desk phone.");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int number) {
        if (number == myNumber) {
            isRinging = true;
            System.out.println("Ring ring.");
        } else {
            System.out.println("Desk phone is now calling " + number + ".");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }


}
