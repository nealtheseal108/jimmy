package com.amazon.BroShaver.Section9InnerAbstractClassesInterfaces;

public class PhoneMain {
    public static void main(String[] args) {
        iTelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.answer();
        timsPhone.callPhone(123456);

        timsPhone = new mobilePhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

    }

}
