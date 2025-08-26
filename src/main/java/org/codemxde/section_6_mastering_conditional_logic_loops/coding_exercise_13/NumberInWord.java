package org.codemxde.section_6_mastering_conditional_logic_loops.coding_exercise_13;

public class NumberInWord {

    public static void main(String[] args) {
        printNumberInWord(90);
    }

    public static void printNumberInWord(int number) {
        String numberInWord = switch (number) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> "other";
        };
        System.out.println(numberInWord.toUpperCase());
    }
}

