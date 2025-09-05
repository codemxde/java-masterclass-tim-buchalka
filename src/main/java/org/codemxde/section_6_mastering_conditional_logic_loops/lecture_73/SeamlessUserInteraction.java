package org.codemxde.section_6_mastering_conditional_logic_loops.lecture_73;

import java.util.Scanner;

public class SeamlessUserInteraction {

    public static void main(String[] args) {
        startUserSession(2025);
    }

    // This method made my ass sweat
    public static void startUserSession(int curentYear) {
        boolean continueSession = true;
        var scanner = new Scanner(System.in);

        System.out.print("Hi there, what is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi there, " + name);

        System.out.print("\nWhat year were you born in? ");

        while (continueSession) {
            String dateOfBirth = scanner.nextLine();
            try {
                int birthYear = Integer.parseInt(dateOfBirth);
                System.out.println("\nSo, that would mean you're " + (curentYear - birthYear) + " years old!");
                continueSession = false;
            } catch (NumberFormatException e) {
                System.out.print("Hmm... The input seems to be invalid, please try again ");
            }
        }
    }
}
