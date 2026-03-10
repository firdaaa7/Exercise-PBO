public class Warrior extends Character {

    public Warrior(String name, int level) {
        super(name, level);
    }

    @Override
    public void attack() {
        System.out.println(name + " swings sword!");
    }

    public void attack(String move) {
        System.out.println(name + " uses " + move);
    }
}