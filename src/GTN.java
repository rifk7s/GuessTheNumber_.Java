// GuessTheNumber Game - Java Lab 1 - 25th February 2025 | M. Rifki Paranrengi - 0806022410017
import java.util.Scanner;


public class GTN {
    public static void main(String[] args)throws Exception {
        // Variables
        int numberToGuess; // Number
        int userGuess; // User input (guess)
        int attempts = 0; // Attempts

        // Generate random number
        numberToGuess = (int) (Math.random() * 100) + 1;

        // Scanner setup for user input
        Scanner scanner = new Scanner(System.in);

        // Welcome Page
        System.out.println( ": ");
        System.out.println("Welcome to Guess the Number!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess it?");

        // Loop
        do {
            System.out.print("\u001b[0mEnter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < numberToGuess) {
                System.out.println("\u001b[33mToo low!");
            } else if (userGuess > numberToGuess) { 
                System.out.println("\u001b[31mToo high!");
            } else {
                System.out.println("You got it!");
                System.out.println("\u001b[32mCongratulations! \u001b[0mIt took you " + attempts + " attempts.");
            }
        } while (userGuess != numberToGuess);

        // Cleanup by closing the scanner
        scanner.close();
    }
}
