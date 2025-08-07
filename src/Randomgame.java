import java.util.Random;
import java.util.Scanner;

public class Randomgame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1, 11);

        System.out.println("Number Guessing Game");
     
        do {
            System.out.print("Enter Guess:");
            guess = scanner.nextInt();
            attempts++;
        } while (guess != randomNumber);

        System.out.println("You won");
    }
}
