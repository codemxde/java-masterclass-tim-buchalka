package org.codemxde.section_6_mastering_conditional_logic_loops.lecture_72;

import java.util.Scanner;

public class HandlingExceptions {

    public static void main(String[] args) {
        int currentYear = 2025;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi there, what be your name? ");
        System.out.println("Nice to meet you, " + name);

        String dateOfBirth = System.console().readLine("\nWhat year were you born in? ");
        int userAge = currentYear - Integer.parseInt(dateOfBirth);

        return "So, that would mean you're " + userAge + " years old!";
    }

    public static String getInputFromScanner(int currentyear) {
        var sc = new Scanner(System.in);

        System.out.print("Hi there, what be your name? ");
        String name = sc.next();
        System.out.println("Nice to meet you, " + name);

        System.out.print("\nWhat year were you born in ? ");
        int year = sc.nextInt();

        int userAge = currentyear - year;
        return "So, that would mean you're " + userAge + " years old!";
    }
}
