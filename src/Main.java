public class Main {

    public static void main(String[] args) {

        Archer a = new Archer("Archer", 5);
        Mage m = new Mage("Mage", 7);
        Warrior w = new Warrior("Warrior", 6);

        a.attack();
        a.attack(3);

        m.attack();

        w.attack();
        w.attack("Power Slash");
    }
}