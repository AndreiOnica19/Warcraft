import heroes.Archer;
import heroes.Knight;
import heroes.Wizard;
import villains.Goblin;
import villains.Orc;
import villains.Troll;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Archer archer = new Archer("Legolas", 150, 10);
        Knight knight = new Knight("Aragorn", 120, 12);
        Wizard wizard = new Wizard("Gandalf", 500, 15);
        Goblin goblin = new Goblin("Goburo", 90, 10);
        Troll troll = new Troll("Barbarossa", 95, 15);
        Orc orc = new Orc("Blood Orc", 85, 12);
        archer.fight(goblin);
        wizard.fight(troll);
        knight.fight(orc);
    }
}
