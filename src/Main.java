import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n=== Hero Creator ===");
            System.out.println("1. Create Archer");
            System.out.println("2. Create Mage");
            System.out.println("3. Create Warrior");
            System.out.println("4. Exit");
            System.out.print("Choose hero class: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Age: ");
                    int age = input.nextInt();
                    input.nextLine();

                    System.out.print("Gender (MALE/FEMALE): ");
                    Gender gender = Gender.valueOf(input.nextLine().toUpperCase());

                    Archer archer = new Archer(name, age, gender);
                    archer.showData();
                    archer.attack();
                    break;

                case 2:

                    System.out.print("Enter Name: ");
                    name = input.nextLine();

                    System.out.print("Enter Age: ");
                    age = input.nextInt();
                    input.nextLine();

                    System.out.print("Gender (MALE/FEMALE): ");
                    gender = Gender.valueOf(input.nextLine().toUpperCase());

                    Mage mage = new Mage(name, age, gender);
                    mage.showData();
                    mage.attack();
                    mage.useUltimateAbility();
                    break;

                case 3:

                    System.out.print("Enter Name: ");
                    name = input.nextLine();

                    System.out.print("Enter Age: ");
                    age = input.nextInt();
                    input.nextLine();

                    System.out.print("Gender (MALE/FEMALE): ");
                    gender = Gender.valueOf(input.nextLine().toUpperCase());

                    Warrior warrior = new Warrior(name, age, gender);
                    warrior.showData();
                    warrior.attack();
                    break;

                case 4:
                    System.out.println("Program End.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        input.close();
    }
}