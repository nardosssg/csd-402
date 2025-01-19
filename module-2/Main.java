/**
 * Nardos Gebremedhin
 * 01/17/2025
 * M2 RockPaperScissor Game
 * The program should randomly generate the number of 1, 2, or 3 with 1 being Rock, 2 being Paper, and 3 being Scissors.
 * This will be the computer’s selection in the game. Then, the program should prompt the user to enter a value of 1, 2, or 3.
 * This will be the user’s selection in the game. Next, the program should display a clear readable message displaying both
 * the computer’s selection, the user’s selection, and the results of the game played.
 */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();


        /* initialing my variables */
        final int ROCK = 1;
        final int PAPER = 2;
        final int SCISSORS = 3;

        int userChoice;
        int computerChoice;

        // GET CHOICES FROM THE USER
        System.out.print("Enter your move rock(1), paper(2), scissor(3): ");
        userChoice = scanner.nextInt();

        // VALIDATE THE USER CHOICE
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid choice. Please restart the game and select 1, 2, or 3.");
            return;
        }
        // GET RANDOM CHOICE FOR THE COMPUTER
         computerChoice = generator.nextInt(3) + 1;

        // DISPLAY CHOICE
        System.out.println("You chose: " + ChoiceName(userChoice));
        System.out.println("Computer chose: " + ChoiceName(computerChoice));

        // DISPLAY RESULT
        String result = determineWinner(userChoice, computerChoice);
        System.out.println(result);

    }
    // CONVERTING CHOICE NUM TO LETTER
    private static String ChoiceName(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Unknown";
        }
    }
    // DETERMINE WINNER
    private static String determineWinner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return "It's a tie!";
        } else if ((userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }
}
