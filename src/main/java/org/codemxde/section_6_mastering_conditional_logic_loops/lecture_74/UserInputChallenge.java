package org.codemxde.section_6_mastering_conditional_logic_loops.lecture_74;

import java.util.Scanner;

public class UserInputChallenge {
    // Challenge: Read 5 'valid' numbers from the console
    // print the sum of those 5 numbers

//    Validation: Check whether the numbers input are valid integers
//    If invalid, prompt untill valid number input is received
    public static void main(String[] args) {
        readUserInput();
    }

    public static void readUserInput() {
        System.out.println("Welcome to the challenge!");
        var scanner = new Scanner(System.in);

        int count = 1; double sum = 0;
        do {
            System.out.print("Enter number " + count + ": ");

            try {
                String numInput = scanner.nextLine();
                double number = Double.parseDouble(numInput);
                sum += number;
                count++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Number!");
            }
        } while (count < 6);

        System.out.println("The sum of all numbers: " + sum);
    }
}
