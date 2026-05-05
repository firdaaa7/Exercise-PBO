public class Warrior extends Character implements SpecialAbility {

    public Warrior(String name, int age, Gender gender) {
        super(name, age, "Warrior", gender);
    }

    @Override
    public void attack() {
        System.out.println("Warrior swings sword!");
    }

    @Override
    public void useUltimateAbility() {
        System.out.println("Warrior uses Berserker Rage!");
    }
}