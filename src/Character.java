public abstract class Character {

    private final String name;
    private final int age;
    private final String heroClass;
    private final Gender gender;

    public Character(String name, int age, String heroClass, Gender gender) {

        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        this.name = name;
        this.age = age;
        this.heroClass = heroClass;
        this.gender = gender;
    }

    public void showData() {

        System.out.println("\n=== Character Data ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Class: " + heroClass);
        System.out.println("Gender: " + gender);
    }

    public abstract void attack();
}