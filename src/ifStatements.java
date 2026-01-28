import java.util.Scanner;

public class ifStatements {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("Whats your name? ");
        name = scanner.nextLine();
        System.out.print("How old are you? ");
        age = scanner.nextInt();
        System.out.print("Are you a student? (true/false) ");
        isStudent = scanner.nextBoolean();

        //group 1
        if (name.isEmpty()) {
            System.out.println("Invalid input.");
        } else {
            System.out.println("hello " + name + "!");
        }

        //group 2
        if (age >= 10) {
            System.out.println("you are an adult!");
        } else if (age < 0) {
            System.out.println("your kidding...");

        } else if (age > 100) {
            System.out.println("Woah");
        } else {
            System.out.println("go back to school!");
        }

        //group 3
        if (isStudent) {
            System.out.println("you are a student!");
        } else {
            System.out.println("you are not a student!");
        }

        scanner.close();
    }

}
