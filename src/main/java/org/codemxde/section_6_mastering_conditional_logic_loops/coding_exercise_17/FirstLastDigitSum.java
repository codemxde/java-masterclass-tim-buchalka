package org.codemxde.section_6_mastering_conditional_logic_loops.coding_exercise_17;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println("Sum: " + sumFirstAndLastDigit(101));
    }

    // write code here
    public static int sumFirstAndLastDigit(int number) {
        // handling edge cases
        if (number < 0) return -1;
        if (number / 10 == 0) return number * 2;

        int lastDigit = number % 10;

        int reverse = 0;
        while (number > 0) {
            int digitAtEnd = number % 10;
            reverse = (reverse * 10) + digitAtEnd;

            number /= 10;
        }

        int firstDigit = reverse % 10;

        return firstDigit + lastDigit;
    }
}
