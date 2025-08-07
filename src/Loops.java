import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        System.out.print("Enter your age:");
        age = scanner.nextInt();

        System.out.println("Your age is :" + age);
        int number;
        do {
            System.out.print("Enter a number between 1-10");
            number = scanner.nextInt();
            scanner.nextLine();
        } while (number < 1 || number > 10);

        System.out.println("Your number is :" + number);
        scanner.close();
    }
}
