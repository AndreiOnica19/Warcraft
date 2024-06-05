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
        int villainVictory = 0;
        int heroVictory = 0;
        while (true) {
            if (this.health <= 0) {
                villainVictory++;
                System.out.println(Colours.RED_BRIGHT + this.name + " has died!" + Colours.RESET + "The villains achieved " +
                        Colours.CYAN_BOLD_BRIGHT + villainVictory + Colours.RESET + " victory.");
                break;
            }
            if (enemy.health <= 0) {
                heroVictory++;
                System.out.println(Colours.RED_BRIGHT + enemy.name + " has died!" + Colours.RESET + "The heroes have achieved " +
                        Colours.CYAN_BOLD_BRIGHT + heroVictory + Colours.RESET + " victory.");
                break;
            }
            int randomChoice = random.nextInt(11);
            if (randomChoice <= 5) {
                enemy.health -= this.damage;
                System.out.println(Colours.BLUE + this.name + Colours.RESET + " attacked " + Colours.PURPLE + enemy.name + Colours.RESET +
                        " dealing " + Colours.YELLOW_BRIGHT + this.damage + Colours.RESET + " damage."
                        + Colours.PURPLE + enemy.name + Colours.RESET + " has " + enemy.health + " remaining health.");
            } else {
                this.health -= enemy.damage;
                System.out.println(Colours.PURPLE + enemy.name + Colours.RESET + " attacked " + Colours.BLUE + this.name + Colours.RESET +
                        " dealing " + Colours.YELLOW_BRIGHT + enemy.damage + Colours.RESET + " damage."
                        + Colours.BLUE + this.name + Colours.RESET + " has " + this.health + " remaining health.");
            }
            Thread.sleep(500);
        }
        if (heroVictory > villainVictory) {
            System.out.println(Colours.BLUE + "Heroes have won!");
        } else {
            System.out.println(Colours.PURPLE + "Villains have won");
        }
    }
}
