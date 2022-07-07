package com.amazon.BroShaver.Section11NamingConventionsStaticFinal;

public final class Password {
    private static final int key = 2835789;
    private final int encryptedPassword;

    public Password (int password) {
        this.encryptedPassword = encryptDecrypted(password);
    }

    private int encryptDecrypted(int password) {
        return password ^ key;
    }

    public void storePassword() {
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if (encryptDecrypted(password) == this.encryptedPassword) {
            System.out.println("Welcome.");
            return true;
        } else {
            System.out.println("Stop peeing EVERYDAY.");
            return false;
        }
    }
}
