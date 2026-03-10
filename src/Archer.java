public class Archer extends Character {

    public Archer(String name, int age, boolean gender) {
        super(name, age, "Archer", gender);
    }

    public void attack() {
        System.out.println("Archer shoots an arrow!");
    }
}