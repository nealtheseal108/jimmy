package com.amazon.BroShaver.Section11NamingConventionsStaticFinal;

import java.util.Scanner;

public class WindowMain {

    public Scanner x = new Scanner(System.in);

    public WindowMain(Scanner x) {
        this.x = x;
    }
    public static void main(String[] args) {
        MyWindow myWindow = new MyWindow("Complete Java");
        myWindow.setVisible(true);


    }

    public void x() {
        X x = new X(this.x.nextInt());
        x.x();
    }
}
