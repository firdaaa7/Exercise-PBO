import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Character> characters = new ArrayList<>();

        int choice = 0;

        do {

            try {

                System.out.println("\n=== Hero Creator ===");
                System.out.println("1. Create Archer");
                System.out.println("2. Create Mage");
                System.out.println("3. Create Warrior");
                System.out.println("4. Show All Characters");
                System.out.println("5. Exit");
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

                        if (age < 10) {
                            throw new InvalidAgeException("Archer age must be at least 10.");
                        }

                        System.out.print("Gender (MALE/FEMALE): ");
                        Gender gender = Gender.valueOf(input.nextLine().toUpperCase());

                        Archer archer = new Archer(name, age, gender);

                        characters.add(archer);

                        archer.showData();
                        archer.attack();
                        archer.useUltimateAbility();

                        break;

                    case 2:

                        System.out.print("Enter Name: ");
                        name = input.nextLine();

                        System.out.print("Enter Age: ");
                        age = input.nextInt();
                        input.nextLine();

                        if (age < 15) {
                            throw new InvalidAgeException("Mage age must be at least 15.");
                        }

                        System.out.print("Gender (MALE/FEMALE): ");
                        gender = Gender.valueOf(input.nextLine().toUpperCase());

                        Mage mage = new Mage(name, age, gender);

                        characters.add(mage);

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

                        if (age < 18) {
                            throw new InvalidAgeException("Warrior age must be at least 18.");
                        }

                        System.out.print("Gender (MALE/FEMALE): ");
                        gender = Gender.valueOf(input.nextLine().toUpperCase());

                        Warrior warrior = new Warrior(name, age, gender);

                        characters.add(warrior);

                        warrior.showData();
                        warrior.attack();
                        warrior.useUltimateAbility();

                        break;

                    case 4:

                        if (characters.isEmpty()) {
                            System.out.println("No character available.");
                        } else {

                            System.out.println("\n=== Character List ===");

                            for (Character character : characters) {
                                character.showData();
                                character.attack();

                                if (character instanceof SpecialAbility) {
                                    ((SpecialAbility) character).useUltimateAbility();
                                }
                            }
                        }

                        break;

                    case 5:
                        System.out.println("Program End.");
                        break;

                    default:
                        throw new InvalidMenuException("Menu does not exist.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Input must be a number.");
                input.nextLine();

            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());

            } catch (InvalidMenuException e) {
                System.out.println(e.getMessage());

            } catch (IllegalArgumentException e) {
                System.out.println("Invalid gender input.");
            }

        } while (choice != 5);

        input.close();
    }
}