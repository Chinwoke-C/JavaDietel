package Practizezz;

import java.util.Scanner;

public class GuessingGame {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean validInput;
        int randomNumber = 0;
        int guess;
        String answer;
        boolean keepPlaying = true;
        System.out.println("Let's play a guessing game!");
        while (keepPlaying) {
            randomNumber = (int) (Math.random() * 10) + 1;
            System.out.println("\nI'm thinking of a number between 1 and 10.");
            System.out.print("what do you think it is?: ");

            do {
                guess = input.nextInt();
                validInput = true;
                if ((guess < 1) || (guess > 10)) {
                    System.out.print("I said between 1 and 10!" + "Try again: ");
                    validInput = false;
                }
            } while (!validInput);
            if (guess == randomNumber) {
                System.out.println("you're right");
            } else {
                System.out.printf("You're wrong!, The number was %d", randomNumber);
                do {
                    System.out.println("\nPlay again? (Y or N)");
                    answer = input.next();
                    validInput = true;
                    if (answer.equalsIgnoreCase("Y")) {
                        System.out.println();
                    } else if (answer.equalsIgnoreCase("N")) {
                        keepPlaying = false;
                    } else {
                        validInput = false;
                    }
                }
                while (!validInput);

            }


        }
            System.out.println("\nThank you for playing");

    }
}

