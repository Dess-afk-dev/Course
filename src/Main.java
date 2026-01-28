import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // mwah ;3

        /*
        this is for multi-line comments :3
         */

//        System.out.println("i like chiken :3");
//        System.out.print("it tasty -w-");
//        System.out.print("buy chicken :c");


        System.out.println("do you like chicken? ");
        String answer = scanner.nextLine();

        if (Objects.equals(answer, "Yes")) {
            System.out.println("good :3");
        } else {
            System.out.println(">:c");
        }
//      just a space :3
        System.out.println(" ");

        System.out.println("how old are you?");
        int age = scanner.nextInt();

        if (age > 17) {
            System.out.println("nice :3");
        }else {
            System.out.printf("go back to school >:c");
        }
        scanner.close();
    }

}
