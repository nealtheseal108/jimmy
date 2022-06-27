package section7OOP2;

import java.io.Closeable;

public class PlayerMain {
    public static void main(String[] args) {
        Player player = new Player();
        player.playerName = "Tim";
        player.health = 20;
        player.weapon = "sword";

        player.loseHealth(10);
        System.out.println("Remaining health = " + player.health);

        player.loseHealth(11);
        player.health = 200;
        System.out.println("Remaining health = " + player.health);
    }
}

// encapsulation deals with classes' and methods' abilities to change fields
// if a field is private or protected, other classes and methods cannot directly change fields
