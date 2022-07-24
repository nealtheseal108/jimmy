package com.amazon.BroShaver.Section12Collections;

public class Dog {
    private final String name;
    public Dog (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // if the compared object (this) is the same object in memory as 'obj', then they are obviously the same object
            return true;
        }

        if (obj instanceof Dog) { // if 'obj' is an instance of 'Dog'
            String objName = ((Dog) obj).getName();
            return this.name.equals(objName);
        }

        return false;
    }
}
