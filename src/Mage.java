public class Mage extends Character implements SpecialAbility {

    public Mage(String name, int age, Gender gender) {
        super(name, age, "Mage", gender);
    }

    @Override
    public void attack() {
        System.out.println("Mage casts magic!");
    }

    @Override
    public void useUltimateAbility() {
        System.out.println("Mage uses Meteor Storm!");
    }
}