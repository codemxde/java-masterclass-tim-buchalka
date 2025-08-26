package org.codemxde.section_6_mastering_conditional_logic_loops.lecture_59;

public class SwitchChallenge {

    public static void main(String[] args) {
        System.out.println(getPhoneticAlphabetNATO('F'));
    }

    public static String getPhoneticAlphabetNATO(char ch) {
        return switch (ch) {
            case 'A' -> "Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
            case 'D' -> "Dog";
            case 'E' -> "Easy";
            default -> "Unexpected character received";
        };
    }
}
