public class Mage extends Character {

    public Mage(String name, int level) {
        super(name, level);
    }

    @Override
    public void attack() {
        System.out.println(name + " casts magic!");
    }
}