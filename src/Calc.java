import java.util.Scanner;

public class Calc {
    public static void main() {

        // I made this all by myself ;3
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;

        System.out.println("the result is " + suma);

        scanner.close();
    }

}
