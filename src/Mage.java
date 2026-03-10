public class Mage extends Character {

    public Mage(String name, int age, boolean gender) {
        super(name, age, "Mage", gender);
    }

    public void attack() {
        System.out.println("Mage casts magic!");
    }
}