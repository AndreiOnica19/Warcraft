package player;

import colours.Colours;

import java.util.Random;

public class Player {
    private String name;
    private int age;
    private int health;
    private int damage;
    // private String armour;

    public Player(String name, int age, int damage) {
        this.name = name;
        this.age = age;
        this.health = 100;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }

    public void fight(Player enemy) throws InterruptedException {
        Random random = new Random();
        while (true) {
            if (this.health <= 0) {
                System.out.println(Colours.RED_BRIGHT + this.name + " has died!" + Colours.RESET);
                break;
            }
            if (enemy.health <= 0) {
                System.out.println(Colours.RED_BRIGHT + enemy.name + " has died!" + Colours.RESET);
                break;
            }
            int randomChoice = random.nextInt(11);
            if (randomChoice <= 5) {
                enemy.health -= this.damage;
                System.out.println(this.name + " attacked " + enemy.name + " dealing " + this.damage + " damage."
                        + enemy.name + " has " + enemy.health + " remaining health.");
            } else {
                this.health -= enemy.damage;
                System.out.println(enemy.name + " attacked " + this.name + " dealing " + enemy.damage + " damage."
                        + this.name + " has " + this.health + " remaining health.");
            }
            Thread.sleep(500);
        }
    }
}
