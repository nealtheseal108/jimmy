package com.amazon.BroShaver.Section12Collections;

import java.util.*;

public class HeavenlyMain {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 255);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Mercury", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(temp.getName(), temp);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        tempMoon = new HeavenlyBody("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        temp = new HeavenlyBody("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        temp = new HeavenlyBody("Saturn", 10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Neptune", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody body = solarSystem.get("Jupiter");
        System.out.println("Moons of " + body.getName());
        for (HeavenlyBody moon: body.getSatellites()) {
            System.out.println("\t" + moon.getName());
        }

        System.out.println("Planets:");
        for (HeavenlyBody planet: planets) {
            System.out.println("\t" + planet.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet: planets) {
            System.out.println();
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons:");
        for (HeavenlyBody moon: moons) {
            System.out.println("\t" + moon.getName());
        }

        HeavenlyBody pluto = new HeavenlyBody("Pluto", 842);
        planets.add(pluto);

        System.out.println("All Planets");
        for(HeavenlyBody planet: planets) {
            System.out.println("\t" + planet.getName() + ": " + planet.getOrbitalPeriod());
        }

        Object o = new Object();
        o.equals(o);
        "pluto".equals("");
    }
}

// the '.addAll()' method adds all the items of one set to another
// note that for each 'HeavenlyBody' in this class, only one object in memory exists, but there are multiple references to each one at different points in the code
// note that for an object to be deemed as "repeated" by a Set, all objects within the object must be identical to its counterpart
// one can overwrite the '.equals()' method for this
// when storing object in "'Hash' Collections, the hashcode of the object determines which "bucket" an object will go into
// any objects that are equal will ultimately have the same hashcode, and thus will go into the same bucket
// if two objects belong to the same bucket than an '.equals()' comparison will return 'true'
// but a '.equals()' comparison returning 'true' doesn't necessarily mean that the two objects belong to the same bucket, as ultimately only deals with if the two objects reference the same object in memory
// if a duplicate object has a different hashcode than the original, it will be added to the Collection
// if we try to iterate through the data structure and remove the duplicate, we might end up finding the original first and removing that one
// this is why there needs to be a strict relationship between the hashcode and the '.equals()' method in certain circumstances