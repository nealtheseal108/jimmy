package section9InnerAbstractClassesInterfaces;

import java.util.Scanner;

public class GearboxMain {
    private static Scanner scanner = new Scanner(System.in);
    private static Button newButton = new Button("Print");
    public static void main(String[] args) {
        /*class clickListener implements Button.OnClickListener {
            public clickListener() {
                System.out.println("I've been attached.");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }
        }

        newButton.setOnClickListener(new clickListener()); */

        newButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listenForClick();
    }

    private static void listenForClick() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    newButton.onClick();
            }
        }
    }
}
