package com.amazon.BroShaver.Section12Collections;

import java.util.*;

public final class AdventureMain {
    private final Map<Integer, Location> locations = new HashMap<Integer, Location>();
    public AdventureMain() {
        Map<String, Integer> exits = new HashMap<>();
        exits.put("W", 2);
        exits.put("E", 3);
        exits.put("S", 4);
        exits.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building", exits));
        exits = new HashMap<String, Integer>();
        exits.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill", exits));
        exits = new HashMap<String, Integer>();
        exits.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring", exits));
        exits = new HashMap<String, Integer>();
        exits.put("N", 1);
        exits.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream", exits));
        exits = new HashMap<String, Integer>();
        exits.put("S", 1);
        exits.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest", exits));
        exits = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java", exits));
    }
    public void command() {
        Scanner scanner = new Scanner(System.in);
        boolean wantsToQuit = false;
        int currentLocation = 1;
        System.out.println(locations.get(currentLocation).getDescription());
        int startCounter = 0;
        System.out.print("Available exits are ");
        for (String key: locations.get(currentLocation).getExits().keySet()) {
            startCounter++;
            System.out.print(key);
            if (!(startCounter == locations.get(currentLocation).getExits().keySet().size())) {
                System.out.print(", ");
            } else {
                System.out.println();
                break;
            }
        }
        while (!wantsToQuit) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q") || input.toLowerCase().contains("quit")) {
                System.out.println(locations.get(0).getDescription());
                wantsToQuit = true;
                break;
            }
            if (input.equalsIgnoreCase("n") || input.toLowerCase().contains("north")) {
                if (locations.get(currentLocation).getExits().get("N") != null) {
                    currentLocation = locations.get(currentLocation).getExits().get("N");
                    System.out.println(locations.get(currentLocation).getDescription());
                    System.out.print("Available exits are ");
                    int counter = 0;
                    for (String key: locations.get(currentLocation).getExits().keySet()) {
                        counter++;
                        System.out.print(key);
                        if (!(counter == locations.get(currentLocation).getExits().keySet().size())) {
                            System.out.print(", ");
                        } else {
                            System.out.println();
                            break;
                        }
                    }
                } else {
                    System.out.println("You cannot go in that direction");
                    System.out.println();
                    System.out.println(locations.get(currentLocation).getDescription());
                    System.out.print("Available exits are ");
                    int counter = 0;
                    for (String key: locations.get(currentLocation).getExits().keySet()) {
                        counter++;
                        System.out.print(key);
                        if (!(counter == locations.get(currentLocation).getExits().keySet().size())) {
                            System.out.print(", ");
                        } else {
                            System.out.println();
                            break;
                        }
                    }
                }
            } else if (input.equalsIgnoreCase("s") || input.toLowerCase().contains("south")) {
                if (locations.get(currentLocation).getExits().get("S") != null) {
                    currentLocation = locations.get(currentLocation).getExits().get("S");
                    System.out.println(locations.get(currentLocation).getDescription());
                    System.out.print("Available exits are ");
                    int counter = 0;
                    for (String key: locations.get(currentLocation).getExits().keySet()) {
                        counter++;
                        System.out.print(key);
                        if (!(counter == locations.get(currentLocation).getExits().keySet().size())) {
                            System.out.print(", ");
                        } else {
                            System.out.println();
                            break;
                        }
                    }
                } else {
                    System.out.println("You cannot go in that direction");
                    System.out.println();
                    System.out.println(locations.get(currentLocation).getDescription());
                    System.out.print("Available exits are ");
                    int counter = 0;
                    for (String key: locations.get(currentLocation).getExits().keySet()) {
                        counter++;
                        System.out.print(key);
                        if (!(counter == locations.get(currentLocation).getExits().keySet().size())) {
                            System.out.print(", ");
                        } else {
                            System.out.println();
                            break;
                        }
                    }
                }
            } else if (input.equalsIgnoreCase("E") || input.toLowerCase().contains("east")) {
                if (locations.get(currentLocation).getExits().get("E") != null) {
                    currentLocation = locations.get(currentLocation).getExits().get("E");
                    System.out.println(locations.get(currentLocation).getDescription());
                    System.out.print("Available exits are ");
                    int counter = 0;
                    for (String key: locations.get(currentLocation).getExits().keySet()) {
                        counter++;
                        System.out.print(key);
                        if (!(counter == locations.get(currentLocation).getExits().keySet().size())) {
                            System.out.print(", ");
                        } else {
                            System.out.println();
                            break;
                        }
                    }
                } else {
                    System.out.println("You cannot go in that direction");
                    System.out.println();
                    System.out.println(locations.get(currentLocation).getDescription());
                    System.out.print("Available exits are ");
                    int counter = 0;
                    for (String key: locations.get(currentLocation).getExits().keySet()) {
                        counter++;
                        System.out.print(key);
                        if (!(counter == locations.get(currentLocation).getExits().keySet().size())) {
                            System.out.print(", ");
                        } else {
                            System.out.println();
                            break;
                        }
                    }
                }
            } else if (input.equalsIgnoreCase("W") || input.toLowerCase().contains("west")) {
                if (locations.get(currentLocation).getExits().get("W") != null) {
                    currentLocation = locations.get(currentLocation).getExits().get("W");
                    System.out.println(locations.get(currentLocation).getDescription());
                    System.out.print("Available exits are ");
                    int counter = 0;
                    for (String key: locations.get(currentLocation).getExits().keySet()) {
                        counter++;
                        System.out.print(key);
                        if (!(counter == locations.get(currentLocation).getExits().keySet().size())) {
                            System.out.print(", ");
                        } else {
                            System.out.println();
                            break;
                        }
                    }
                } else {
                    System.out.println("You cannot go in that direction");
                    System.out.println();
                    System.out.println(locations.get(currentLocation).getDescription());
                    System.out.print("Available exits are ");
                    int counter = 0;
                    for (String key: locations.get(currentLocation).getExits().keySet()) {
                        counter++;
                        System.out.print(key);
                        if (!(counter == locations.get(currentLocation).getExits().keySet().size())) {
                            System.out.print(", ");
                        } else {
                            System.out.println();
                            break;
                        }
                    }
                }
            } else {
                System.out.println("You cannot go in that direction");
                System.out.println();System.out.println(locations.get(currentLocation).getDescription());
                System.out.print("Available exits are ");
                int counter = 0;
                for (String key: locations.get(currentLocation).getExits().keySet()) {
                    counter++;
                    System.out.print(key);
                    if (!(counter == locations.get(currentLocation).getExits().keySet().size())) {
                        System.out.print(", ");
                    } else {
                        System.out.println();
                        break;
                    }
                }

            }
        }
    }
}
