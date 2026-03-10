public class Warrior extends Character {

    public Warrior(String name, int age, boolean gender) {
        super(name, age, "Warrior", gender);
    }

    public void attack() {
        System.out.println("Warrior swings sword!");
    }
}