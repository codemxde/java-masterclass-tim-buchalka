package org.codemxde.section_6_mastering_conditional_logic_loops.lecture_75;

import java.util.Scanner;

public class MinMaxChallenge {
//    Challenge: Create an infinte loop which,
//    1. Prompths the user to enter a number or any character to quit
//    2. Validates if the user-entered data is really a number.
//    3. If the user entered data is not a number, quit the loop
//    4. Keep track of the maximum and minimum values
//    NOTE: If the user has input even one valid input, diplay the maximum and minimum
    public static void main(String[] args) {
        readUserInput();
    }

    public static void readUserInput() {
        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = true, oneValidInput = false;
        double max = Double.MIN_VALUE, min = Double.MAX_VALUE;

        while (inputIsValid) {
            System.out.print("Enter a number to continue, or press any key to quit: ");
            String input = scanner.nextLine();
            try {
                double number = Double.parseDouble(input);
                max = Math.max(number, max);
                min = Math.min(number, min);

                oneValidInput = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Alright, Catch you later!");
                inputIsValid = false;
            }
        }

        if (oneValidInput) {
            System.out.println("The maximum is " + max + " and the minimum is " + min + " of all input values");
        } else {
            System.out.println("No valid input was received");
        }
    }
}
