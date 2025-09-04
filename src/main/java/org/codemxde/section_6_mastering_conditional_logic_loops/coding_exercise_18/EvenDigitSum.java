package org.codemxde.section_6_mastering_conditional_logic_loops.coding_exercise_18;

public class EvenDigitSum {

    // write code here
    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;
        int evenSum = 0;
        while(number > 0) {
            int digit = number % 10;
            evenSum += digit % 2 == 0 ? digit : 0;
            number /= 10;
        }
        return evenSum;
    }
}
