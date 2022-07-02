package section9InnerAbstractClassesInterfaces;

public class mobilePhone implements iTelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public mobilePhone(int myNumber) {
        this.myNumber = myNumber;
        this.isOn = false;
    }

    @Override
    public void powerOn() {
        System.out.println("Mobile phone powered on.");
    }

    @Override
    public void dial(int number) {
        if(isOn) {
            System.out.println("Now ringing " + number + " on mobile phone.");
        } else {
            System.out.println("Mobile phone is switched off.");
        }
    }

    @Override
    public void answer() {
        if (this.isRinging) {
            System.out.println("Answering the mobile phone.");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int number) {
        if (number == this.myNumber && this.isOn) {
            this.isRinging = true;
            System.out.println("Boom boom boom ba da doom doom boom doom doom doom boom.");
        } else {
            System.out.println("Mobile phone is now calling " + number + ".");
            this.isRinging = false;
        }
        return this.isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
