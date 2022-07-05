package section11NamingConventionsStaticFinal.example;

import section9InnerAbstractClassesInterfaces.ISaveable;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    @Override
    public List<String> write() {
        List<String> attributeList = new ArrayList<>();
        attributeList.add(0, this.name);
        attributeList.add(1,(Integer.toString(this.hitPoints)));
        attributeList.add(2, (Integer.toString(this.strength)));
        attributeList.add(3, this.weapon);
        return attributeList;
    }

    @Override
    public void read(List<String> list) {
        if (list == null || list.size() == 0) {
            System.out.println("Your list is either null or contains zero values.");
            return;
        } else {
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
            this.weapon = list.get(3);
        }
    }

    @Override
    public String toString() {
        return "Player{name='" + this.name + "', hitPoints=" + this.hitPoints + ", strength=" + this.strength + ", weapon='" + this.weapon + "'}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
