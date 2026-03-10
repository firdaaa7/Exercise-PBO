public class Character {

    private String name;
    private int age;
    private String heroClass;
    private boolean gender;

    public Character(String name, int age, String heroClass, boolean gender) {
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

        if (gender) {
            System.out.println("Gender: Female");
        } else {
            System.out.println("Gender: Male");
        }
    }
}