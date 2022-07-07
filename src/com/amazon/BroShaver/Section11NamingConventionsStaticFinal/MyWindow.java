package com.amazon.BroShaver.Section11NamingConventionsStaticFinal;

import java.awt.*;
import java.awt.event.*;

public class MyWindow extends Frame {
    public MyWindow(String title) {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("The Complete Java Developer Course", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("by Tim Buchalka", 60, 100);
    }
}

// call 'windowClosing' when you want to execute code when a window is in the process of closing
// call 'windowClosed' when you want to execute code after a window has closed
// '.awt' and '.event' are both nested packages
// we can take advantages of the functionalities of different inbuilt Java packages to make it easier to write code
// the '*' after package names in an import signifies that all classes, interfaces, fields, and methods have been imported from those packages
// the '*' does not let you import assets from packages nested in rightmost defined package, however