package org.codemxde.section_6_mastering_conditional_logic_loops.lecture_67;

public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println("Sum of digits for 125: " + sumDigits(125));
    }

    public static int sumDigits(int number) {
        if (number < 0) return -1;

        int sumOfDigits = 0;
        while (number > 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }
        return sumOfDigits;
    }

}
