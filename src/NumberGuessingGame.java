

import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        System.out.println("Guess a number between 1 and 100.");
        checkNumber();
        }
        public static void checkNumber() {
        int pickedNumber = (int) (Math.random() * 100);
        Scanner keyboard = new Scanner(System.in);
        int guess = keyboard.nextInt();

        while (guess < pickedNumber||guess > pickedNumber){
            if (pickedNumber > guess) {
            System.out.println("Your number is too low, guess again.");
            guess = keyboard.nextInt();
            }
            if (pickedNumber < guess) {
            System.out.println("Your number is too high, guess again.");
            guess = keyboard.nextInt();
            }
            if (pickedNumber == guess) {
            System.out.println("You have correctly guessed the number " + pickedNumber + ".");
            System.exit(0);
            }

        }
    }
}
