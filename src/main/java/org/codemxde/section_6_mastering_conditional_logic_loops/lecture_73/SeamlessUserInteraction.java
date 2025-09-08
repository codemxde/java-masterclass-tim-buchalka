package org.codemxde.section_6_mastering_conditional_logic_loops.lecture_73;

import java.util.Scanner;

public class SeamlessUserInteraction {

    public static void main(String[] args) {
        // startUserSession(2025);
        startTimsSession(2025);
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

    public static void startTimsSession(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hi there, what is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi there, " + name);

        System.out.print("\nWhat year were you born in? ");

        boolean invalidDOB = true;
        int age = 0;

        do {
            System.out.print("Enter a year of birth >= " + (currentYear - 125) + " and <= " + currentYear + " ");
            try {
                age = checkData(currentYear, scanner.nextLine());
                invalidDOB = age < 0;
            } catch (NumberFormatException e) {
                System.out.println("Inavlid Input!");
            }
        } while (invalidDOB);

        System.out.println("\nSo, that would mean you're " + age + " years old!");
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int birthYear = Integer.parseInt(dateOfBirth);
        int minimumAllowedyear = currentYear - 125;

        if (birthYear < minimumAllowedyear || birthYear > currentYear) {
            return -1;
        }

        return currentYear - birthYear;
    }
}
