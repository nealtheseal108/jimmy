package section7OOP2;

public class Player {
    public String playerName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("Player was knocked out.");
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
