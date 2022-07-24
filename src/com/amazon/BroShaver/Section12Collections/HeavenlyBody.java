package com.amazon.BroShaver.Section12Collections;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<HeavenlyBody>();
    }

    public String getName() {
        return this.name;
    }

    public double getOrbitalPeriod() {
        return this.orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public void addMoon(HeavenlyBody moon) {
        this.satellites.add(moon);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        if ((obj == null || obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((HeavenlyBody)obj).getName();
        return this.name.equals(objName);
    }




}

// whereas a List is an ordered Collection of items that can contain duplicates, a Set has no defined order (defined as chaotic) and cannot contain duplicates
// the Set interfaces utilizes generics just like any other Collection
// '.add()', '.remove()', 'clear()'.size()', '.isEmpty()', and '.contain()' applies to the Set interface; there is no way to retrieve the nth item from a set; one has to iterate through the Set to find an item
// using immutable objects can cause problems in a Set; same with storing a Set in itself
// the best-known implementation of the Set interface is the HashSet class, which uses hashes and a HashMap to store the items
// whenever an element is added to a HashSet, the object becomes a key in the internal HashMap