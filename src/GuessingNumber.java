import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingNumber {

    public static void guessNumber() {
        SecureRandom rnd = new SecureRandom();

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 0 and 10");
        System.out.println("Enter the number");
        int userInput = 0;

        while (true) {

            try {
                userInput = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Enter only number value");
                input.nextLine();
                continue;

            }
            int random = rnd.nextInt(11);

            if (userInput == random) {
                System.out.println("You got it");
                break;
            } else {
                System.out.println("Try again");
            }
        }

        input.close();
    }


}