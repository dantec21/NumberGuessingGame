import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        int pickedNumber = (int) (Math.random() * 100);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100.");
        int guess = keyboard.nextInt();
        checkNumber(pickedNumber,guess);
        System.out.println("Guess again, you have two mor tries.");
        checkNumber(pickedNumber,guess);
        System.out
    }

    public static void checkNumber(int pickedNumber, int guess) {
        if (pickedNumber > guess){
            System.out.println("Your number is too low.");
            }
        if (pickedNumber < guess){
            System.out.println("Your number is too high.");
        }
        if (pickedNumber == guess){
            System.out.println("You have correctly guessed the number " + pickedNumber + ".");
            System.exit(0);
        }
    }
}
