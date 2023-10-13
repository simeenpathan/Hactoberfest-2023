import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        int attempts = 0;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            System.out.print("Enter your guess (1-100): ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < target) {
                System.out.println("Try a higher number.");
            } else if (guess > target) {
                System.out.println("Try a lower number.");
            }
        } while (guess != target);

        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
    }
}
