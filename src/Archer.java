public class Archer extends Character {

    public Archer(String name, int level) {
        super(name, level);
    }

    @Override
    public void attack() {
        System.out.println(name + " shoots an arrow!");
    }

    public void attack(int arrows) {
        System.out.println(name + " shoots " + arrows + " arrows!");
    }
}