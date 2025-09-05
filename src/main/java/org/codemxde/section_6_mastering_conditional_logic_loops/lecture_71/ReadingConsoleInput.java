package org.codemxde.section_6_mastering_conditional_logic_loops.lecture_71;

public class ReadingConsoleInput {
    // THIS WILL ONLY EXECUTE VIA TERMINAL, AND NOT WITH ANY IDE!

    // Here you go :)
    // java src/main/java/org/codemxde/section_6_mastering_conditional_logic_loops/lecture_71/ReadingConsoleInput.java
    public static void main(String[] args) {
        System.out.println(getInputFromConsole(2025));
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi there, what be your name? ");
        System.out.println("Nice to meet you, " + name);

        String dateOfBirth = System.console().readLine("\nWhat year were you born in? ");
        int userAge = currentYear - Integer.parseInt(dateOfBirth);

        return "So, that would mean you're " + userAge + " years old";
    }
}
