public class Character {

    String name;
    int level;

    public Character(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void attack() {
        System.out.println(name + " attacks!");
    }
}