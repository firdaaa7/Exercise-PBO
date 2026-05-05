public class Archer extends Character implements SpecialAbility {

    public Archer(String name, int age, Gender gender) {
        super(name, age, "Archer", gender);
    }

    @Override
    public void attack() {
        System.out.println("Archer shoots an arrow!");
    }

    @Override
    public void useUltimateAbility() {
        System.out.println("Archer uses Rain of Arrows!");
    }
}